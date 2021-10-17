package com.user.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import javax.validation.constraints.NotBlank;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "user")

public class User {

    @Id

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
