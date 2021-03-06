package com.example.demo.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.bean.Usuario;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long>{

	//SELECT * FROM usuario WHERE login = ? AND senha = ?;
	public Usuario  findOneByLoginAndSenha (String login, String senha);
	
	
}
