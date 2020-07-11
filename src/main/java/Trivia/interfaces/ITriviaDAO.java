package Trivia.interfaces;

import Trivia.entities.Trivia;

import java.util.List;

public interface ITriviaDAO {
    Trivia createQuestion(Trivia trivia);
    List<Trivia> getQuestions();
    Trivia editQuestion(Integer questionID, Trivia trivia);
}
