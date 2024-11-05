package Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import Models.Sujet;
@Repository
public interface SujetRepository extends JpaRepository<Sujet, Long> {

}
