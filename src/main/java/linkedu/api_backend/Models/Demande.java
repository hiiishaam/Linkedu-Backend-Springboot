package linkedu.api_backend.Models;

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
@Table(name = "demandes")
@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Demande {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id ;
	 @Column(name = "cv", nullable = false)
	private String cv;
	 @Column(name = "message", nullable = false)
	private String message;
	 @Column(name = "statut", nullable = false)
		private String statut;
	 @OneToOne
	 private Etudiant etudiant;
	 @OneToOne
	 private Sujet sujet;
	

}
