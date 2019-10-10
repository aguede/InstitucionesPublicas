package es.ing.instituciones.controller.impl;

import java.util.List;

import javax.validation.Valid;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import es.ing.instituciones.bean.modelo.CourseBean;
import es.ing.instituciones.controller.ICourseController;
import es.ing.instituciones.service.ICourseService;

/**
 * Implementación de la interfaz {@link ICourseController}}
 * 
 * @author daniel.diaz
 *
 */
@RestController
public class CourseControllerImpl implements ICourseController {

	private ICourseService courseService;
	
	public CourseControllerImpl(ICourseService courseService) {
		super();
		this.courseService = courseService;
	}

	@Override
	public ResponseEntity<CourseBean> create(@Valid @RequestBody CourseBean course) {
		return ResponseEntity.ok().body(courseService.create(course));
	}

	@Override
	public ResponseEntity<CourseBean> update(@Valid @RequestBody CourseBean course) {
		return ResponseEntity.ok().body(courseService.update(course.getId(), course));
	}

	@Override
	public ResponseEntity<List<CourseBean>> getAll() {
		return ResponseEntity.ok().body(courseService.findAll());
	}

	@Override
	public ResponseEntity<CourseBean> get(@PathVariable(value = "id") Long id) {
		return ResponseEntity.ok().body(courseService.findOne(id));
	}

	@Override
	public ResponseEntity<String> delete(@Valid @RequestBody Long id) {
		courseService.delete(id);
		return ResponseEntity.ok().body("Course deleted");
	}

}
