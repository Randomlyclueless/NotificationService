package com.studentmanagement.notificationservice;

import org.springframework.stereotype.Service;

@Service
public class NotificationManager {
    private NotificationService NS;

    public NotificationManager(NotificationService NS){
        this.NS = NS;
    }

    public void sendNotification(String message){
        NS.send(message);
    }
}
