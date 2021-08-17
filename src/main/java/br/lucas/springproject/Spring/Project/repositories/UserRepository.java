package br.lucas.springproject.Spring.Project.repositories;

import br.lucas.springproject.Spring.Project.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}