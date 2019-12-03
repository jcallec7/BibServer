package bibServer.datos;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.Query;

import bibServer.modelo.Prestamo;

@Stateless
public class PrestamoDAO {
	
	@Inject
	private EntityManager em;
	
	public void insert(Prestamo prestamo) {
		em.persist(prestamo);
		
	}
	
	public void update(Prestamo prestamo) {
		em.merge(prestamo);
		
	}
	
	public void remove(int id) {
		
		Prestamo prestamo = this.read(id);
		
		em.remove(prestamo);
		
	}
	
	public Prestamo read(int id) {
		
		Prestamo p = em.find(Prestamo.class, id);
		
		return null;
		
	}
	
	public List<Prestamo> getPrestamos() {
		
		String jpql = "SELECT p FROM Prestamo p";
		Query q = em.createQuery(jpql, Prestamo.class);
		
		List<Prestamo> prestamos = q.getResultList();	
		
		return prestamos;
	}
	
	public List<Prestamo> getClientesPorId(String filtro){
		String jpql = "SELECT a FROM Prestamo a WHERE bib_prest_id LIKE ?1";
		Query q = em.createQuery(jpql, Prestamo.class);
		q.setParameter(1, "%" + filtro + "%");
		
		List<Prestamo> prestamos = q.getResultList();
		
		return prestamos;
	}

}
