package fr.afcepf.ai103.data;

import java.util.Date;

public class AlimentGenerique {
	
	private int idAlimentGenerique;
	private String libelleAlimentGenerique;
	private String imageAlimentGenerique;
	private Date datePropositionReferencementAlimentGenerique;
	private Date dateRejetReferencementAlimentGenerique;
	private Date dateAcceptationReferencementAlimentGenerique;
	private Date dateModificationReferencementAlimentGenerique;
	private Date dateRetraitReferencementAlimentGenerique;
	
	public AlimentGenerique() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "AlimentGenerique [idAlimentGenerique=" + idAlimentGenerique + ", libelleAlimentGenerique="
				+ libelleAlimentGenerique + ", imageAlimentGenerique=" + imageAlimentGenerique
				+ ", datePropositionReferencementAlimentGenerique=" + datePropositionReferencementAlimentGenerique
				+ ", dateRejetReferencementAlimentGenerique=" + dateRejetReferencementAlimentGenerique
				+ ", dateAcceptationReferencementAlimentGenerique=" + dateAcceptationReferencementAlimentGenerique
				+ ", dateModificationReferencementAlimentGenerique=" + dateModificationReferencementAlimentGenerique
				+ ", dateRetraitReferencementAlimentGenerique=" + dateRetraitReferencementAlimentGenerique + "]";
	}

	public int getIdAlimentGenerique() {
		return idAlimentGenerique;
	}

	public void setIdAlimentGenerique(int idAlimentGenerique) {
		this.idAlimentGenerique = idAlimentGenerique;
	}

	public String getLibelleAlimentGenerique() {
		return libelleAlimentGenerique;
	}

	public void setLibelleAlimentGenerique(String libelleAlimentGenerique) {
		this.libelleAlimentGenerique = libelleAlimentGenerique;
	}

	public String getImageAlimentGenerique() {
		return imageAlimentGenerique;
	}

	public void setImageAlimentGenerique(String imageAlimentGenerique) {
		this.imageAlimentGenerique = imageAlimentGenerique;
	}

	public Date getDatePropositionReferencementAlimentGenerique() {
		return datePropositionReferencementAlimentGenerique;
	}

	public void setDatePropositionReferencementAlimentGenerique(Date datePropositionReferencementAlimentGenerique) {
		this.datePropositionReferencementAlimentGenerique = datePropositionReferencementAlimentGenerique;
	}

	public Date getDateRejetReferencementAlimentGenerique() {
		return dateRejetReferencementAlimentGenerique;
	}

	public void setDateRejetReferencementAlimentGenerique(Date dateRejetReferencementAlimentGenerique) {
		this.dateRejetReferencementAlimentGenerique = dateRejetReferencementAlimentGenerique;
	}

	public Date getDateAcceptationReferencementAlimentGenerique() {
		return dateAcceptationReferencementAlimentGenerique;
	}

	public void setDateAcceptationReferencementAlimentGenerique(Date dateAcceptationReferencementAlimentGenerique) {
		this.dateAcceptationReferencementAlimentGenerique = dateAcceptationReferencementAlimentGenerique;
	}

	public Date getDateModificationReferencementAlimentGenerique() {
		return dateModificationReferencementAlimentGenerique;
	}

	public void setDateModificationReferencementAlimentGenerique(Date dateModificationReferencementAlimentGenerique) {
		this.dateModificationReferencementAlimentGenerique = dateModificationReferencementAlimentGenerique;
	}

	public Date getDateRetraitReferencementAlimentGenerique() {
		return dateRetraitReferencementAlimentGenerique;
	}

	public void setDateRetraitReferencementAlimentGenerique(Date dateRetraitReferencementAlimentGenerique) {
		this.dateRetraitReferencementAlimentGenerique = dateRetraitReferencementAlimentGenerique;
	}
	
}
