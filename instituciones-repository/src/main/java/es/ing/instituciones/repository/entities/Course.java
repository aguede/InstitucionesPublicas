package es.ing.instituciones.repository.entities;

import java.io.Serializable;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Course implements Serializable {

	private static final long serialVersionUID = 1L;

	@ApiModelProperty(notes = "Auto-generated id of the course", required = true, example = "1")
	@NonNull
	private Long id;

	@ApiModelProperty(notes = "Title of the course", required = true, example = "Clase")
	@NonNull
	private String title;

	@ApiModelProperty(notes = "Level of the course", required = true, example = "alto")
	@NonNull
	private String level;

	@ApiModelProperty(notes = "Time in hours that the course takes", required = false, example = "25")
	private Integer numberOfHours;

	@ApiModelProperty(notes = "Name of the teachers assigned to the course", required = true, example = "Prof.")
	@NonNull
	private String teacher;

	@ApiModelProperty(notes = "State of the course", required = true, example = "true")
	@NonNull
	private Boolean state;

}
