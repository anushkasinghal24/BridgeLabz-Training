package com.bridgelabz.fundoo_notes_app.repository;

import com.bridgelabz.fundoo_notes_app.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
