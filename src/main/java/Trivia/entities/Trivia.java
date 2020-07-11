package Trivia.entities;

import com.fasterxml.jackson.annotation.JsonFormat;
import javax.validation.constraints.NotBlank;
import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;

@Entity
@Table(name = "question")
public class Trivia {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer question_id;
    @NotBlank
    private String question;

    private String[] tags;
    @NotBlank
    private  String answer;

    public Trivia() {
    }

    public Trivia(Integer question_id, @NotBlank String question, @NotBlank String[] tags, @NotBlank String answer) {
        this.question_id = question_id;
        this.question = question;
        this.tags = tags;
        this.answer = answer;
    }

    public Integer getQuestion_id() {
        return question_id;
    }

    public void setQuestion_id(Integer question_id) {
        this.question_id = question_id;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String[] getTags() {
        return tags;
    }

    public void setTags(String[] tags) {
        this.tags = tags;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }
}