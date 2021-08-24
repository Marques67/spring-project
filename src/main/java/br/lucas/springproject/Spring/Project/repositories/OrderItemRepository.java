package br.lucas.springproject.Spring.Project.repositories;

import br.lucas.springproject.Spring.Project.entities.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
}