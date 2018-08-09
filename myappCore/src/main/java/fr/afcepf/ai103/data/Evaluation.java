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
	
	private Long noteEvaluation;
	private String commentaireEvaluation;
	 
		
	@OneToOne(mappedBy="evaluation")
	private Reponse reponseEvalutaion;
	
	public Evaluation() {
		super();
	}

	
	@Override
	public String toString() {
		return "Evaluation [idEvaluation=" + idEvaluation + ", noteEvaluation=" + noteEvaluation
				+ ", commentaireEvaluation=" + commentaireEvaluation + "]";
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

	public Long getNoteEvaluation() {
		return noteEvaluation;
	}

	public void setNoteEvaluation(Long noteEvaluation) {
		this.noteEvaluation = noteEvaluation;
	}

	public Reponse getReponseEvalutaion() {
		return reponseEvalutaion;
	}

	public void setReponseEvalutaion(Reponse reponseEvalutaion) {
		this.reponseEvalutaion = reponseEvalutaion;
	}


}
