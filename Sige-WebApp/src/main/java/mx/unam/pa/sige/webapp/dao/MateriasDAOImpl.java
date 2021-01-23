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

import mx.unam.pa.sige.webapp.model.Materias;

@Repository
public class MateriasDAOImpl implements MateriasDAO{
	
	@Autowired
    private SessionFactory sessionFactory;
	
	@Override
	public List<Materias> getAllMaterias() {
		Session session = sessionFactory.getCurrentSession();
		//session.beginTransaction();
		
		CriteriaBuilder builder = session.getCriteriaBuilder();
		
		// Se indica al constructor del criterio que el resultado esperado es de tipo Materias
		CriteriaQuery<Materias> criteria = builder.createQuery(Materias.class);
		
		/* 
		 * La raíz es la referencia al objeto mapeado, en este caso, la raíz es la referencia 
		 * al objeto Materias
		 */
		Root<Materias> root = criteria.from(Materias.class);
		criteria.select(root);
		
		/* 
		 * El listado de objetos devuelto getResultList() corresponde al esperado sin
		 * requerimiento de conversión adicional 
		 */
		Query<Materias> query = session.createQuery(criteria);
		List<Materias> usuarios = query.getResultList();
		
		// Commit de la transacción
		//session.getTransaction().commit();
		
		return usuarios;
	}

	@Override
	public void save(Materias materia) {
		sessionFactory.getCurrentSession().save(materia);
	}

	@Override
	public Materias getMaterias(Integer idMateria) {
		return sessionFactory.getCurrentSession().get(Materias.class, idMateria);
	}
}