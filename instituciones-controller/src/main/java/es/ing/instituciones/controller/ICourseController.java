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

import es.ing.instituciones.bean.modelo.CourseBean;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

/**
 * Api de ejemplo para un controlador para cursos
 *
 * @author daniel.diaz
 *
 */
@RestController
@RequestMapping(ICourseController.Paths.RESOURCE)
@Api(value = "Course Controller", tags = { "Course Controller" })
public interface ICourseController {

    /** Paths del api rest. */
    public static class Paths {
        /** Mapeo del api rest definido. */
        public static final String RESOURCE = "/course";
        /** Mapeo de servicio de buscar un curso. */
        public static final String GET      = "/{id}";
    }

    @ApiOperation(value = "Create a new Course", response = CourseBean.class, responseContainer = "ResponseEntity")
    @ApiResponses(value = { @ApiResponse(code = 200, message = "Created the course"),
                            @ApiResponse(code = 500, message = "Not all mandatory fields have been provided") })
    @PostMapping(produces = "application/json")
    public ResponseEntity<CourseBean> create(@Valid @RequestBody CourseBean course);

    @ApiOperation(value = "Update a Course")
    @ApiResponses(value = { @ApiResponse(code = 200, message = "OK"),
                            @ApiResponse(code = 412, message = "The course to update does not exists"),
                            @ApiResponse(code = 500, message = "Not all mandatory fields have been provided") })
    @PutMapping
    public ResponseEntity<Void> update(@Valid @RequestBody CourseBean course);

    @ApiOperation(value = "Find all Courses", response = CourseBean.class, responseContainer = "ResponseEntity")
    @ApiResponses(value = { @ApiResponse(code = 200, message = "Created the course") })
    @GetMapping(produces = "application/json")
    public ResponseEntity<List<CourseBean>> getAll();

    @ApiOperation(value = "Find one Course", response = CourseBean.class, responseContainer = "ResponseEntity")
    @ApiResponses(value = { @ApiResponse(code = 200, message = "Found the course"),
                            @ApiResponse(code = 412, message = "The course does not exists"),
                            @ApiResponse(code = 500, message = "Not all mandatory fields have been provided") })
    @GetMapping(path = ICourseController.Paths.GET, produces = "application/json")
    public ResponseEntity<CourseBean> get(@PathVariable(value = "id") Long id);

    @ApiOperation(value = "Delete a Course")
    @ApiResponses(value = { @ApiResponse(code = 200, message = "OK"),
                            @ApiResponse(code = 412, message = "The course to delete does not exists") })
    @DeleteMapping
    public ResponseEntity<?> delete(@Valid @RequestBody Long id);

}
