package Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import Models.Categorie;
@Repository
public interface CategorieRepository extends JpaRepository<Categorie, Long> {

	
}
