package bibServer.negocio;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;

import bibServer.datos.AutorDAO;
import bibServer.modelo.Autor;
import java.util.ArrayList;

@Stateless
public class GestionAutores implements GestionAutoresRemote, GestionAutoresLocal {
	
	@Inject
	private AutorDAO dao;

	private List<Autor> autores = new ArrayList<Autor>();
	
	public void guardarAutor(int id, String nombre, String apellido, String genero, String fechaNac, String nacionalidad){
		Autor a = new Autor();  
		a.setId(id);  
		a.setNombre(nombre);
		a.setApellido(apellido);
		a.setGenero(genero);
		a.setFechaNac(fechaNac);
		a.setNacionalidad(nacionalidad);
		System.out.println(a);
		dao.insert(a);
	}
	
	public List<Autor> getAutores(){
		System.out.println(autores);
		return dao.getAutores();
	}
	
	public List<Autor> getAutoresPorNombre(String filtro){
		
		return dao.getAutoresXNombre(filtro);
	}

	
}
