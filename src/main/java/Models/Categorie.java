package Models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "categorie")
@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Categorie {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	 @Column(name = "nom", nullable = false)
		private String nom;
	 @Column(name = "discription", nullable = false)
		private String discription;
	

}
