import React, { useState, useEffect } from 'react';
import './App.css';
import { getAllStudents } from './client';
import {
  Table
} from 'antd';

function App() {

  const [studenst, setStudenst] = useState([]);

  useEffect(() => {
    fetchStudents();
  }, [])

  const fetchStudents = () => {
    getAllStudents()
      .then(res => res.json())
      .then(students => {
        console.log(students);
        setStudenst(students);
    });
  }

//   studentId: "2e1df151-837a-4fe3-b277-38ba793d8782"
// firsName: "James"
// lastName: "Bond"
// email: "jamesbond@gmail.com"
// gender: "MALE"

  if(studenst && studenst.length){

    const columns = [
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
      <Table 
        dataSource={studenst} 
        columns={columns}
        rowKey="studentId"
      />
    )
  }

  return "No Students found";
}

export default App;
