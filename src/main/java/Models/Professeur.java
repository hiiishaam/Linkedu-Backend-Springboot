package Models;

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
@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Table(name = "professeurs")
public class Professeur {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id ;
	 @Column(name = "nom", nullable = false)
	private String nom;
	 @Column(name = "prenom", nullable = false)
	private String prenom;
	 @Column(name = "matricule", nullable = false)
	private String matricule;
	 @OneToOne
		private User user;

}
