package com.ventas.ventas.repository;

import com.ventas.ventas.model.Venta;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IVentaRepository extends JpaRepository <Venta, Integer> {

}
