package ru.web_lab4.auth;

import lombok.NonNull;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findApplicationUserByLogin(@NonNull String login);
}
