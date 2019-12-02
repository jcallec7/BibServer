package bibServer.datos;

import java.util.List;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import bibServer.modelo.Libro;

@Stateless
public class LibroDAO {
	
	@Inject
	private EntityManager em;
	
	public void insert(Libro libro) {
		em.persist(libro);
		
	}
	
	public void update(Libro libro) {
		em.merge(libro);
		
	}
	
	public void remove(int id) {
		
		Libro libro = this.read(id);
		
		em.remove(libro);
		
	}
	
	public Libro read(int id) {
		
		Libro l = em.find(Libro.class, id);
		
		return null;
		
	}
	
	public List<Libro> getLibros() {
		
		String jpql = "SELECT l FROM Libro l";
		Query q = em.createQuery(jpql, Libro.class);
		
		List<Libro> libros = q.getResultList();		
		
		return libros;
	}
	
	public List<Libro> getLibrosXNombre(String filtro){
		String jpql = "SELECT l FROM Libro l WHERE bib_lib_nombre LIKE ?1";
		Query q = em.createQuery(jpql, Libro.class);
		q.setParameter(1, "%" + filtro + "%");
		
		List<Libro> libros = q.getResultList();
		
		return libros;
	}

}

