package br.lucas.springproject.Spring.Project.repositories;

import br.lucas.springproject.Spring.Project.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
