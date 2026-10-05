package com.studentmanagement.notificationservice;

import org.springframework.stereotype.Service;

@Service
public class SmsNS implements NotificationService{
    @Override
    public void send(String message){
        System.out.println("SMS sent");
    }
}
