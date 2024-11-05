package Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import Models.Group;
@Repository
public interface GroupRepository extends JpaRepository<Group, Long> {

}
