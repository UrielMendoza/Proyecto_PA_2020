package mx.unam.pa.sige.webapp.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class Configuracion extends AbstractAnnotationConfigDispatcherServletInitializer{
	@Override
	protected Class<?>[] getRootConfigClasses() {
		return new Class[] {
			HibernateConfig.class // Clase que declara los beans para manejo de la base de datos
		};
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		return new Class[] {
			WebMvcConfig.class // 
		};
	}

	/**
	 * Definición de mapeos de URL que Spring evaluará. 
	 * 
	 * Por ejemplo, si se desea que todo lo que esté en la URL 
	 * http://localhost:8080/mi-app-web/spring/
	 */
	@Override
	protected String[] getServletMappings() {
		return new String[] { 
				"/spring/*" // Spring procesará todo lo que este dentro de /spring/  
			};
	}
}
