package bibServer.negocio;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;

import bibServer.datos.ClienteDAO;
import bibServer.modelo.Autor;
import bibServer.modelo.Cliente;
import java.util.ArrayList;

@Stateless
public class GestionClientes implements GestionClientesRemote, GestionClientesLocal {
	
	@Inject
	private ClienteDAO dao;

	private List<Cliente> clientes = new ArrayList<Cliente>();
	
	public void guardarCliente(int id, String nombre, String apellido, String genero, String correo, String direccion, String fechaNac){
		Cliente c = new Cliente();  
		c.setId(id);  
		c.setNombre(nombre);
		c.setApellido(apellido);
		c.setGenero(genero);
		c.setCorreo(correo);
		c.setDireccion(direccion);
		c.setFechaNac(fechaNac);
		System.out.println(c);
		dao.insert(c);
	}
	
	public List<Cliente> getClientes(){
		System.out.println(clientes);
		return dao.getClientes();
	}
	
	public List<Cliente> getClientesPorNombre(String filtro){
		
		return dao.getClientesXNombre(filtro);
	}

	
}
