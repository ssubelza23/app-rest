package com.anioranzas.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.anioranzas.model.Usuarios;
import com.anioranzas.repository.UsuariosRepository;

@Service
public class UsuarioServiceImpl implements UsuarioSevice {
	@Autowired
	UsuariosRepository usuarioRepository;
	@Override
	public Usuarios save(Usuarios usuarios) {
		return usuarioRepository.save(usuarios);
	}

	@Override
	public Usuarios getById(int CodUsuario) {
		return usuarioRepository.findOne((long) CodUsuario);
	}

}
