package com.ventas.ventas.service;

import com.ventas.ventas.model.Producto;
import com.ventas.ventas.repository.IProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductoService implements ICRUDService<Producto> {

    @Autowired
    private IProductoRepository oIProductoRepository;

    @Override
    public List<Producto> findAll() {
        return oIProductoRepository.findAll();
    }

    @Override
    public Optional<Producto> findById(Integer id) {
        return oIProductoRepository.findById(id);
    }

    @Override
    public Producto create(Producto producto) {
        return oIProductoRepository.save(producto);
    }

    @Override
    public Producto update(Producto producto) {
        return oIProductoRepository.save(producto);
    }

    @Override
    public void delete(Integer id) {
        oIProductoRepository.deleteById(id);
    }
}
