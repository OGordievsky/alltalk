package ru.forgottendev.alltalk.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.forgottendev.alltalk.domain.Message;

public interface MessageRepo extends JpaRepository<Message, Long> {
}
