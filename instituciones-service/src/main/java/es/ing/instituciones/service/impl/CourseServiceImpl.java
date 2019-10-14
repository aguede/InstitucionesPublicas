package es.ing.instituciones.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import es.ing.instituciones.bean.exception.InstitucionesPublicasServiceException;
import es.ing.instituciones.bean.modelo.CourseBean;
import es.ing.instituciones.repository.database.ICourseRepository;
import es.ing.instituciones.service.ICourseService;

/**
 * Implementación de la interfaz {@link ICourseService}
 * 
 * @author daniel.diaz
 *
 */
@Service
public class CourseServiceImpl implements ICourseService{

	@Autowired
	private ICourseRepository courseMapper;
//
//	public CourseServiceImpl(final ICourseMapper courseMapper) {
//		this.courseMapper = courseMapper;
//	}

	@Override
	public CourseBean create(CourseBean course) {
		this.courseMapper.insert(course);
		return course;
	}

	@Override
	public CourseBean update(Long id, CourseBean course) throws InstitucionesPublicasServiceException {
		CourseBean courseBD = this.courseMapper.getById(id);
		if (courseBD == null) {
			throw new InstitucionesPublicasServiceException(null, HttpStatus.PRECONDITION_FAILED,"The course to update does not exists");
		}
		courseBD.setTitle(course.getTitle());
		courseBD.setLevel(course.getLevel());
		courseBD.setNumberOfHours(course.getNumberOfHours());
		courseBD.setTeacher(course.getTeacher());
		courseBD.setState(course.getState());

		this.courseMapper.update(courseBD);
		return courseBD;
	}

	@Override
	public void delete(Long id) throws InstitucionesPublicasServiceException {
		if (this.courseMapper.getById(id) == null) {
			throw new InstitucionesPublicasServiceException(null, HttpStatus.PRECONDITION_FAILED,"The course to delete does not exists");
		}
		this.courseMapper.deleteById(id);
	}

	@Override
	public List<CourseBean> findAll() {
		return this.courseMapper.getAll();
	}

	@Override
	public CourseBean findOne(Long id) throws InstitucionesPublicasServiceException {
		CourseBean course = this.courseMapper.getById(id);
		if (course == null) {
			throw new InstitucionesPublicasServiceException(null, HttpStatus.PRECONDITION_FAILED,"The course does not exists");
		}
		return course;
	}

}
