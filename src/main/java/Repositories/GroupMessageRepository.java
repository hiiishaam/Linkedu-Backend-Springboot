package Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import Models.GroupMessage;
@Repository
public interface GroupMessageRepository  extends JpaRepository<GroupMessage, Long>{

}
