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
@Table(name = "admins")
public class Admin {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id ;
	 @Column(name = "nom", nullable = false)
	private String nom;
	 @Column(name = "directeur", nullable = false)
	private String directeur;
	 @Column(name = "site_web", nullable = false)
	private String site_web;
	
	@OneToOne
	private User user;
	
}
