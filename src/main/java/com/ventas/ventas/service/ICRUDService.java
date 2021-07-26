package com.ventas.ventas.service;

import java.util.List;
import java.util.Optional;

public interface ICRUDService<T> {

    List<T> findAll();

    Optional<T> findById(Integer id);

    T create (T modelo);

    T update (T modelo);

    void delete (Integer id);
}
