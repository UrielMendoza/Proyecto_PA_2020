package mx.unam.pa.sige.webapp.dao;

import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import mx.unam.pa.sige.webapp.model.Profesores;

@Repository
public class ProfesoresDAOImpl implements ProfesoresDAO {
	@Autowired
    private SessionFactory sessionFactory;
	
	@Override
	public List<Profesores> getAllProfesores() {
		Session session = sessionFactory.getCurrentSession();
		//session.beginTransaction();
		
		CriteriaBuilder builder = session.getCriteriaBuilder();
		
		// Se indica al constructor del criterio que el resultado esperado es de tipo Profesores
		CriteriaQuery<Profesores> criteria = builder.createQuery(Profesores.class);
		
		/* 
		 * La raíz es la referencia al objeto mapeado, en este caso, la raíz es la referencia 
		 * al objeto Profesores
		 */
		Root<Profesores> root = criteria.from(Profesores.class);
		criteria.select(root);
		
		/* 
		 * El listado de objetos devuelto getResultList() corresponde al esperado sin
		 * requerimiento de conversión adicional 
		 */
		Query<Profesores> query = session.createQuery(criteria);
		List<Profesores> usuarios = query.getResultList();
		
		// Commit de la transacción
		//session.getTransaction().commit();
		
		return usuarios;
	}

	@Override
	public Integer saveProfesor(Profesores profesor) {
		return (Integer) sessionFactory.getCurrentSession().save(profesor);
	}
	
	public Profesores loginProfesor(Profesores profesor) {
		Session session = sessionFactory.getCurrentSession();
		//session.beginTransaction();
		
		CriteriaBuilder builder = session.getCriteriaBuilder();
		
		// Se indica al constructor del criterio que el resultado esperado es de tipo Profesores
		CriteriaQuery<Profesores> criteria = builder.createQuery(Profesores.class);
		
		/* 
		 * La raíz es la referencia al objeto mapeado, en este caso, la raíz es la referencia 
		 * al objeto Profesores
		 */
		Root<Profesores> root = criteria.from(Profesores.class);
		criteria.select(root).where(
				builder.and(builder.equal(root.get("idProf"),profesor.getIdProf()),
							builder.equal(root.get("password"),profesor.getPassword())));
		
		/* 
		 * El listado de objetos devuelto getResultList() corresponde al esperado sin
		 * requerimiento de conversión adicional 
		 */
		Query<Profesores> query = session.createQuery(criteria);
		
		// Commit de la transacción
		//session.getTransaction().commit();
		
		return query.uniqueResult();
	}

	@Override
	public Profesores getProfesores(Integer idProf ) {
		return sessionFactory.getCurrentSession().get(Profesores.class, idProf);
	}
	
	@Override
	public void delete(Profesores profesor) {
		sessionFactory.getCurrentSession().delete(profesor);
	}
	
	@Override
	public void edit(Profesores profesor) {
		sessionFactory.getCurrentSession().update(profesor);
	}
}