package com.ventas.ventas.service;

import com.ventas.ventas.model.DetalleVenta;
import com.ventas.ventas.repository.IDetalleVentaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DetalleVentaService implements ICRUDService<DetalleVenta> {

    @Autowired
    private IDetalleVentaRepository oIDetalleVentaRepository;

    @Override
    public List<DetalleVenta> findAll() {
        return oIDetalleVentaRepository.findAll();
    }

    @Override
    public Optional<DetalleVenta> findById(Integer id) {
        return oIDetalleVentaRepository.findById(id);
    }

    @Override
    public DetalleVenta create(DetalleVenta detalleventa) {
        return oIDetalleVentaRepository.save(detalleventa);
    }

    @Override
    public DetalleVenta update(DetalleVenta detalleventa) {
        return oIDetalleVentaRepository.save(detalleventa);
    }

    @Override
    public void delete(Integer id) {
        oIDetalleVentaRepository.deleteById(id);
    }
}
