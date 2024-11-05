package Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import Models.Professeur;
@Repository
public interface ProfesseurRepository extends JpaRepository<Professeur, Long> {

}
