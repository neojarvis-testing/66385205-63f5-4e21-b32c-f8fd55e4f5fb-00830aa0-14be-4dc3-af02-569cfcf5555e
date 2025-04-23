// package utils;

// import jakarta.mail.*;
// import jakarta.mail.internet.*;
// import java.io.File;
// import java.util.Properties;
// public class Email {
//    public void sendEmail(String toEmail, String subject, String messageText, String attachmentPath) {
//        final String fromEmail = "ragunathsai22@gmail.com"; // change to your email
//        final String password = "caxn mrip awzp xczs"; // use App Password if 2FA is on
//        Properties props = new Properties();
//        props.put("mail.smtp.auth", "true");
//        props.put("mail.smtp.starttls.enable", "true");
//        props.put("mail.smtp.host", "smtp.gmail.com");
//        props.put("mail.smtp.port", "587");
//        Session session = Session.getInstance(props, new jakarta.mail.Authenticator() {
//            protected PasswordAuthentication getPasswordAuthentication() {
//                return new PasswordAuthentication(fromEmail, password);
//            }
//        });
//        try {
//            Message message = new MimeMessage(session);
//            message.setFrom(new InternetAddress(fromEmail));
//            message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(toEmail));
//            message.setSubject(subject);
//            // Text part
//            MimeBodyPart messageBodyPart = new MimeBodyPart();
//            messageBodyPart.setText(messageText);
//            // Attachment part
//            MimeBodyPart attachmentPart = new MimeBodyPart();
//            attachmentPart.attachFile(new File(attachmentPath));
//            // Combine parts
//            Multipart multipart = new MimeMultipart();
//            multipart.addBodyPart(messageBodyPart);
//            multipart.addBodyPart(attachmentPart);
//            message.setContent(multipart);
//            Transport.send(message);
//            System.out.println("Email sent with attachment.");
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
// }