package com.anioranzas.service;

import com.anioranzas.model.Usuarios;

public interface UsuarioSevice {

	Usuarios save(Usuarios usuarios);
	Usuarios getById(int CodUsuario);
}
