package fr.afcepf.ai103.data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class Evaluation {
	
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idEvaluation;
	
	private String commentaireEvaluation;
	 
	@ManyToOne
	@JoinColumn(name="idNotation")
	private Notation notation;
	
	@OneToOne(mappedBy="evaluation")
	private Reponse reponseEvalutaion;
	
	public Evaluation() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Evaluation [idEvaluation=" + idEvaluation + ", commentaireEvaluation=" + commentaireEvaluation + "]";
	}

	public Integer getIdEvaluation() {
		return idEvaluation;
	}

	public void setIdEvaluation(Integer idEvaluation) {
		this.idEvaluation = idEvaluation;
	}

	public String getCommentaireEvaluation() {
		return commentaireEvaluation;
	}

	public void setCommentaireEvaluation(String commentaireEvaluation) {
		this.commentaireEvaluation = commentaireEvaluation;
	}

	public Notation getNotation() {
		return notation;
	}

	public void setNotation(Notation notation) {
		this.notation = notation;
	}

	public Reponse getReponseEvalutaion() {
		return reponseEvalutaion;
	}

	public void setReponseEvalutaion(Reponse reponseEvalutaion) {
		this.reponseEvalutaion = reponseEvalutaion;
	}


}
