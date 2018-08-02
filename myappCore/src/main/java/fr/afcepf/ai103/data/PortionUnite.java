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
public class PortionUnite {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idPortionUnite;
	
	private int quantitePortionUnite;
	private String unitePortionUnite;
	
	@OneToMany(mappedBy="portionUnite",fetch=FetchType.LAZY)
	private List<AlimentGenerique> listeAlimentsGeneriquesPortionUnite;
	
	
	public PortionUnite() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "PortionUnite [idPortionUnite=" + idPortionUnite + ", quantitePortionUnite=" + quantitePortionUnite
				+ ", unitePortionUnite=" + unitePortionUnite + "]";
	}

	public int getIdPortionUnite() {
		return idPortionUnite;
	}

	public void setIdPortionUnite(int idPortionUnite) {
		this.idPortionUnite = idPortionUnite;
	}

	public int getQuantitePortionUnite() {
		return quantitePortionUnite;
	}

	public void setQuantitePortionUnite(int quantitePortionUnite) {
		this.quantitePortionUnite = quantitePortionUnite;
	}

	public String getUnitePortionUnite() {
		return unitePortionUnite;
	}

	public void setUnitePortionUnite(String unitePortionUnite) {
		this.unitePortionUnite = unitePortionUnite;
	}

	public List<AlimentGenerique> getListeAlimentsGeneriquesPortionUnite() {
		return listeAlimentsGeneriquesPortionUnite;
	}

	public void setListeAlimentsGeneriquesPortionUnite(List<AlimentGenerique> listeAlimentsGeneriquesPortionUnite) {
		this.listeAlimentsGeneriquesPortionUnite = listeAlimentsGeneriquesPortionUnite;
	}
	
}
