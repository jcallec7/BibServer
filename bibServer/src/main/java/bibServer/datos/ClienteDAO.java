package bibServer.datos;

import java.util.List;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.Query;

//import bibServer.modelo.Autor;
import bibServer.modelo.Cliente;

@Stateless
public class ClienteDAO {
	
	@Inject
	private EntityManager em;
	
	public void insert(Cliente cliente) {
		em.persist(cliente);
		
	}
	
	public void update(Cliente cliente) {
		em.merge(cliente);
		
	}
	
	public void remove(int id) {
		
		Cliente cliente = this.read(id);
		
		em.remove(cliente);
		
	}
	
	public Cliente read(int id) {
		
		Cliente a = em.find(Cliente.class, id);
		
		return null;
		
	}
	
	public List<Cliente> getClientes() {
		
		String jpql = "SELECT c FROM Cliente c";
		Query q = em.createQuery(jpql, Cliente.class);
		
		List<Cliente> clientes = q.getResultList();	
		
		return clientes;
	}
	
	public List<Cliente> getClientesXNombre(String filtro){
		String jpql = "SELECT a FROM Cliente a WHERE bib_cli_nombre LIKE ?1";
		Query q = em.createQuery(jpql, Cliente.class);
		q.setParameter(1, "%" + filtro + "%");
		
		List<Cliente> clientes = q.getResultList();
		
		return clientes;
	}

}

