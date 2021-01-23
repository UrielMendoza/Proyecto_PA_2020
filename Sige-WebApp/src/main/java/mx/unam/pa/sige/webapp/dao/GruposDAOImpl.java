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

import mx.unam.pa.sige.webapp.model.Grupos;

@Repository
public class GruposDAOImpl implements GruposDAO{
	
	@Autowired
    private SessionFactory sessionFactory;
	
	@Override
	public List<Grupos> getAllGrupos() {
		Session session = sessionFactory.getCurrentSession();
		//session.beginTransaction();
		
		CriteriaBuilder builder = session.getCriteriaBuilder();
		
		// Se indica al constructor del criterio que el resultado esperado es de tipo Grupos
		CriteriaQuery<Grupos> criteria = builder.createQuery(Grupos.class);
		
		/* 
		 * La raíz es la referencia al objeto mapeado, en este caso, la raíz es la referencia 
		 * al objeto Grupos
		 */
		Root<Grupos> root = criteria.from(Grupos.class);
		criteria.select(root);
		
		/* 
		 * El listado de objetos devuelto getResultList() corresponde al esperado sin
		 * requerimiento de conversión adicional 
		 */
		Query<Grupos> query = session.createQuery(criteria);
		List<Grupos> usuarios = query.getResultList();
		
		// Commit de la transacción
		//session.getTransaction().commit();
		
		return usuarios;
	}

	@Override
	public void save(Grupos grupo) {
		sessionFactory.getCurrentSession().save(grupo);
	}

	@Override
	public Grupos getGrupos(Integer idGrupo) {
		return sessionFactory.getCurrentSession().get(Grupos.class, idGrupo);
	}
	
	@Override
	public void delete(Grupos grupo) {
		sessionFactory.getCurrentSession().delete(grupo);
	}
	
	@Override
	public void edit(Grupos grupo) {
		sessionFactory.getCurrentSession().update(grupo);
	}

}