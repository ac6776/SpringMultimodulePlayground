package com.example.springplaygroundnew.services;

import com.example.springplaygroundnew.entity.Client;
import com.example.springplaygroundnew.repo.ClientRepo;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class ClientService implements BaseService<Client> {
        private ClientRepo repo;

        @Override
        public Client save(Client entity) {
                return repo.save(entity);
        }

        @Override
        public Client findById(Long id) {
                return repo.findById(id).orElse(null);
        }

        @Override
        public List<Client> findAll() {
                return (List<Client>) repo.findAll();
        }
}
