package com.ventas.ventas.service;

import com.ventas.ventas.model.Venta;
import com.ventas.ventas.repository.IVentaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class VentaService implements ICRUDService<Venta> {

    @Autowired
    private IVentaRepository oIVentaRepository;

    @Override
    public List<Venta> findAll() {
        return oIVentaRepository.findAll();
    }

    @Override
    public Optional<Venta> findById(Integer id) {
        return oIVentaRepository.findById(id);
    }

    @Override
    public Venta create(Venta venta) {
        return oIVentaRepository.save(venta);
    }

    @Override
    public Venta update(Venta venta) {
        return oIVentaRepository.save(venta);
    }

    @Override
    public void delete(Integer id) {
        oIVentaRepository.deleteById(id);
    }
}
