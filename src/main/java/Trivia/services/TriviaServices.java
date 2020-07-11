package Trivia.services;

import Trivia.entities.Trivia;
import Trivia.interfaces.ITriviaDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import Trivia.interfaces.ITriviaServices;

import java.util.List;

@Service
public class TriviaServices implements ITriviaServices {

    @Autowired
    private ITriviaDAO questionDAO;

    @Override
    public Trivia createQuestion(Trivia trivia) {
        return questionDAO.createQuestion(trivia);
    }

    @Override
    public List<Trivia> getQuestions() {
        return questionDAO.getQuestions();
    }

    @Override
    public Trivia editQuestion(Integer questionID, Trivia trivia) {
        return questionDAO.editQuestion(questionID, trivia);
    }
}


