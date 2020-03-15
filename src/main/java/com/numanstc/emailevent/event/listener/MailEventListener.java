package com.numanstc.emailevent.event.listener;

import com.numanstc.emailevent.entity.User;
import com.numanstc.emailevent.event.MailSendCreatedEvent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.event.EventListener;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.Properties;

@Component
public class MailEventListener {

    @Autowired
    private Session mailSession;

    @Value("${myApp.mail.username}")
    private String userName;

    @EventListener
    @Async
    public void mailSendEventHandler(MailSendCreatedEvent mailSendEvent) throws MessagingException {

        User user = (User) mailSendEvent.getSource();
        String nameSurname = user.getFirstName() + " " + user.getLastName();
        String to = user.getEmail();

        MimeMessage message = new MimeMessage(mailSession);
        message.setFrom(new InternetAddress(userName));
        message.setSubject("Welcome to " + nameSurname);
        message.addRecipient(Message.RecipientType.TO, new InternetAddress(to));

        message.setContent(user.toString(), "text/plain");

        Transport.send(message);
    }
}
