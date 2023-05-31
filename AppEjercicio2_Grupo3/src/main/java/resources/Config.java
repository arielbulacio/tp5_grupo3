package resources;

import entidad.Usuario;
import negocio.UsuarioNegocio;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {

    @Bean(initMethod = "initUsuario", destroyMethod = "destroyUsuario")
    public Usuario usuario() {
        Usuario usuario = new Usuario();
        usuario.setUsuario("Pepe");
        usuario.setContrasenia("123");
        return usuario;
    }

    @Bean
    public UsuarioNegocio usuarioNegocio() {
        return new UsuarioNegocio();
    }

}
