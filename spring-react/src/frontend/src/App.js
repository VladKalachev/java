import React, { useState, useEffect } from 'react';
import './App.css';
import { getAllStudents } from './client';
import Container from './Container';
import {
  Table,
  Avatar,
  Spin,
  
} from 'antd';
import { LoadingOutlined } from '@ant-design/icons';

const antIcon = () => <LoadingOutlined style={{ fontSize: 24 }} spin />;

function App() {

  const [studenst, setStudenst] = useState([]);
  const [isFetching, setFetching] = useState(false);

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
    });
  }
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
          console.log(student);
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
      </Container>
    )
  }

  return "No Students found";
}

export default App;
