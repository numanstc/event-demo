package com.numanstc.emailevent.service;

import com.numanstc.emailevent.entity.User;
import com.numanstc.emailevent.event.MailSendCreatedEvent;
import com.numanstc.emailevent.repositoy.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;
    private final ApplicationEventPublisher applicationEventPublisher;

    public User saveUser(User user) {

        User savedUser = userRepository.save(user);

        applicationEventPublisher.publishEvent(new MailSendCreatedEvent(user));

        return savedUser;

    }
}
