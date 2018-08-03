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
public class NbUnites {
	
	@Id 
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idNbUnites;
	
	private int quantiteNbUnites;
	
	@OneToMany(mappedBy="nbUnites",fetch=FetchType.LAZY)
	private List<AlimentGenerique> listeAlimentsGeneriquesNbUnite;
	
	
	public NbUnites() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "NbUnites [idNbUnites=" + idNbUnites + ", quantiteNbUnites=" + quantiteNbUnites + "]";
	}

	public int getIdNbUnites() {
		return idNbUnites;
	}

	public void setIdNbUnites(int idNbUnites) {
		this.idNbUnites = idNbUnites;
	}

	public int getQuantiteNbUnites() {
		return quantiteNbUnites;
	}

	public void setQuantiteNbUnites(int quantiteNbUnites) {
		this.quantiteNbUnites = quantiteNbUnites;
	}

	public List<AlimentGenerique> getListeAlimentsGeneriquesNbUnite() {
		return listeAlimentsGeneriquesNbUnite;
	}

	public void setListeAlimentsGeneriquesNbUnite(List<AlimentGenerique> listeAlimentsGeneriquesNbUnite) {
		this.listeAlimentsGeneriquesNbUnite = listeAlimentsGeneriquesNbUnite;
	}
	
}
