package Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import Models.Conversation;
@Repository
public interface ConversationRepository extends JpaRepository<Conversation, Long> {

}
