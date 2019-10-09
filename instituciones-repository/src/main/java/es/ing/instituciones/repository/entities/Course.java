package es.ing.instituciones.repository.entities;

import java.io.Serializable;


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

	@NonNull
	private Long id;

	@NonNull
	private String title;

	@NonNull
	private String level;

	private Integer numberOfHours;

	@NonNull
	private String teacher;

	@NonNull
	private Boolean state;

}
