package mx.unam.pa.sige.webapp.dao;

import java.security.InvalidAlgorithmParameterException;
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
	public void saveAlumnoMaterias(AlumnoMaterias alumnoMaterias) {
		sessionFactory.getCurrentSession().save(alumnoMaterias);
	}

	@Override
	public List<AlumnoMaterias> getAlumnoMateriasByNumCuenta(Alumnos alumno) {
		Session session = sessionFactory.getCurrentSession();
		//session.beginTransaction();
		
		CriteriaBuilder builder = session.getCriteriaBuilder();
		
		// Se indica al constructor del criterio que el resultado esperado es de tipo AlumnoMaterias
		CriteriaQuery<AlumnoMaterias> criteria = builder.createQuery(AlumnoMaterias.class);
		
		/* 
		 * La raíz es la referencia al objeto mapeado, en este caso, la raíz es la referencia 
		 * al objeto AlumnoMaterias
		 */
		Root<AlumnoMaterias> root = criteria.from(AlumnoMaterias.class);
		criteria.select(root).where(
				builder.equal(root.get("alumno"), alumno));
		
		/* 
		 * El listado de objetos devuelto getResultList() corresponde al esperado sin
		 * requerimiento de conversión adicional 
		 */
		Query<AlumnoMaterias> query = session.createQuery(criteria);
		List<AlumnoMaterias> usuarios = query.getResultList();
		
		return usuarios;
	}
	
	@Override
	public AlumnoMaterias getAlumnoMaterias(Integer idAlumno) {
		return sessionFactory.getCurrentSession().get(AlumnoMaterias.class, idAlumno);
	}
	
//	@Override
//	public void delete(AlumnoMaterias alumnoMateria) {
//		sessionFactory.getCurrentSession().delete(alumnoMateria);
//	}
	
	@Override
	public void delete(List<AlumnoMaterias> alumnoMaterias) {
		for(AlumnoMaterias alumnoMateria : alumnoMaterias) {
			sessionFactory.getCurrentSession().delete(alumnoMateria);
		}
	}
	
	@Override
	public void edit(AlumnoMaterias alumnoMateria) {
		sessionFactory.getCurrentSession().update(alumnoMateria);
	}
	
	@Override
	public void saveAlumnosInscritos(List<MateriasHorarios> materiasHorarios, Alumnos alumno) {
		for(MateriasHorarios materiaHorario : materiasHorarios) {
			Session session = sessionFactory.getCurrentSession();
			
			//AlumnoMaterias materia = new AlumnoMaterias(alumno,materiaHorario);
			//session.save(materia);
			//session.flush();
			//session.clear();
			
			String idAlumno = String.valueOf(alumno.getIdAlumno());
			String idMateriasHorarios = String.valueOf(materiaHorario.getIdMateriasHorarios());			
			
			session.createNativeQuery("INSERT INTO alumnomaterias (id_numCuenta1,id_materiasHorarios1,calificacion) VALUES (:id_numCuenta1,:id_materiasHorarios1,:calificacion)")		
			.setParameter("id_numCuensta1", idAlumno)
			.setParameter("id_materiasHorarios1", idMateriasHorarios)
			.setParameter("calificacion", "-9999.0")
			.executeUpdate();
		}
	};
	
	@Override
	public List<AlumnoMaterias> getAllAlumnosMateriasByIdMateriasHorarios(Integer idMateriasHorarios){
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
		criteria.select(root).where(
				builder.equal(root.get("materiaHorario").get("idMateriasHorarios"), idMateriasHorarios));
		
		/* 
		 * El listado de objetos devuelto getResultList() corresponde al esperado sin
		 * requerimiento de conversión adicional 
		 */
		Query<AlumnoMaterias> query = session.createQuery(criteria);
		List<AlumnoMaterias> alumnoMaterias = query.getResultList();
		
		// Commit de la transacción
		//session.getTransaction().commit();
		
		return alumnoMaterias;		
		
		
	};
}