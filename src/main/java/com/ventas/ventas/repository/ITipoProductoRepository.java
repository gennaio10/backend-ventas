package com.ventas.ventas.repository;

import com.ventas.ventas.model.TipoProducto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ITipoProductoRepository extends JpaRepository <TipoProducto, Integer> {

}
