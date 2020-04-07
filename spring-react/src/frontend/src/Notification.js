import React from 'react';
import { notification } from 'antd';

const openNotification= (type, message, desciption) => {
    notification[type]({
        message,
        desciption
    });
};

export const successNotification = (message, desciption) =>
    openNotification('sucess', message, desciption);

export const infoNotification = (message, desciption) =>
    openNotification('info', message, desciption);

export const warningNotification = (message, desciption) =>
    openNotification('warning', message, desciption);

export const errorNotification = (message, desciption) =>
    openNotification('error', message, desciption);