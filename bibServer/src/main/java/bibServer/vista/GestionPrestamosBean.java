package bibServer.vista;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.inject.Inject;

import bibServer.modelo.Cliente;
import bibServer.modelo.Libro;
import bibServer.modelo.Prestamo;
import bibServer.negocio.GestionClientesLocal;
import bibServer.negocio.GestionLibrosLocal;
import bibServer.negocio.GestionPrestamoLocal;


@ManagedBean
public class GestionPrestamosBean {
	
	@Inject
	private GestionLibrosLocal gl;
	
	@Inject
	private GestionClientesLocal gc;
	
	private GestionPrestamoLocal gp;
	
	private String codigo;
	
	private List<Cliente> cliente;
	private List<Libro> libros;
	
	private Cliente clienteSeleccionado;
	private Libro libroSeleccionado;

	private List<Prestamo> prestamos;
	

	@PostConstruct
	public void init() {
		listarPrestamos();
	}
	

	public Cliente getClienteSeleccionado() {
		return clienteSeleccionado;
	}





	public void setClienteSeleccionado(Cliente clienteSeleccionado) {
		this.clienteSeleccionado = clienteSeleccionado;
	}





	public Libro getLibroSeleccionado() {
		return libroSeleccionado;
	}





	public void setLibroSeleccionado(Libro libroSeleccionado) {
		this.libroSeleccionado = libroSeleccionado;
	}





	public List<Cliente> getCliente() {
		return cliente;
	}





	public void setCliente(List<Cliente> cliente) {
		this.cliente = cliente;
	}





	public String getCodigo() {
		return codigo;
	}





	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}




	public GestionLibrosLocal getGl() {
		return gl;
	}




	public void setGl(GestionLibrosLocal gl) {
		this.gl = gl;
	}




	public GestionClientesLocal getGc() {
		return gc;
	}




	public void setGc(GestionClientesLocal gc) {
		this.gc = gc;
	}




	public List<Libro> getLibros() {
		return libros;
	}




	public void setLibros(List<Libro> libros) {
		this.libros = libros;
	}

	public void listarLibros() {
		this.libros = this.gl.getLibros();
	}
	
	public void listarClientes() {
		this.cliente = this.gc.getClientes();
	}
	
	
	
	
	public List<Prestamo> getPrestamos() {
		return prestamos;
	}





	public void setPrestamos(List<Prestamo> prestamos) {
		this.prestamos = prestamos;
	}





	public void listarPrestamos() {
		this.prestamos = this.gp.getPrestamo();
	}
	
	
	public String guardarPrestamo() {
		gp.guardarPrestamo(codigo, clienteSeleccionado, libroSeleccionado);
		prestamos = gp.getPrestamo();
		
		return "Prestamos";
	}
	
	
	

}
