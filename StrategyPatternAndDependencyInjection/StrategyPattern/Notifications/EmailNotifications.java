package StrategyPattern.Notifications;

public class EmailNotifications implements Notifications{
    public void sendNotification() {
        System.out.println("Sending confirmation email to user...");
    }
}

