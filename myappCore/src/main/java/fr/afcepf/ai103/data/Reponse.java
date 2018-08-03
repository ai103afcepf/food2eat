package fr.afcepf.ai103.data;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class Reponse {
	
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private String idReponse;
	 
	private Date dateReponseAnnonce;
	private Date dateAcceptationReservation;
	private Date dateAnnulationReservation;
	
	
	@ManyToOne
	@JoinColumn(name="idMotifAnnulationResa")
	private MotifAnnulationResa motifAnnulationResa;
	
	@ManyToOne
	@JoinColumn(name="idAnnonce")
	private Annonce annonce;
	
	@OneToOne
	@JoinColumn(name="idEvaluation")
	private Evaluation evaluation;
	
	
	public Reponse() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Reponse [idReponse=" + idReponse + ", dateReponseAnnonce=" + dateReponseAnnonce
				+ ", dateAcceptationReservation=" + dateAcceptationReservation + ", dateAnnulationReservation="
				+ dateAnnulationReservation + "]";
	}

	public String getIdReponse() {
		return idReponse;
	}

	public MotifAnnulationResa getMotifAnnulationResa() {
		return motifAnnulationResa;
	}

	public void setMotifAnnulationResa(MotifAnnulationResa motifAnnulationResa) {
		this.motifAnnulationResa = motifAnnulationResa;
	}

	public void setIdReponse(String idReponse) {
		this.idReponse = idReponse;
	}

	public Date getDateReponseAnnonce() {
		return dateReponseAnnonce;
	}

	public void setDateReponseAnnonce(Date dateReponseAnnonce) {
		this.dateReponseAnnonce = dateReponseAnnonce;
	} 

	public Date getDateAcceptationReservation() {
		return dateAcceptationReservation;
	}

	public void setDateAcceptationReservation(Date dateAcceptationReservation) {
		this.dateAcceptationReservation = dateAcceptationReservation;
	}

	public Date getDateAnnulationReservation() {
		return dateAnnulationReservation;
	}

	public void setDateAnnulationReservation(Date dateAnnulationReservation) {
		this.dateAnnulationReservation = dateAnnulationReservation;
	}
	public Annonce getAnnonce() {
		return annonce;
	}

	public void setAnnonce(Annonce annonce) {
		this.annonce = annonce;
	}

	public Evaluation getEvaluation() {
		return evaluation;
	}

	public void setEvaluation(Evaluation evaluation) {
		this.evaluation = evaluation;
	}
}
