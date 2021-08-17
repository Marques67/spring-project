package br.lucas.springproject.Spring.Project.services;

import br.lucas.springproject.Spring.Project.entities.Order;
import br.lucas.springproject.Spring.Project.repositories.OrderRepository;
import br.lucas.springproject.Spring.Project.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderService {

    @Autowired
    private OrderRepository repository;

    public List<Order> findAll() {
        return repository.findAll();
    }

    public Order findById(Long id) {
        Optional<Order> obj = repository.findById(id);
        return obj.get();
    }
}
