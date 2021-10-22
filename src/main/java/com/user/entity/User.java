package com.user.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private int id;
    @NotBlank(message = "Please enter the name")
    private String name;
    @NotBlank(message = "Please enter the email address")
    private String email;
    @NotBlank(message = "Please enter the phone number")
    private String phone;
    @NotBlank(message = "Please enter the username")
    private String username;
    @NotBlank(message = "Please enter the password")
    private String password;
}
