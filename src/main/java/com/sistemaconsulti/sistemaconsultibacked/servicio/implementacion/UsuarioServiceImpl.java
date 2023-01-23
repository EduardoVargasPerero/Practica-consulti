package com.sistemaconsulti.sistemaconsultibacked.servicio.implementacion;

import com.sistemaconsulti.sistemaconsultibacked.modelo.Usuario;
import com.sistemaconsulti.sistemaconsultibacked.modelo.UsuarioRol;
import com.sistemaconsulti.sistemaconsultibacked.repositorio.RolRepository;
import com.sistemaconsulti.sistemaconsultibacked.repositorio.UsuarioRepository;
import com.sistemaconsulti.sistemaconsultibacked.servicio.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class UsuarioServiceImpl implements UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @Autowired
    private RolRepository rolRepository;

    @Override
    public Usuario guardarUsuario(Usuario usuario, Set<UsuarioRol> usuarioRoles) throws Exception {

        Usuario usuariolocal = usuarioRepository.findByUsername(usuario.getUsername());

        if (usuariolocal != null) {
            System.out.println("El usuario ya existe");
            throw new Exception("El usuario ya existe");
        } else {
            for (UsuarioRol usuarioRol : usuarioRoles) {
                rolRepository.save(usuarioRol.getRol());
            }
            usuario.getUsuarioRoles().addAll(usuarioRoles);
            usuariolocal = usuarioRepository.save(usuario);
        }
        return usuariolocal;
    }

    @Override
    public Usuario obtenerUsuario(String username) {
        return usuarioRepository.findByUsername(username);
    }

    @Override
    public void eliminarUsuario(Long UsuarioId) {
        usuarioRepository.deleteById(UsuarioId);
    }
}
