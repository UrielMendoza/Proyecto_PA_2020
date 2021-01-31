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

import mx.unam.pa.sige.webapp.model.AlumnoMaterias;
import mx.unam.pa.sige.webapp.model.Alumnos;
import mx.unam.pa.sige.webapp.model.MateriasHorarios;

@Repository
public class AlumnosDAOImpl implements AlumnosDAO {
	
	@Autowired
    private SessionFactory sessionFactory;
	
	@Override
	public List<Alumnos> getAllAlumnos() {
		Session session = sessionFactory.getCurrentSession();
		//session.beginTransaction();
		
		CriteriaBuilder builder = session.getCriteriaBuilder();
		
		// Se indica al constructor del criterio que el resultado esperado es de tipo Alumnos
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
	public Integer saveAlumno(Alumnos alumno) {
		 return (Integer) sessionFactory.getCurrentSession().save(alumno);
	}
	
	@Override
	public Alumnos loginAlumno(Alumnos alumno) {
		Session session = sessionFactory.getCurrentSession();
		//session.beginTransaction();
		
		CriteriaBuilder builder = session.getCriteriaBuilder();
		
		// Se indica al constructor del criterio que el resultado esperado es de tipo Profesores
		CriteriaQuery<Alumnos> criteria = builder.createQuery(Alumnos.class);
		
		/* 
		 * La raíz es la referencia al objeto mapeado, en este caso, la raíz es la referencia 
		 * al objeto Profesores
		 */
		Root<Alumnos> root = criteria.from(Alumnos.class);
		criteria.select(root).where(
				builder.and(builder.equal(root.get("idAlumno"),alumno.getIdAlumno()),
							builder.equal(root.get("password"),alumno.getPassword())));
		
		/* 
		 * El listado de objetos devuelto getResultList() corresponde al esperado sin
		 * requerimiento de conversión adicional 
		 */
		Query<Alumnos> query = session.createQuery(criteria);
		
		// Commit de la transacción
		//session.getTransaction().commit();
		
		return query.uniqueResult();
	}

	@Override
	public Alumnos getAlumnos(Integer idAlumno) {
		return sessionFactory.getCurrentSession().get(Alumnos.class, idAlumno);
	}
	
	@Override
	public void delete(String idAlumno) {
		Session session = sessionFactory.getCurrentSession();
		//session.remove(materiasHorarios);
		
		session.createNativeQuery("delete from alumnoMaterias where id_numCuenta1 = :id")
		  .setParameter("id", idAlumno)
		  .executeUpdate();
		
		session.createNativeQuery("delete from alumnos where id_numCuenta = :id")
		  .setParameter("id", idAlumno)
		  .executeUpdate();
		
		//sessionFactory.getCurrentSession().delete(alumno);
	}
	
	@Override
	public void edit(Alumnos alumno) {
		sessionFactory.getCurrentSession().update(alumno);
	}
	
	@Override
	public List<AlumnoMaterias> getAllMateriasAlumno(Integer idAlumno){
		Session session = sessionFactory.getCurrentSession();
		//session.beginTransaction();
		
		CriteriaBuilder builder = session.getCriteriaBuilder();
		
		// Se indica al constructor del criterio que el resultado esperado es de tipo Alumnos
		CriteriaQuery<AlumnoMaterias> criteria = builder.createQuery(AlumnoMaterias.class);
		
		/* 
		 * La raíz es la referencia al objeto mapeado, en este caso, la raíz es la referencia 
		 * al objeto Alumnos
		 */
		Root<AlumnoMaterias> root = criteria.from(AlumnoMaterias.class);
		criteria.select(root).where(builder.equal(root.get("alumno").get("idAlumno"), idAlumno));
		
		/* 
		 * El listado de objetos devuelto getResultList() corresponde al esperado sin
		 * requerimiento de conversión adicional 
		 */
		Query<AlumnoMaterias> query = session.createQuery(criteria);
		List<AlumnoMaterias> materiasAlumno = query.getResultList();
		
		// Commit de la transacción
		//session.getTransaction().commit();
		
		/*
		Session session = sessionFactory.getCurrentSession();
		
		CriteriaBuilder builder = session.getCriteriaBuilder();
		CriteriaQuery<Libro> criteria = builder.createQuery(Libro.class);
		Root<Libro> root = criteria.from(Libro.class);
		root.fetch("genero", JoinType.LEFT);
		criteria.select(root);
		Query<Libro> query = session.createQuery(criteria);
		return query.getResultList();
		*/
		
		return materiasAlumno;		
	};
	
	@Override
	public List<MateriasHorarios> getGrupoAlumno(Integer idGrupos){
		Session session = sessionFactory.getCurrentSession();
		//session.beginTransaction();
		
		CriteriaBuilder builder = session.getCriteriaBuilder();
		
		// Se indica al constructor del criterio que el resultado esperado es de tipo Alumnos
		CriteriaQuery<MateriasHorarios> criteria = builder.createQuery(MateriasHorarios.class);
		
		/* 
		 * La raíz es la referencia al objeto mapeado, en este caso, la raíz es la referencia 
		 * al objeto Alumnos
		 */
		Root<MateriasHorarios> root = criteria.from(MateriasHorarios.class);
		criteria.select(root).where(builder.equal(root.get("grupo").get("idGrupos"), idGrupos));
		
		/* 
		 * El listado de objetos devuelto getResultList() corresponde al esperado sin
		 * requerimiento de conversión adicional 
		 */
		Query<MateriasHorarios> query = session.createQuery(criteria);
		List<MateriasHorarios> grupoAlumno = query.getResultList();
		
		// Commit de la transacción
		//session.getTransaction().commit();
		
		/*
		Session session = sessionFactory.getCurrentSession();
		
		CriteriaBuilder builder = session.getCriteriaBuilder();
		CriteriaQuery<Libro> criteria = builder.createQuery(Libro.class);
		Root<Libro> root = criteria.from(Libro.class);
		root.fetch("genero", JoinType.LEFT);
		criteria.select(root);
		Query<Libro> query = session.createQuery(criteria);
		return query.getResultList();
		*/
		
		return grupoAlumno;
	};

}