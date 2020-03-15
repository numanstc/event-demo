package com.numanstc.emailevent.event.listener;

import com.numanstc.emailevent.event.MailSendCreatedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

@Component
public class MailEventListener {

    @EventListener
    @Async
    public void mailSendEventHandler(MailSendCreatedEvent mailSendEvent) {

        System.out.println("Eventlistener -> " + mailSendEvent.getSource().toString());
        //TODO use send mail application
    }
}
