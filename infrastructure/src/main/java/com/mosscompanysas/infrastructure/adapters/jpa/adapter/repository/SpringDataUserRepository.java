package com.mosscompanysas.infrastructure.adapters.jpa.adapter.repository;

import com.mosscompanysas.infrastructure.adapters.jpa.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface SpringDataUserRepository extends JpaRepository<User, Long> {

    Optional<User> findByEmail(String email);
}
