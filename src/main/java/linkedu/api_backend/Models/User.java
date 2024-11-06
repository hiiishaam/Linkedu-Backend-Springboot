package linkedu.api_backend.Models;

import linkedu.api_backend.Enums.Role;
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
@Table(name = "users")
@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id ;
	 @Column(name = "username", nullable = false)
	private String username;
	 @Column(name = "email", nullable = false)
	private String email;
	 @Column(name = "role", nullable = false)
	private Role role;
	 @Column(name = "password", nullable = false)
	private String password;
	 @Column(name = "remember_token", nullable = false)
	private String remember_token;
}