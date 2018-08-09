package fr.afcepf.ai103.data;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
//
@Entity
public class Mesure {
	
	@Id 
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer idMesure;
	
	private String uniteMesure;
	
	@OneToMany(mappedBy="mesure",fetch=FetchType.LAZY)
	private List<AlimentGenerique> listeAlimentsGeneriquesMesure;

	public Mesure() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Mesure [idMesure=" + idMesure + ", uniteMesure=" + uniteMesure + ", listeAlimentsGeneriquesMesure="
				+ listeAlimentsGeneriquesMesure + "]";
	}

	public Integer getIdMesure() {
		return idMesure;
	}

	public void setIdMesure(Integer idMesure) {
		this.idMesure = idMesure;
	}

	public String getUniteMesure() {
		return uniteMesure;
	}

	public void setUniteMesure(String uniteMesure) {
		this.uniteMesure = uniteMesure;
	}

	public List<AlimentGenerique> getListeAlimentsGeneriquesMesure() {
		return listeAlimentsGeneriquesMesure;
	}

	public void setListeAlimentsGeneriquesMesure(List<AlimentGenerique> listeAlimentsGeneriquesMesure) {
		this.listeAlimentsGeneriquesMesure = listeAlimentsGeneriquesMesure;
	}
	
	
	
}
