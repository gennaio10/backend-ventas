package com.ventas.ventas.controller;

import com.ventas.ventas.model.DetalleVenta;
import com.ventas.ventas.service.DetalleVentaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api/detallesventa")
public class DetalleVentaController {

    @Autowired
    private DetalleVentaService detalleVentaService;

    @GetMapping
    public ResponseEntity<List<DetalleVenta>> findAll() {
        return ResponseEntity.ok(detalleVentaService.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<DetalleVenta> findById(@PathVariable("id") Integer id) {
        return detalleVentaService.findById(id)
                .map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<DetalleVenta> create(@Valid @RequestBody DetalleVenta detalleVenta) {
        return new ResponseEntity<>(detalleVentaService.create(detalleVenta), HttpStatus.CREATED);
    }

    @PutMapping
    public ResponseEntity<DetalleVenta> update(@Valid @RequestBody DetalleVenta detalleVenta) {
        return detalleVentaService.findById(detalleVenta.getIdDetalleVenta())
                .map(c -> ResponseEntity.ok(detalleVentaService.update(detalleVenta)))
                .orElseGet(() -> ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<DetalleVenta> delete(@PathVariable("id") Integer id) {
        return detalleVentaService.findById(id)
                .map(c -> {
                    detalleVentaService.delete(id);
                    return ResponseEntity.ok(c);
                })
                .orElseGet(() -> ResponseEntity.notFound().build());
    }
}
