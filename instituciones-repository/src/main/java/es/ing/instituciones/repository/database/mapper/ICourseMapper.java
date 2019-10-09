package es.ing.instituciones.repository.database.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import es.ing.instituciones.repository.entities.Course;


@Mapper
public interface ICourseMapper {

	@Insert("INSERT INTO COURSES(TITLE, LEVEL, HOURS, TEACHER, STATE) VALUES(#{title}, #{level}, #{numberOfHours}, #{teacher}, #{state})")
	@Options(useGeneratedKeys = true, keyProperty = "id", keyColumn = "ID")
	public int insert(Course course);

	@Update("UPDATE COURSES SET TITLE = #{title}, LEVEL = #{level}, HOURS = #{numberOfHours}, TEACHER = #{teacher}, STATE = #{state} WHERE ID=#{id}")
	public int update(Course course);

	@Delete("DELETE FROM COURSES WHERE ID=#{id}")
	public int deleteById(Long id);

	@Select("SELECT c.ID, c.TITLE, c.LEVEL, c.HOURS, c.TEACHER, c.STATE FROM COURSES c")
	@Results(value = { @Result(property = "id", column = "ID"), @Result(property = "title", column = "TITLE"),
			@Result(property = "level", column = "LEVEL"), @Result(property = "numberOfHours", column = "HOURS"),
			@Result(property = "teacher", column = "TEACHER"), @Result(property = "state", column = "STATE") })
	public List<Course> getAll();

	@Select("SELECT c.ID, c.TITLE, c.LEVEL, c.HOURS, c.TEACHER, c.STATE FROM COURSES c WHERE c.ID = #{id}")
	@Results(value = { @Result(property = "id", column = "ID"), @Result(property = "title", column = "TITLE"),
			@Result(property = "level", column = "LEVEL"), @Result(property = "numberOfHours", column = "HOURS"),
			@Result(property = "teacher", column = "TEACHER"), @Result(property = "state", column = "STATE") })
	public Course getById(@Param("id") Long id);


}
