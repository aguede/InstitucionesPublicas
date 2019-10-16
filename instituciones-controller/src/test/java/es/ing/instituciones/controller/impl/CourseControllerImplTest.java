package es.ing.instituciones.controller.impl;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import es.ing.instituciones.bean.modelo.CourseBean;
import es.ing.instituciones.service.impl.CourseServiceImpl;

/**
 * Test para el controlador de los cursos
 *
 * @author daniel.diaz
 *
 */
@ExtendWith(MockitoExtension.class)
public class CourseControllerImplTest {

    @InjectMocks
    CourseControllerImpl courseControllerImpl;

    @Mock
    CourseServiceImpl    courseServiceImpl;

    @Test
    public void getAllTest() {
        // 1- Given
        final List<CourseBean> returnGiven = new ArrayList<CourseBean>();
        returnGiven.add(new CourseBean(1L, "Curso", "Alto", 8, "Daniel", true));
        returnGiven.add(new CourseBean(2L, "Clase", "Bajo", 7, "Pedro", true));
        Mockito.when(courseServiceImpl.findAll()).thenReturn(returnGiven);

        // 2- Act
        final ResponseEntity<List<CourseBean>> returnResulted = courseControllerImpl.getAll();

        // 3- Assert
        Mockito.verify(courseServiceImpl, Mockito.times(1)).findAll();
        Assertions.assertEquals(returnGiven.size(), returnResulted.getBody().size());
        Assertions.assertEquals(HttpStatus.OK, returnResulted.getStatusCode());
    }

    @Test
    public void getTest() {
        // 1- Given
        final CourseBean returnGiven = new CourseBean(1L, "Curso", "Alto", 8, "Daniel", true);
        Mockito.when(courseServiceImpl.findOne(1L)).thenReturn(returnGiven);

        // 2- Act
        final ResponseEntity<CourseBean> returnResulted = courseControllerImpl.get(1L);

        // 3- Assert
        Mockito.verify(courseServiceImpl, Mockito.times(1)).findOne(1L);
        Assertions.assertEquals(returnGiven, returnResulted.getBody());
        Assertions.assertEquals(HttpStatus.OK, returnResulted.getStatusCode());
    }

    @Test
    public void deleteTest() {
        // 2- Act
        final ResponseEntity<Void> returnResulted = courseControllerImpl.delete(1L);

        // 3- Assert
        Mockito.verify(courseServiceImpl, Mockito.times(1)).delete(1L);
        Assertions.assertEquals(HttpStatus.OK, returnResulted.getStatusCode());
    }

    @Test
    public void updateTest() {
        // 1- Given
        final CourseBean returnGiven = new CourseBean(1L, "Curso", "Alto", 8, "Daniel", true);

        // 2- Act
        final ResponseEntity<Void> returnResulted = courseControllerImpl.update(returnGiven);

        // 3- Assert
        Mockito.verify(courseServiceImpl, Mockito.times(1)).update(1L, returnGiven);
        Assertions.assertEquals(HttpStatus.OK, returnResulted.getStatusCode());
    }

    @Test
    public void createTest() {
        // 1- Given
        final CourseBean returnGiven = new CourseBean(1L, "Curso", "Alto", 8, "Daniel", true);
        Mockito.when(courseServiceImpl.create(returnGiven)).thenReturn(returnGiven);

        // 2- Act
        final ResponseEntity<CourseBean> returnResulted = courseControllerImpl.create(returnGiven);

        // 3- Assert
        Mockito.verify(courseServiceImpl, Mockito.times(1)).create(returnGiven);
        Assertions.assertEquals(returnGiven, returnResulted.getBody());
        Assertions.assertEquals(HttpStatus.OK, returnResulted.getStatusCode());
    }

}
