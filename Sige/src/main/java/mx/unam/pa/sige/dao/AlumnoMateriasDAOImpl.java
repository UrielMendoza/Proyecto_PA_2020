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

import mx.unam.pa.sige.model.AlumnoMaterias;

@Repository
public class AlumnoMateriasDAOImpl implements AlumnoMateriasDAO{
	@Autowired
    private SessionFactory sessionFactory;
	
	@Override
	public List<AlumnoMaterias> getAllAlumnoMaterias() {
		Session session = sessionFactory.getCurrentSession();
		//session.beginTransaction();
		
		CriteriaBuilder builder = session.getCriteriaBuilder();
		
		// Se indica al constructor del criterio que el resultado esperado es de tipo Usuario
		CriteriaQuery<AlumnoMaterias> criteria = builder.createQuery(AlumnoMaterias.class);
		
		/* 
		 * La raíz es la referencia al objeto mapeado, en este caso, la raíz es la referencia 
		 * al objeto Autor
		 */
		Root<AlumnoMaterias> root = criteria.from(AlumnoMaterias.class);
		criteria.select(root);
		
		/* 
		 * El listado de objetos devuelto getResultList() corresponde al esperado sin
		 * requerimiento de conversión adicional 
		 */
		Query<AlumnoMaterias> query = session.createQuery(criteria);
		List<AlumnoMaterias> usuarios = query.getResultList();
		
		// Commit de la transacción
		//session.getTransaction().commit();
		
		return usuarios;
	}

	@Override
	public void save(AlumnoMaterias alumnoMaterias) {
		sessionFactory.getCurrentSession().save(alumnoMaterias);
	}

	@Override
	public AlumnoMaterias getAlumnoMaterias(Integer idAlumnoMaterias) {
		return sessionFactory.getCurrentSession().get(AlumnoMaterias.class, idAlumnoMaterias);
	}
}