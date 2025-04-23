package utils;
 
import java.util.Properties;
import javax.mail.*;
import javax.mail.internet.*;
import javax.activation.*;
 
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
 
public class Email {
    public static void sendEmail() {
        Properties props = new Properties();
        props.put("mail.smtp.host", "smtp.gmail.com");
        props.put("mail.smtp.port", "587");
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");
        Session session = Session.getInstance(props, new javax.mail.Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication("ajtheking134@gmail.com", "ajay1342003");
            }
        });
 
        try {
            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress("ajtheking134@gmail.com"));
            message.setRecipients(Message.RecipientType.TO, InternetAddress.parse("praka369258@gmail.com"));
            message.setSubject("Automated Test Report");
 
            BodyPart messageBodyPart = new MimeBodyPart();
            messageBodyPart.setText("Please find the attached test report.");
 
            Multipart multipart = new MimeMultipart();
            multipart.addBodyPart(messageBodyPart);
 
            messageBodyPart = new MimeBodyPart();
            String filename = System.getProperty("user.dir") + "/reports/FNP_Report.html";
            DataSource source = new FileDataSource(filename);
            messageBodyPart.setDataHandler(new DataHandler(source));
            messageBodyPart.setFileName(filename);
            multipart.addBodyPart(messageBodyPart);
 
            message.setContent(multipart);
 
            Transport.send(message);
 
            System.out.println("Email sent successfully.");
 
        } catch (MessagingException e) {
            e.printStackTrace();
        }
 
    }
}