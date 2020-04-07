import React, { useState, useEffect } from 'react';
import './App.css';
import { getAllStudents } from './client';
import Container from './Container';
import Footer from './Footer';
import AddStudentForm from './forms/AddStudentForm';
import {
  Table,
  Avatar,
  Spin,
  Modal,
  Empty
} from 'antd';
import { errorNotification } from './Notification';
import { LoadingOutlined } from '@ant-design/icons';

const antIcon = () => <LoadingOutlined style={{ fontSize: 24 }} spin />;

function App() {

  const [studenst, setStudenst] = useState([]);
  const [isFetching, setFetching] = useState(false);
  const [isAddStudentModalVisible, setModalVisible] = useState(false);

  useEffect(() => {
    fetchStudents();
  }, [])

  const fetchStudents = () => {
    setFetching(true);
    getAllStudents()
      .then(res => res.json())
      .then(students => {
        console.log(students);
        setStudenst(students);
        setFetching(false);
      })
      .catch(error => {
          console.log(error.error.message);
          const message = error.error.message;
          const description = error.error.error;
          errorNotification(message, description);
          setFetching(false);
      });
  }

// Modal
 const openModalStudent = () => setModalVisible(true);
 const closeModalStudent = () => setModalVisible(false);

  const comminElement = () => (
    <>
      <Modal 
        title='Add new student'
        visible={isAddStudentModalVisible}
        onOk={closeModalStudent}
        onCancel={closeModalStudent}
        width={1000}
        >
      <AddStudentForm onSuccess={() => { 
        closeModalStudent();
        fetchStudents();
      }}/>
      </Modal>
      <Footer numberOfStudents={studenst.length} openModal={openModalStudent} />
      </>
  );

  if(isFetching) {
    return (
      <Container>
        <Spin indicator={antIcon()} />
      </Container>
    )
  }

  if(studenst && studenst.length){

    const columns = [
      {
        title: '',
        key: 'avatar',
        render: (text, student) => {
          return (
            <Avatar size="large">
            {`${student.firsName.charAt(0).toUpperCase()} ${student.lastName.charAt(0).toUpperCase()}`}
          </Avatar>
          )
        }
      },
      {
        title: 'Student Id',
        dataIndex: 'studentId',
        key: 'studentId'
      },
      {
        title: 'FirsName',
        dataIndex: 'firsName',
        key: 'firsName',
      },
      {
        title: 'LastName',
        dataIndex: 'lastName',
        key: 'lastName',
      },
      {
        title: 'Email',
        dataIndex: 'email',
        key: 'email',
      },
       {
        title: 'Gender',
        dataIndex: 'gender',
        key: 'gender',
      }
    ];

    return (
      <Container>
        <Table 
          dataSource={studenst} 
          columns={columns}
          pagination={false}
          
          rowKey="studentId"
        />
       {comminElement()}
      </Container>
    )
  }

  return (
    <Container>
      <Empty description={
        <h1>No Stidents found</h1>
      }/>
       {comminElement()}
    </Container>
  );
}

export default App;
