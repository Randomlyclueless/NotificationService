# Spring Boot Notification Service

## Objective

The goal of this exercise was to implement a flexible notification system using Spring Boot's IoC (Inversion of Control) and Dependency Injection.

The system supports multiple notification channels such as:

- Email
- SMS

The main requirement is that the notification method can be changed without modifying the core logic of the `NotificationManager`.

---

## Project Structure

```text
src/main/java/com/studentmanagement/notificationservice/

├── NotificationServiceApplication.java
├── NotificationManager.java
├── NotificationService.java
├── EmailNS.java
└── SmsNS.java