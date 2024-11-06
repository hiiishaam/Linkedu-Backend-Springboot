package linkedu.api_backend.Models;

import java.util.ArrayList;
import java.util.List;

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

@Entity
@Table(name = "groupMembres")
@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class GroupMembre {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id ;
	
	@OneToOne
	private Group group;
	@OneToMany
	private List<Etudiant> etudiants = new ArrayList<>();
	

}
