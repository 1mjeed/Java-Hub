
package com.gym.services;

import java.util.Properties;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class EmailSender {

    private static final String MY_EMAIL = "mj.naser2005@gmail.com";
    private static final String MY_PASSWORD = "sdgr luds tnek lwmu"; // حط كود الـ App Password الـ 16 حرف هنا
   
    public static void sendEmail(String recipientEmail, String subject, String messageBody) {

        Properties prop = new Properties();
        prop.put("mail.smtp.host", "smtp.gmail.com");
        prop.put("mail.smtp.port", "465");
        prop.put("mail.smtp.auth", "true");
        prop.put("mail.smtp.socketFactory.port", "465");
        prop.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
        prop.put("mail.smtp.socketFactory.fallback", "false");

        // ✅✅✅ هذا هو السطر السحري لحل مشكلة PKIX Error
        // معناه: ثقي في كل السيرفرات ولا تدققي على الشهادات
        prop.put("mail.smtp.ssl.trust", "*");
        // ---------------------------------------------------

        Session session = Session.getInstance(prop,
                new javax.mail.Authenticator() {
            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(MY_EMAIL, MY_PASSWORD);
            }
        });

        try {
            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress(MY_EMAIL));
            message.setRecipients(
                    Message.RecipientType.TO,
                    InternetAddress.parse(recipientEmail)
            );
            message.setSubject(subject);
            message.setText(messageBody);

            Transport.send(message);

            System.out.println(" Email Sent Successfully to: " + recipientEmail);

        } catch (MessagingException e) {
            e.printStackTrace();  
            System.err.println(" فشل إرسال الإيميل: " + e.getMessage());
        }
    }
}
