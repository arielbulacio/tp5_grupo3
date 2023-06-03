package negocio;

import dao.UsuarioDao;
import entidad.Usuario;

public class UsuarioNegocio {

	private UsuarioDao usuarioDao;
	
	public boolean agregarUsuario(Usuario usuario)
	{
		usuarioDao = new UsuarioDao();
		boolean existe = usuarioDao.Exist(usuario.getUsuario());
		if(existe ==false)
		{
			usuarioDao.Add(usuario);
			return true;
		}
		return false;
		
		
	}
	
     /*   public void initUsuarioNegocio() {
		System.out.println("Se inicializa bean");
	}
	
	public void destroyUsuarioNegocio() {
		System.out.println("Se cierra bean");
	}

	*/
	
}
