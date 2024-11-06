package linkedu.api_backend.Models;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Table(name = "etudiants")
@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
public class Etudiant {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id ;
	 @Column(name = "nom", nullable = false)
	private String nom;
	 @Column(name = "prenom", nullable = false)
	private String prenom;
	 @Column(name = "filiere", nullable = false)
	private String filiere;
	 @Column(name = "classe", nullable = false)
	private String classe;
	 @Column(name = "is_moderator", nullable = false)
		private boolean is_moderator;
	 
	 @OneToOne
	 private User user;
	 @OneToOne
	 private Conversation conversation;
	 @OneToOne
	 private  GroupMessage groupMessage;
	 @OneToMany
	 private List<Task> tasks = new ArrayList<Task>();
}
