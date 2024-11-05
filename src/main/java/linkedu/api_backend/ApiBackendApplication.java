package linkedu.api_backend;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories("linkedu.api_backend.src.main.java.repositories")
public class ApiBackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiBackendApplication.class, args);
	}

}
