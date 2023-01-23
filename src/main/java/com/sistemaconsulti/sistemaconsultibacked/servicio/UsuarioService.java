package com.sistemaconsulti.sistemaconsultibacked.servicio;

import com.sistemaconsulti.sistemaconsultibacked.modelo.Usuario;
import com.sistemaconsulti.sistemaconsultibacked.modelo.UsuarioRol;

import java.util.Set;

public interface UsuarioService {

    public Usuario guardarUsuario(Usuario usuario, Set<UsuarioRol> usuarioRoles) throws Exception;

    public Usuario obtenerUsuario(String username);

    public void eliminarUsuario(Long UsuarioId);
}
