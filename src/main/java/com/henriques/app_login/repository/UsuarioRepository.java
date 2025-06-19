package com.henriques.app_login.repository;

import com.henriques.app_login.model.Usuario;
import org.springframework.data.repository.CrudRepository;

public interface UsuarioRepository extends CrudRepository<Usuario, String> {
    Usuario findById(Long id);
}
