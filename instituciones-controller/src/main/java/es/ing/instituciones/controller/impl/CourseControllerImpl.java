package es.ing.instituciones.controller.impl;

import java.util.List;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import es.ing.instituciones.controller.ICourseController;
import es.ing.instituciones.repository.entities.Course;
import es.ing.instituciones.repository.exceptions.EntityNotFoundException;
import es.ing.instituciones.service.ICourseService;


@RestController
public class CourseControllerImpl implements ICourseController {

	private Logger log = LoggerFactory.getLogger(this.getClass());

	private ICourseService courseService;
	
	public CourseControllerImpl(ICourseService courseService) {
		super();
		this.courseService = courseService;
	}

	@Override
	public ResponseEntity<?> create(@Valid @RequestBody Course course) {
		if (course.getTitle() == null || course.getLevel() == null || course.getTeacher() == null
				|| course.getState() == null) {
			return ResponseEntity.status(500).body("Not all mandatory fieldsory fields have been provided");
		}
		return ResponseEntity.ok().body(courseService.create(course));
	}

	@Override
	public ResponseEntity<?> update(@Valid @RequestBody Course course) {
		if (course.getTitle() == null || course.getLevel() == null || course.getTeacher() == null
				|| course.getState() == null) {
			return ResponseEntity.status(500).body("Not all mandatory fields have been provided");
		}
		try {
			course = courseService.update(course.getId(), course);
		} catch (EntityNotFoundException e) {
			log.error(e.getMessage());
			return ResponseEntity.status(404).body("The course to update does not exists");
		}
		return ResponseEntity.ok().body(course);
	}

	@Override
	public ResponseEntity<List<Course>> getAll() {
		return ResponseEntity.ok().body(courseService.findAll());
	}

	@Override
	public ResponseEntity<?> get(@PathVariable(value = "id") Long id) {
		Course course = null;
		try {
			course = courseService.findOne(id);
		} catch (EntityNotFoundException e) {
			log.error(e.getMessage());
			return ResponseEntity.status(404).body("The course does not exists");
		}
		return ResponseEntity.ok().body(course);

	}

	@Override
	public ResponseEntity<?> delete(@Valid @RequestBody Long id) {
		try {
			courseService.delete(id);
		} catch (EntityNotFoundException e) {
			return ResponseEntity.status(404).body("The course to delete does not exists");
		}
		return ResponseEntity.ok().body("Course deleted");
	}

}
