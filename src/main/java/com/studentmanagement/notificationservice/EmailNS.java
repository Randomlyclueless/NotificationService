package com.studentmanagement.notificationservice;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
@Primary
public class EmailNS implements NotificationService {
    @Override
    public void send(String message){
        System.out.println("message sent using Email");
    }
}
