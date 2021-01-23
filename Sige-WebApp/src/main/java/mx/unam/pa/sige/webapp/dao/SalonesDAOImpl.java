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

import mx.unam.pa.sige.webapp.model.Salones;

@Repository
public class SalonesDAOImpl implements SalonesDAO{
	@Autowired
    private SessionFactory sessionFactory;
	
	@Override
	public List<Salones> getAllSalones() {
		Session session = sessionFactory.getCurrentSession();
		//session.beginTransaction();
		
		CriteriaBuilder builder = session.getCriteriaBuilder();
		
		// Se indica al constructor del criterio que el resultado esperado es de tipo Salones
		CriteriaQuery<Salones> criteria = builder.createQuery(Salones.class);
		
		/* 
		 * La raíz es la referencia al objeto mapeado, en este caso, la raíz es la referencia 
		 * al objeto Salones
		 */
		Root<Salones> root = criteria.from(Salones.class);
		criteria.select(root);
		
		/* 
		 * El listado de objetos devuelto getResultList() corresponde al esperado sin
		 * requerimiento de conversión adicional 
		 */
		Query<Salones> query = session.createQuery(criteria);
		List<Salones> usuarios = query.getResultList();
		
		// Commit de la transacción
		//session.getTransaction().commit();
		
		return usuarios;
	}

	@Override
	public void save(Salones salon) {
		sessionFactory.getCurrentSession().save(salon);
	}

	@Override
	public Salones getSalones(Integer idSalon) {
		return sessionFactory.getCurrentSession().get(Salones.class, idSalon);
	}
	
	@Override
	public void edit(Salones salon) {
		sessionFactory.getCurrentSession().update(salon);
	}
	
	@Override
	public void delete(Salones salon) {
		sessionFactory.getCurrentSession().delete(salon);
	}

}