package es.ing.instituciones.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import es.ing.instituciones.repository.database.mapper.ICourseMapper;
import es.ing.instituciones.repository.entities.Course;
import es.ing.instituciones.repository.exceptions.EntityNotFoundException;
import es.ing.instituciones.service.ICourseService;


@Service
public class CourseServiceImpl implements ICourseService{

	@Autowired
	private ICourseMapper courseMapper;
//
//	public CourseServiceImpl(final ICourseMapper courseMapper) {
//		this.courseMapper = courseMapper;
//	}

	public Course create(Course course) {
		this.courseMapper.insert(course);
		return course;
	}

	public Course update(Long id, Course course) throws EntityNotFoundException {
		Course courseBD = this.courseMapper.getById(id);
		if (courseBD == null) {
			throw new EntityNotFoundException("The course to update does not exists");
		}
		courseBD.setTitle(course.getTitle());
		courseBD.setLevel(course.getLevel());
		courseBD.setNumberOfHours(course.getNumberOfHours());
		courseBD.setTeacher(course.getTeacher());
		courseBD.setState(course.getState());

		this.courseMapper.update(courseBD);
		return courseBD;
	}

	public void delete(Long id) throws EntityNotFoundException {
		if (this.courseMapper.getById(id) == null) {
			throw new EntityNotFoundException("The course to delete does not exists");
		}
		this.courseMapper.deleteById(id);
	}

	public List<Course> findAll() {
		return this.courseMapper.getAll();
	}

	public Course findOne(Long id) throws EntityNotFoundException {
		Course course = this.courseMapper.getById(id);
		if (course == null) {
			throw new EntityNotFoundException("The course does not exists");
		}
		return course;
	}

}
