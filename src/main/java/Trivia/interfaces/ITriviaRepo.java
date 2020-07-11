package Trivia.interfaces;

import Trivia.entities.Trivia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface ITriviaRepo extends JpaRepository<Trivia, Integer> {
}
