package es.ing.instituciones.service;

import java.util.List;

import org.springframework.stereotype.Service;

import es.ing.instituciones.bean.exception.InstitucionesPublicasServiceException;
import es.ing.instituciones.bean.modelo.CourseBean;
import es.ing.instituciones.repository.exceptions.EntityNotFoundException;

/**
 * Lógica de negocio referente a los Courses
 * 
 * @author daniel.diaz
 *
 */
@Service
public interface ICourseService {

	/**
	 * Crea un curso en la base de datos
	 * 
	 * @param course - curso a crear
	 * @return curso - creado
	 */
	public CourseBean create(CourseBean course);
	
	/**
	 * Actualiza un curso
	 * 
	 * @param id - identificador del curso a actualizar
	 * @param course - información actualizada del curso
	 * @return curso actualizado
	 * @throws EntityNotFoundException Excepción en caso de no haber encontrado el curso a actualizar
	 */
	public CourseBean update(Long id, CourseBean course) throws InstitucionesPublicasServiceException;

	/**
	 * Elimina un curso
	 * 
	 * @param id - identificación del curso a eliminar
	 * @throws EntityNotFoundException Excepción en caso de no haber encontrado el curso a eliminar
	 */
	public void delete(Long id) throws InstitucionesPublicasServiceException;

	/**
	 * Buscar todos los cursos
	 * 
	 * @return lista de todos los cursos
	 */
	public List<CourseBean> findAll();
	
	/**
	 * Bucar un curso
	 * 
	 * @param id - identificador del curso a buscar
	 * @return curso buscado
	 * @throws EntityNotFoundException Excepción en caso de no haber encontrado el curso
	 */
	public CourseBean findOne(Long id) throws InstitucionesPublicasServiceException;

}
