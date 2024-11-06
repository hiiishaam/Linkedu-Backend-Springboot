package linkedu.api_backend.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import linkedu.api_backend.Models.SujetExterne;
@Repository
public interface SujetExterneRepository extends JpaRepository<SujetExterne, Long> {

}