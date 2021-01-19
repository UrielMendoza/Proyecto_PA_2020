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

import mx.unam.pa.sige.model.Asistencias;

@Repository
public class AsistenciasDAOImpl implements AsistenciasDAO{
	
	@Autowired
    private SessionFactory sessionFactory;
	
	@Override
	public List<Asistencias> getAllAsistencias() {
		Session session = sessionFactory.getCurrentSession();
		//session.beginTransaction();
		
		CriteriaBuilder builder = session.getCriteriaBuilder();
		
		// Se indica al constructor del criterio que el resultado esperado es de tipo Usuario
		CriteriaQuery<Asistencias> criteria = builder.createQuery(Asistencias.class);
		
		/* 
		 * La raíz es la referencia al objeto mapeado, en este caso, la raíz es la referencia 
		 * al objeto Autor
		 */
		Root<Asistencias> root = criteria.from(Asistencias.class);
		criteria.select(root);
		
		/* 
		 * El listado de objetos devuelto getResultList() corresponde al esperado sin
		 * requerimiento de conversión adicional 
		 */
		Query<Asistencias> query = session.createQuery(criteria);
		List<Asistencias> usuarios = query.getResultList();
		
		// Commit de la transacción
		//session.getTransaction().commit();
		
		return usuarios;
	}

	@Override
	public void save(Asistencias asistencias) {
		sessionFactory.getCurrentSession().save(asistencias);
	}

	@Override
	public Asistencias getAsistencias(Integer idAsistencias) {
		return sessionFactory.getCurrentSession().get(Asistencias.class, idAsistencias);
	}
	
	@Override
	public void delete(Asistencias asistencias) {
		sessionFactory.getCurrentSession().delete(asistencias);
	}
}