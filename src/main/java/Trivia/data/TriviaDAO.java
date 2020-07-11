package Trivia.data;

import Trivia.entities.Trivia;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import Trivia.interfaces.ITriviaDAO;
import Trivia.interfaces.ITriviaRepo;

import java.util.List;

@Component
public class TriviaDAO implements ITriviaDAO {
    @Autowired
    private ITriviaRepo repo;


    @Override
    public Trivia createQuestion(Trivia trivia) {
        return repo.save(trivia);
    }

    @Override
    public List<Trivia> getQuestions() {
        return repo.findAll();
    }

    @Override
    public Trivia editQuestion(Integer questionID, Trivia trivia) {
        return repo.save(trivia);
    }
}
