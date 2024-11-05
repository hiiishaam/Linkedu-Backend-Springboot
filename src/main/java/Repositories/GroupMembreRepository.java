package Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import Models.GroupMembre;
@Repository
public interface GroupMembreRepository extends JpaRepository<GroupMembre, Long>{

}
