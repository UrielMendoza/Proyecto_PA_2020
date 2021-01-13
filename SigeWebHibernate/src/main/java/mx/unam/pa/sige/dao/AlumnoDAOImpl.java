package mx.unam.pa.sige.dao;

import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import mx.unam.pa.sige.domain.Alumnos;

@Repository
public class AlumnoDAOImpl implements AlumnoDAO {
	/**
	 * Se indica al contexto de spring que inyecte 
	 * un bean de tipo {@link SessionFactory}
	 */
	@Autowired
    private SessionFactory sessionFactory;
	
	@Override
	public List<Alumnos> getAllAlumnos() {
		Session session = sessionFactory.getCurrentSession();
		//session.beginTransaction();
		
		CriteriaBuilder builder = session.getCriteriaBuilder();
		
		// Se indica al constructor del criterio que el resultado esperado es de tipo Usuario
		CriteriaQuery<Alumnos> criteria = builder.createQuery(Alumnos.class);
		
		/* 
		 * La raíz es la referencia al objeto mapeado, en este caso, la raíz es la referencia 
		 * al objeto Alumnos
		 */
		Root<Alumnos> root = criteria.from(Alumnos.class);
		criteria.select(root);
		
		/* 
		 * El listado de objetos devuelto getResultList() corresponde al esperado sin
		 * requerimiento de conversión adicional 
		 */
		Query<Alumnos> query = session.createQuery(criteria);
		List<Alumnos> usuarios = query.getResultList();
		
		// Commit de la transacción
		//session.getTransaction().commit();
		
		return usuarios;
	}

	@Override
	public void save(Alumnos Alumnos) {
		sessionFactory.getCurrentSession().save(Alumnos);
	}

	@Override
	public Alumnos getAlumnos(Integer idAlumno) {
		return sessionFactory.getCurrentSession().get(Alumnos.class, idAlumno);
	}

}
