package Kodlama.io.Devs.entities.concretes;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Table(name="technologies")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity

public class Technology {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	
	@Column(name="technologyname")
	private String name;
	@ManyToOne
	@JoinColumn(name = "languageid")
	private ProgrammingLanguage programmingLanguage;
	
	


}
