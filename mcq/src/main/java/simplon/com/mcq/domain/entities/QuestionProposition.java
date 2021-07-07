package simplon.com.mcq.domain.entities;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "propositions")
public class QuestionProposition extends AbstractEntity {

    @OneToOne
    @JoinColumn(name = "question_id")
    private Question question;

    @OneToMany
    private List<Proposition> propositions;

    private int correctNumberAnswer;

    public QuestionProposition() {

    }

    public Question getQuestion() {
	return question;
    }

    public void setQuestion(Question question) {
	this.question = question;
    }

    public List<Proposition> getPropositions() {
	return propositions;
    }

    public void setPropositions(List<Proposition> propositions) {
	this.propositions = propositions;
    }

    public int getCorrectNumberAnswer() {
	return correctNumberAnswer;
    }

    public void setCorrectNumberAnswer(int correctNumberAnswer) {
	this.correctNumberAnswer = correctNumberAnswer;
    }

}
