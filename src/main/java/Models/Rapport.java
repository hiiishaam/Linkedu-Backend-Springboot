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
@Table(name = "rapports")

@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Rapport {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id ;
	 @Column(name = "titre", nullable = false)
	private String titre;
	 @Column(name = "discription", nullable = false)
	private String discription;
	 @Column(name = "pdf_file", nullable = false)
		private String pdf_file;
	 @OneToOne
	 private Sujet sujet;
	 @OneToOne
	 private Categorie categorie;
	 

}
