package br.lucas.springproject.Spring.Project.repositories;

import br.lucas.springproject.Spring.Project.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
