import React from 'react';
import { Formik } from 'formik';
import { Input, Button, Tag } from 'antd';
import { addNewStudent } from '../client';

const inputBottomMargin = {marginBottom: '10px'};
const tagStyle = {backgroundColor: '#f50', color: 'white', ...inputBottomMargin}

const AddStudentForm = () => (
    <div>
    <h1>Anywhere in your app!</h1>
    <Formik
      initialValues={{ firsName: '', lastName: '', email: '', gender: '' }}
      validate={values => {
        const errors = {};
        
        if(!values.firsName){
            errors.firsName = 'First Name Required';
        }

        if(!values.lastName){
            errors.lastName = 'Last Name Required';
        }

        if (!values.email) {
          errors.email = 'Required';
        } else if (
          !/^[A-Z0-9._%+-]+@[A-Z0-9.-]+\.[A-Z]{2,}$/i.test(values.email)
        ) {
          errors.email = 'Invalid email address';
        }

        if(!values.gender){
            errors.gender = 'Gender Required'
        } else if(!['MALE', 'male', 'FEMALE', 'female'].includes(values.gender)) {
            errors.gender = 'Gender must be (MALE, male, FEMALE, female)';
        }
      
        return errors;
      }}
      onSubmit={(student, { setSubmitting }) => {
        setTimeout(() => {
          addNewStudent(student).then(() => {
            alert(JSON.stringify(student));
            setSubmitting(false);
          });
        }, 400);
      }}
    >
      {({
        values,
        errors,
        touched,
        handleChange,
        handleBlur,
        handleSubmit,
        isSubmitting,
        submitForm,
        isValid
        /* and other goodies */
      }) => (
        <form onSubmit={handleSubmit}>

          <Input
            style={inputBottomMargin}
            name="firsName"
            onChange={handleChange}
            onBlur={handleBlur}
            value={values.firsName}
            placeholder='First Name. E.g John'
          />
          {errors.firsName && touched.firsName && <Tag style={tagStyle}>{errors.firsName}</Tag>}

          <Input
            style={inputBottomMargin}
            name="lastName"
            onChange={handleChange}
            onBlur={handleBlur}
            value={values.lastName}
            placeholder='Last Name. E.g John'
          />
          {errors.lastName && touched.lastName && <Tag style={tagStyle}>{errors.lastName}</Tag>}

          <Input
            style={inputBottomMargin}
            name="email"
            type="email"
            onChange={handleChange}
            onBlur={handleBlur}
            value={values.email}
            placeholder='Email E.g example@gmail.com'
          />
          {errors.email && touched.email && <Tag style={tagStyle}>{errors.email}</Tag>}

          <Input
            name="gender"
            style={inputBottomMargin}
            onChange={handleChange}
            onBlur={handleBlur}
            value={values.gender}
            placeholder='Gender. E.g John'
          />
          {errors.gender && touched.gender && <Tag style={tagStyle}>{errors.gender}</Tag>}

          <Button 
            onClick={() => submitForm()} 
            type="submit" 
            disabled={isSubmitting | (touched && !isValid)}>
            Submit
          </Button>
        </form>
      )}
    </Formik>
  </div>
)

export default AddStudentForm;
