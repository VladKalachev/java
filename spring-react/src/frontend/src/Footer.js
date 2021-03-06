import React from 'react';
import Container from './Container';
import { Button, Avatar } from 'antd';

const Footer = (props) => (
    <div className='footer' >
        <Container>
            {props.numberOfStudents !== undefined ? 
                <Avatar style={{ backgroundColor: '#f56a00', marginRight: '5px' }} size='large'>{props.numberOfStudents}</Avatar> : null}
            <Button type='primary' onClick={props.openModal}>Add new student +</Button>
        </Container>
    </div>
);

export default Footer;