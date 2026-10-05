package com.studentmanagement.notificationservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class NotificationServiceApplication {

    public static void main(String[] args) {

        ApplicationContext context = SpringApplication.run(NotificationServiceApplication.class, args);
        NotificationManager manager = context.getBean(NotificationManager.class);

        manager.sendNotification("Your order has been placed");


    }

}
