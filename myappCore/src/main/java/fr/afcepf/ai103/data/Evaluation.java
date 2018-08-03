package fr.afcepf.ai103.data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Evaluation {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idEvaluation;
	
	private String commentaireEvaluation;
	 
	@ManyToOne
	@JoinColumn(name="idNotation")
	private Notation notation;
	
	public Notation getNotation() {
		return notation;
	}

	public void setNotation(Notation notation) {
		this.notation = notation;
	}

	public Evaluation() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Evaluation [idEvaluation=" + idEvaluation + ", commentaireEvaluation=" + commentaireEvaluation + "]";
	}

	public int getIdEvaluation() {
		return idEvaluation;
	}

	public void setIdEvaluation(int idEvaluation) {
		this.idEvaluation = idEvaluation;
	} 

	public String getCommentaireEvaluation() {
		return commentaireEvaluation;
	}

	public void setCommentaireEvaluation(String commentaireEvaluation) {
		this.commentaireEvaluation = commentaireEvaluation;
	}

}
