package br.lucas.springproject.Spring.Project.repositories;

import br.lucas.springproject.Spring.Project.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
