package com.anioranzas.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.anioranzas.model.Usuarios;

@Repository
public interface UsuariosRepository extends JpaRepository<Usuarios, Long> {

}
