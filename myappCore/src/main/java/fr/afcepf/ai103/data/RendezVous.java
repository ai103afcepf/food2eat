package fr.afcepf.ai103.data;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class RendezVous {  
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idRendezVous;
	private Date dateRendezVous;
	
	
	public RendezVous() {
		super();
		// TODO Auto-generated constructor stub
	}


	@Override
	public String toString() {
		return "RendezVous [idRendezVous=" + idRendezVous + ", dateRendezVous=" + dateRendezVous + "]";
	}


	public int getIdRendezVous() {
		return idRendezVous;
	}


	public void setIdRendezVous(int idRendezVous) {
		this.idRendezVous = idRendezVous;
	}


	public Date getDateRendezVous() {
		return dateRendezVous;
	}


	public void setDateRendezVous(Date dateRendezVous) {
		this.dateRendezVous = dateRendezVous;
	}
	
	

}
