package DIP_Java;

public class Main {
    public static void main(String[] args) {
        EmailService emailService = new EmailService("example@example.example");

        new Notification(emailService).notify("Welcome to SOLID");
    }
}
