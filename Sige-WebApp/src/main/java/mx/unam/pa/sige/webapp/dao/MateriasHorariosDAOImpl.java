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
import mx.unam.pa.sige.webapp.model.MateriasHorarios;

@Repository
public class MateriasHorariosDAOImpl implements MateriasHorariosDAO{
	@Autowired
    private SessionFactory sessionFactory;
	
	@Override
	public List<MateriasHorarios> getAllMateriasHorarios(){
		Session session = sessionFactory.getCurrentSession();
		//session.beginTransaction();
		
		CriteriaBuilder builder = session.getCriteriaBuilder();
		
		// Se indica al constructor del criterio que el resultado esperado es de tipo MateriasHorarios
		CriteriaQuery<MateriasHorarios> criteria = builder.createQuery(MateriasHorarios.class);
		
		/* 
		 * La raíz es la referencia al objeto mapeado, en este caso, la raíz es la referencia 
		 * al objeto MateriasHorarios
		 */
		Root<MateriasHorarios> root = criteria.from(MateriasHorarios.class);
		criteria.select(root);
		
		/* 
		 * El listado de objetos devuelto getResultList() corresponde al esperado sin
		 * requerimiento de conversión adicional 
		 */
		Query<MateriasHorarios> query = session.createQuery(criteria);
		List<MateriasHorarios> usuarios = query.getResultList();
		
		// Commit de la transacción
		//session.getTransaction().commit();
		
		return usuarios;
	}
	
	@Override
	public List<MateriasHorarios> getAllMateriasHorariosByGrado(Integer grado){
		Session session = sessionFactory.getCurrentSession();
		//session.beginTransaction();
		
		CriteriaBuilder builder = session.getCriteriaBuilder();
		
		// Se indica al constructor del criterio que el resultado esperado es de tipo Grupos
		CriteriaQuery<MateriasHorarios> criteria = builder.createQuery(MateriasHorarios.class);
		
		/* 
		 * La raíz es la referencia al objeto mapeado, en este caso, la raíz es la referencia 
		 * al objeto Grupos
		 */
		Root<MateriasHorarios> root = criteria.from(MateriasHorarios.class);
		criteria.select(root).where(builder.equal(root.get("grupo").get("grado"), grado));;
		
		/* 
		 * El listado de objetos devuelto getResultList() corresponde al esperado sin
		 * requerimiento de conversión adicional 
		 */
		Query<MateriasHorarios> query = session.createQuery(criteria);
		List<MateriasHorarios> materiasHorarios = query.getResultList();
		
		// Commit de la transacción
		//session.getTransaction().commit();
		
		return materiasHorarios;
	};

	@Override
	public List<MateriasHorarios> getAllMateriasHorariosByGrupo(Integer grupo){
		Session session = sessionFactory.getCurrentSession();
		//session.beginTransaction();
		
		CriteriaBuilder builder = session.getCriteriaBuilder();
		
		// Se indica al constructor del criterio que el resultado esperado es de tipo Grupos
		CriteriaQuery<MateriasHorarios> criteria = builder.createQuery(MateriasHorarios.class);
		
		/* 
		 * La raíz es la referencia al objeto mapeado, en este caso, la raíz es la referencia 
		 * al objeto Grupos
		 */
		Root<MateriasHorarios> root = criteria.from(MateriasHorarios.class);
		criteria.select(root).where(builder.equal(root.get("grupo").get("idGrupos"), grupo));;
		
		/* 
		 * El listado de objetos devuelto getResultList() corresponde al esperado sin
		 * requerimiento de conversión adicional 
		 */
		Query<MateriasHorarios> query = session.createQuery(criteria);
		List<MateriasHorarios> materiasHorarios = query.getResultList();
		
		// Commit de la transacción
		//session.getTransaction().commit();
		
		return materiasHorarios;
	};
	
	/**
	 * <p>Ejecución de inserción en la tabla libro.</p>
	 * <p>Equivalente a <br><code>INSERT INTO libro...</code></p>
	 * @param autor
	 */
	public void save(MateriasHorarios materiasHorarios) {
		sessionFactory.getCurrentSession().save(materiasHorarios);
	}	
	/**
	 * <p>Ejecución de consulta a la tabla autor con el criterio id.</p>
	 * <p>Equivalente a <br> 
	 * <code>SELECT * FROM libro WHERE id = 3;</code>
	 * </p>
	 * @param id
	 * @return
	 */
	public MateriasHorarios getMateriasHorarios(Integer idMateriasHorarios ) {
		return sessionFactory.getCurrentSession().get(MateriasHorarios.class, idMateriasHorarios);
	}
	
	
	public void delete(String idMateriasHorarios) {		
		Session session = sessionFactory.getCurrentSession();
		//session.remove(materiasHorarios);

		session.createNativeQuery("delete from alumnoMaterias where id_materiasHorarios1 = :id")
		  .setParameter("id", idMateriasHorarios)
		  .executeUpdate();

		session.createNativeQuery("delete from materiasHorarios where id_materiasHorarios = :id")
		  .setParameter("id", idMateriasHorarios)
		  .executeUpdate();
		
		//session.getTransaction().commit();
	}
	
	public void edit(MateriasHorarios materiasHorarios) {
		sessionFactory.getCurrentSession().update(materiasHorarios);
	}
}
