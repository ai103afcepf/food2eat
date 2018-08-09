package fr.afcepf.ai103.data;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Notation {
	
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idNotation;
	
	private Integer note;
	private String imageNotation;
	 
	@OneToMany(mappedBy = "notation", fetch = FetchType.LAZY)
	private List<Evaluation> listeEvaluations;
	
	public Notation() {
		super();
	}

	@Override
	public String toString() {
		return "Notation [idNotation=" + idNotation + ", note=" + note + ", imageNotation=" + imageNotation + "]";
	}

	public Integer getIdNotation() {
		return idNotation;
	} 

	public void setIdNotation(Integer idNotation) {
		this.idNotation = idNotation;
	}

	public Integer getNote() {
		return note;
	}

	public void setNote(Integer note) {
		this.note = note;
	}

	public String getImageNotation() {
		return imageNotation;
	}

	public void setImageNotation(String imageNotation) {
		this.imageNotation = imageNotation;
	}

	public List<Evaluation> getListeEvaluation() {
		return listeEvaluations;
	}

	public void setListeEvaluation(List<Evaluation> listeEvaluation) {
		this.listeEvaluations = listeEvaluation;
	}
	
}
