package com.ventas.ventas.service;

import java.util.List;
import java.util.Optional;

import com.ventas.ventas.model.Cliente;
import com.ventas.ventas.repository.IClienteRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClienteService implements IClienteService {

    @Autowired
    private IClienteRepository oIClienteRepository;

    @Override
    public List<Cliente> findAll() {
        return oIClienteRepository.findAll();
    }

    @Override
    public Optional<Cliente> findById(Integer id) {
        return oIClienteRepository.findById(id);
    }

    @Override
    public Cliente create(Cliente cliente) {
        return oIClienteRepository.save(cliente);
    }

    @Override
    public Cliente update(Cliente cliente) {
        return oIClienteRepository.save(cliente);
    }

    @Override
    public void delete(Integer id) {
        oIClienteRepository.deleteById(id);
    }

}
