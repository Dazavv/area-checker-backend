package ru.web_lab4.auth;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@Table(name = "app_user")

public class User {
    @Id
    @GeneratedValue
    private Long id;

    @NotNull
    @NotBlank
    @Column(unique = true)
    private String login;

    @NotNull
    @NotBlank
    private String password;

    @NotNull
    @NotBlank
    private String salt;

    public User(String login, String password, String salt) {
        this.login = login;
        this.password = password;
        this.salt = salt;
    }
}
