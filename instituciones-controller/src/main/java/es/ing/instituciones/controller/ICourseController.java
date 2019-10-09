package es.ing.instituciones.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import es.ing.instituciones.repository.entities.Course;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@RestController
@RequestMapping("/course")
//@Produces(MediaType.APPLICATION_JSON)
//@Consumes(MediaType.APPLICATION_JSON)
@Api(value = "Course Controller",tags= {"Course Controller"})
public interface ICourseController {

	@ApiOperation(value = "Create a new Course", response = ResponseEntity.class)
	@ApiResponses(value = { @ApiResponse(code = 200, message = "Created the course"),
			@ApiResponse(code = 500, message = "Not all mandatory fields have been provided") })
	@PostMapping(path = "/", produces = "application/json")
	public ResponseEntity<?> create(@Valid @RequestBody Course course);

	@ApiOperation(value = "Update a Course", response = ResponseEntity.class)
	@ApiResponses(value = { @ApiResponse(code = 200, message = "Updated the course"),
			@ApiResponse(code = 404, message = "The course to update does not exists"),
			@ApiResponse(code = 500, message = "Not all mandatory fields have been provided") })
	@PutMapping(path = "/", produces = "application/json")
	public ResponseEntity<?> update(@Valid @RequestBody Course course);

	@ApiOperation(value = "Find all Courses", response = ResponseEntity.class)
	@ApiResponses(value = { @ApiResponse(code = 200, message = "Created the course") })
	@GetMapping(produces = "application/json")
	public ResponseEntity<List<Course>> getAll();

	@ApiOperation(value = "Find one Course", response = ResponseEntity.class)
	@ApiResponses(value = { @ApiResponse(code = 200, message = "Found the course"),
			@ApiResponse(code = 404, message = "The course does not exists"),
			@ApiResponse(code = 500, message = "Not all mandatory fields have been provided") })
	@GetMapping(path = "/{id}", produces = "application/json")
	public ResponseEntity<?> get(@PathVariable(value = "id") Long id);

	@ApiOperation(value = "Delete a Course", response = ResponseEntity.class)
	@ApiResponses(value = { @ApiResponse(code = 200, message = "Course deleted"),
			@ApiResponse(code = 404, message = "The course to delete does not exists") })
	@DeleteMapping(path = "/", produces = "application/json")
	public ResponseEntity<?> delete(@Valid @RequestBody Long id);

}
