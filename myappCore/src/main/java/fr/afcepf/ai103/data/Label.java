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
public class Label {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idLabel;
	
	private String libelleLabel;
	private String imageLabel;
	
	@OneToMany(mappedBy="label",fetch=FetchType.LAZY)
	private List<AlimentGenerique> listeAlimentsGeneriquesLabel;
	
	public Label() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Label [idLabel=" + idLabel + ", libelleLabel=" + libelleLabel + ", imageLabel=" + imageLabel + "]";
	}

	public int getIdLabel() {
		return idLabel;
	}

	public void setIdLabel(int idLabel) {
		this.idLabel = idLabel;
	}

	public String getLibelleLabel() {
		return libelleLabel;
	}

	public void setLibelleLabel(String libelleLabel) {
		this.libelleLabel = libelleLabel;
	}

	public String getImageLabel() {
		return imageLabel;
	}

	public void setImageLabel(String imageLabel) {
		this.imageLabel = imageLabel;
	}

	public List<AlimentGenerique> getListeAlimentsGeneriquesLabel() {
		return listeAlimentsGeneriquesLabel;
	}

	public void setListeAlimentsGeneriquesLabel(List<AlimentGenerique> listeAlimentsGeneriquesLabel) {
		this.listeAlimentsGeneriquesLabel = listeAlimentsGeneriquesLabel;
	}
	
}
