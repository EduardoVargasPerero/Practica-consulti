package com.sistemaconsulti.sistemaconsultibacked;

import com.sistemaconsulti.sistemaconsultibacked.modelo.Rol;
import com.sistemaconsulti.sistemaconsultibacked.modelo.Usuario;
import com.sistemaconsulti.sistemaconsultibacked.modelo.UsuarioRol;
import com.sistemaconsulti.sistemaconsultibacked.servicio.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.HashSet;
import java.util.Set;

@SpringBootApplication
public class SistemaConsultiBackedApplication implements CommandLineRunner {

	@Autowired
	private UsuarioService usuarioService;

	public static void main(String[] args) {
		SpringApplication.run(SistemaConsultiBackedApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		/*Usuario usuario =  new Usuario();

		usuario.setNombre("Eduardo");
		usuario.setApellido("Vargas");
		usuario.setUsername("eduardo");
		usuario.setPassword("eduvp");
		usuario.setEmail("edu@vp.com");
		usuario.setTelefono("0996608235");
		usuario.setPerfil("foto.png");

		Rol rol = new Rol();
		rol.setIdrol(1L);
		rol.setNombre("ADMIN");

		Set<UsuarioRol> usuarioRoles = new HashSet<>();
		UsuarioRol usuarioRol = new UsuarioRol();
		usuarioRol.setRol(rol);
		usuarioRol.setUsuario(usuario);
		usuarioRoles.add(usuarioRol);

		Usuario usuarioGuardado = usuarioService.guardarUsuario(usuario, usuarioRoles);
		System.out.println(usuarioGuardado.getUsername());*/
	}
}
