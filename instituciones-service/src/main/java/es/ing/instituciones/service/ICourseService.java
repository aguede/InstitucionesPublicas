package es.ing.instituciones.service;

import java.util.List;

import org.springframework.stereotype.Service;

import es.ing.instituciones.repository.entities.Course;
import es.ing.instituciones.repository.exceptions.EntityNotFoundException;


@Service
public interface ICourseService {

	public Course create(Course course);
	
	public Course update(Long id, Course course) throws EntityNotFoundException;

	public void delete(Long id) throws EntityNotFoundException;

	public List<Course> findAll();
	
	public Course findOne(Long id) throws EntityNotFoundException;

}
