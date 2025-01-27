package principal;

import entidad.Usuario;
import negocio.UsuarioNegocio;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import resources.Config;

public class Main {

	public static void main(String[] args) {

		ApplicationContext appContext = new AnnotationConfigApplicationContext(Config.class);

		Usuario usuario = (Usuario)appContext.getBean("usuario");
		System.out.println(usuario);

		UsuarioNegocio usuarioNegocio = (UsuarioNegocio)appContext.getBean("usuarioNegocio");
		boolean estado = usuarioNegocio.agregarUsuario(usuario);

		if(estado)
			System.out.println("Se agrego correctamente");
		else
			System.out.println("No se pudo agregar, el usuario ya existe en la BD");

	}
}
