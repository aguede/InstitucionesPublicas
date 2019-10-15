package es.ing.instituciones.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import es.ing.instituciones.bean.modelo.CourseBean;
import es.ing.instituciones.repository.database.ICourseRepository;

/**
 * Test para el servicio de los cursos
 *
 * @author daniel.diaz
 *
 */
@ExtendWith(MockitoExtension.class)
public class CourseServiceImplTest {

    @InjectMocks
    CourseServiceImpl courseServiceImpl;

    @Mock
    ICourseRepository courseRepository;

    @Test
    public void findAllTest() {
        // 1- Given
        final List<CourseBean> returnGiven = new ArrayList<CourseBean>();
        returnGiven.add(new CourseBean(1L, "Curso", "Alto", 8, "Daniel", true));
        returnGiven.add(new CourseBean(2L, "Clase", "Bajo", 7, "Pedro", true));
        Mockito.when(courseRepository.getAll()).thenReturn(returnGiven);

        // 2- Act
        final List<CourseBean> returnResulted = courseServiceImpl.findAll();

        // 3- Assert
        Assertions.assertEquals(returnGiven, returnResulted);
    }

    @Test
    public void findOneTest() {
        // 1- Given
        final CourseBean returnGiven = new CourseBean(1L, "Curso", "Alto", 8, "Daniel", true);
        Mockito.when(courseRepository.getById(1L)).thenReturn(returnGiven);

        // 2- Act
        final CourseBean returnResulted = courseServiceImpl.findOne(1L);

        // 3- Assert
        Assertions.assertEquals(returnGiven, returnResulted);
    }

    @Test
    public void updateTest() {
        // 1- Given
        final CourseBean course = new CourseBean(1L, "Curso", "Alto", 8, "Daniel", true);
        final CourseBean returnGiven = new CourseBean(1L, "Clase", "Baja", 8, "Pedro", true);
        Mockito.when(courseRepository.getById(1L)).thenReturn(course);

        // 2- Act
        final CourseBean returnResulted = courseServiceImpl.update(1L, returnGiven);

        // 3- Assert
        Assertions.assertEquals(returnGiven.getTitle(), returnResulted.getTitle());
        Assertions.assertEquals(returnGiven.getLevel(), returnResulted.getLevel());
        Assertions.assertEquals(returnGiven.getNumberOfHours(), returnResulted.getNumberOfHours());
        Assertions.assertEquals(returnGiven.getTeacher(), returnResulted.getTeacher());
        Assertions.assertEquals(returnGiven.getState(), returnResulted.getState());
    }

    @Test
    public void createTest() {
        // 1- Given
        final CourseBean course = new CourseBean(1L, "Curso", "Alto", 8, "Daniel", true);

        // 2- Act
        courseServiceImpl.create(course);

        // 3- Assert
        Mockito.verify(courseRepository, Mockito.times(1)).insert(course);
    }

    @Test
    public void deleteTest() {
        // 1- Given
        final CourseBean course = new CourseBean(1L, "Curso", "Alto", 8, "Daniel", true);
        Mockito.when(courseRepository.getById(1L)).thenReturn(course);

        // 2- Act
        courseServiceImpl.delete(1L);

        // 3- Assert
        Mockito.verify(courseRepository, Mockito.times(1)).deleteById(1L);
    }

}
