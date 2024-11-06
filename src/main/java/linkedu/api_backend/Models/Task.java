package linkedu.api_backend.Models;

import java.sql.Date;


import linkedu.api_backend.Enums.Statut;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "tasks")
@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Task {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id ;
	 @Column(name = "discription", nullable = false)
	private String discription;
	
	 @Column(name = "deadline", nullable = false)
	private Date deadline;
	 
	 @Column(name = "statut", nullable = false)
	private Statut statut;
	 @OneToOne
	 private Group group;
	 @OneToOne
	 private Etudiant etudiant;
	
	
	

}
