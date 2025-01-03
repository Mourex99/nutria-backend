package com.nutria.nutria_backend.repository;

import com.nutria.nutria_backend.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    // Definindo a consulta personalizada para encontrar um usuário pelo email
    User findByEmail(String email);
}