package fr.afcepf.ai103.data;

import java.util.Date;

public class Reponse {
	
	private String idReponse;
	private Date dateReponseAnnonce;
	private Date dateAcceptationReservation;
	private Date dateAnnulationReservation;
	
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

}
