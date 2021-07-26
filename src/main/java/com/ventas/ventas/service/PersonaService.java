package com.ventas.ventas.service;

import com.ventas.ventas.model.Persona;
import com.ventas.ventas.repository.IPersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PersonaService implements ICRUDService<Persona> {

    @Autowired
    private IPersonaRepository oIPersonaRepository;

    @Override
    public List<Persona> findAll() {
        return oIPersonaRepository.findAll();
    }

    @Override
    public Optional<Persona> findById(Integer id) {
        return oIPersonaRepository.findById(id);
    }

    @Override
    public Persona create(Persona persona) {
        return oIPersonaRepository.save(persona);
    }

    @Override
    public Persona update(Persona persona) {
        return oIPersonaRepository.save(persona);
    }

    @Override
    public void delete(Integer id) {
        oIPersonaRepository.deleteById(id);
    }
}
