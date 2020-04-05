import React, { useState, useEffect } from 'react';
import './App.css';
import { getAllStudents } from './client';

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

  if(studenst && studenst.length){
    return (
      <div>
      {/* <h1>Hello World Spring Boot & React</h1>
      <button onClick={fetchStudents}>Get Students</button> */}
      <div>
        {
          studenst.map(({studentId, firsName, lastName, email, gender}) => {
            return (
              <div key={studentId}>
                <div>{firsName}</div>
                <div>{lastName}</div>
                <div>{email}</div>
                <div>{gender}</div>
              </div>
              )
          })
        }
      </div>
    </div>
    )
  }

  return "No Students found";
}

export default App;
