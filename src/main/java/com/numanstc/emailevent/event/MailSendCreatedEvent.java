package com.numanstc.emailevent.event;

import org.springframework.context.ApplicationEvent;

public class MailSendCreatedEvent extends ApplicationEvent {
    /**
     * Create a new {@code ApplicationEvent}.
     *
     * @param source the object on which the event initially occurred or with
     *               which the event is associated (never {@code null})
     */
    public MailSendCreatedEvent(Object source) {
        super(source);
    }
}
