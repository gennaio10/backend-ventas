package com.ventas.ventas.controller;

import com.ventas.ventas.model.Venta;
import com.ventas.ventas.service.VentaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api/ventas")
public class VentaController {

    @Autowired
    private VentaService ventaService;

    @GetMapping
    public ResponseEntity<List<Venta>> findAll() {
        return ResponseEntity.ok(ventaService.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Venta> findById(@PathVariable("id") Integer id) {
        return ventaService.findById(id)
                .map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<Venta> create(@Valid @RequestBody Venta venta) {
        return new ResponseEntity<>(ventaService.create(venta), HttpStatus.CREATED);
    }

    @PutMapping
    public ResponseEntity<Venta> update(@Valid @RequestBody Venta venta) {
        return ventaService.findById(venta.getIdVenta())
                .map(c -> ResponseEntity.ok(ventaService.update(venta)))
                .orElseGet(() -> ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Venta> delete(@PathVariable("id") Integer id) {
        return ventaService.findById(id)
                .map(c -> {
                    ventaService.delete(id);
                    return ResponseEntity.ok(c);
                })
                .orElseGet(() -> ResponseEntity.notFound().build());
    }
}
