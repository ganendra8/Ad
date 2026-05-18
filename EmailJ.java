import javax.mail.*;
import javax.mail.internet.*;
import java.util.Properties;

public class EmailJ {
    public static void main(String[] args) throws Exception {

        String from = "mgrsuyog6@gmail.com";
        String password = "put your own app password or password";  // Must be App Password if 2FA enabled
        String to = "prayasbaral2765@gmail.com";

        Properties props = new Properties();
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.host", "smtp.gmail.com");
        props.put("mail.smtp.port", "587");

        Session session = Session.getInstance(props, new javax.mail.Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(from, password);
            }
        });

        Message message = new MimeMessage(session);
        message.setFrom(new InternetAddress(from));
        message.setRecipients(Message.RecipientType.TO,
                InternetAddress.parse(to));
        message.setSubject("Test Email");
        message.setText("Hello, this is a test email from JavaMail!");

        Transport.send(message);

        System.out.println("Email sent successfully!");
    }
}
