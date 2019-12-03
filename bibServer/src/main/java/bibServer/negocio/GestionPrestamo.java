package bibServer.negocio;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;

import bibServer.datos.PrestamoDAO;
import bibServer.modelo.Cliente;
import bibServer.modelo.Libro;
import bibServer.modelo.Prestamo;

@Stateless
public class GestionPrestamo implements GestionPrestamoRemote, GestionPrestamoLocal {
	
	@Inject
	private PrestamoDAO dao;
	
	private List<Prestamo> prestamos = new ArrayList<Prestamo>();
	
	public void guardarPrestamo(String codigo, Cliente clientes, Libro libros){
		Prestamo p = new Prestamo();  
		p.setBib_prest_id(codigo);  
		
		List<Cliente> aux1 = new ArrayList<>();
		aux1.add(clientes);
		p.setLib_cliente(aux1);
		
		List<Libro> aux = new ArrayList<>();
		aux.add(libros);
		p.setLib_libro(aux);
		
		System.out.println(p);
		dao.insert(p);
	}

	public List<Prestamo> getPrestamo(){
		System.out.println(prestamos);
		return dao.getPrestamos();
	}
	
	public List<Prestamo> getprestamoPorId(String filtro){
		
		return dao.getClientesPorId(filtro);
	}
	
	
	

}
