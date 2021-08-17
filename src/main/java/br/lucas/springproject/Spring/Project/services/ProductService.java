package br.lucas.springproject.Spring.Project.services;

import br.lucas.springproject.Spring.Project.entities.Product;
import br.lucas.springproject.Spring.Project.entities.User;
import br.lucas.springproject.Spring.Project.repositories.ProductRepository;
import br.lucas.springproject.Spring.Project.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    @Autowired
    private ProductRepository repository;

    public List<Product> findAll() {
        return repository.findAll();
    }

    public Product findById(Long id) {
        Optional<Product> obj = repository.findById(id);
        return obj.get();
    }
}
