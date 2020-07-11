package Trivia.interfaces;

import Trivia.entities.Trivia;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface ITriviaServices {
    Trivia createQuestion(Trivia trivia);
    List<Trivia> getQuestions();
    Trivia editQuestion(Integer questionID, Trivia trivia);
}
