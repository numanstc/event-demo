package com.numanstc.emailevent.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.io.Serializable;

@Getter
@Setter
@Entity
@Table(name = "users")
@ToString
public class User implements Serializable {

    @Id
    @SequenceGenerator(name = "seq_user_default", allocationSize = 1)
    @GeneratedValue(generator = "seq_user_default", strategy = GenerationType.SEQUENCE)
    private Long id;

    @Column(name = "user_name")
    private String username;

    @Column(name = "passwd")
    private String password;

    @Column(name = "firts_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    private String email;
}
