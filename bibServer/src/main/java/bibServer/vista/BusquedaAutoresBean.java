package bibServer.vista;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.inject.Inject;

import bibServer.modelo.Autor;
import bibServer.negocio.GestionAutoresLocal;

@ManagedBean
public class BusquedaAutoresBean {
	
	@Inject
	private GestionAutoresLocal gl;

	private String filtro;
	private List<Autor> autores;
	
	public String getFiltro() {
		return filtro;
	}
	public void setFiltro(String filtro) {
		this.filtro = filtro;
	}
	public List<Autor> getAutores() {
		return autores;
	}
	public void setAutores(List<Autor> autores) {
		this.autores = autores;
	}
	
	public String buscar() {
		
		autores = gl.getAutoresPorNombre(filtro);
		return null;
	}
	
}
