package simplon.com.mcq.domain.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "propositions")
public class Proposition extends AbstractEntity {

    @Column(name = "proposition_text")
    private String propositionText;

    public Proposition() {

    }

    public String getPropositionText() {
	return propositionText;
    }

    public void setPropositionText(String propositionText) {
	this.propositionText = propositionText;
    }

}
