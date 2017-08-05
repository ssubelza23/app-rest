package com.anioranzas.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.anioranzas.model.Empleado;
@Repository
public interface EmpleadoRepo extends JpaRepository<Empleado, Long> {

}
