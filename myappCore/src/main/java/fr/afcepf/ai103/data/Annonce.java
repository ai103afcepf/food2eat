package fr.afcepf.ai103.data;

import java.util.Date;

public class Annonce {
	
	private int idAnnonce;
	private Date datePublicationAnnonce;
	private Date dateAnnulationAnnonce;
	private Date dateFermetureAnnonce;
	
	public Annonce() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Annonce [idAnnonce=" + idAnnonce + ", datePublicationAnnonce=" + datePublicationAnnonce
				+ ", dateAnnulationAnnonce=" + dateAnnulationAnnonce + ", dateFermetureAnnonce=" + dateFermetureAnnonce
				+ "]";
	}

	public int getIdAnnonce() {
		return idAnnonce;
	}

	public void setIdAnnonce(int idAnnonce) {
		this.idAnnonce = idAnnonce;
	}

	public Date getDatePublicationAnnonce() {
		return datePublicationAnnonce;
	}

	public void setDatePublicationAnnonce(Date datePublicationAnnonce) {
		this.datePublicationAnnonce = datePublicationAnnonce;
	}

	public Date getDateAnnulationAnnonce() {
		return dateAnnulationAnnonce;
	}

	public void setDateAnnulationAnnonce(Date dateAnnulationAnnonce) {
		this.dateAnnulationAnnonce = dateAnnulationAnnonce;
	}

	public Date getDateFermetureAnnonce() {
		return dateFermetureAnnonce;
	}

	public void setDateFermetureAnnonce(Date dateFermetureAnnonce) {
		this.dateFermetureAnnonce = dateFermetureAnnonce;
	}
	
	

}
