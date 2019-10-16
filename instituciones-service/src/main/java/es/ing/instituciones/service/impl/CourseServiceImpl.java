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
public class CourseServiceImpl implements ICourseService {

    @Autowired
    private ICourseRepository courseRepository;

    @Override
    public CourseBean create(CourseBean course) {
        courseRepository.insert(course);
        return course;
    }

    @Override
    public CourseBean update(Long id, CourseBean course) {
        final CourseBean courseBD = courseRepository.getById(id);
        if (courseBD == null) {
            throw new InstitucionesPublicasServiceException(null, HttpStatus.PRECONDITION_FAILED,
                    "The course to update does not exists");
        }
        courseBD.setTitle(course.getTitle());
        courseBD.setLevel(course.getLevel());
        courseBD.setNumberOfHours(course.getNumberOfHours());
        courseBD.setTeacher(course.getTeacher());
        courseBD.setState(course.getState());

        courseRepository.update(courseBD);
        return courseBD;
    }

    @Override
    public void delete(Long id) {
        if (courseRepository.getById(id) == null) {
            throw new InstitucionesPublicasServiceException(null, HttpStatus.PRECONDITION_FAILED,
                    "The course to delete does not exists");
        }
        courseRepository.deleteById(id);
    }

    @Override
    public List<CourseBean> findAll() {
        return courseRepository.getAll();
    }

    @Override
    public CourseBean findOne(Long id) {
        final CourseBean course = courseRepository.getById(id);
        if (course == null) {
            throw new InstitucionesPublicasServiceException(null, HttpStatus.PRECONDITION_FAILED,
                    "The course does not exists");
        }
        return course;
    }

}
