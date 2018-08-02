package fr.afcepf.ai103.data;

public class Ville {

	private int idVille;
	private String codePostal;
	private String nomVille;
	
	public Ville() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Ville [idVille=" + idVille + ", codePostal=" + codePostal + ", nomVille=" + nomVille + "]";
	}

	public int getIdVille() {
		return idVille;
	}

	public void setIdVille(int idVille) {
		this.idVille = idVille;
	}

	public String getCodePostal() {
		return codePostal;
	}

	public void setCodePostal(String codePostal) {
		this.codePostal = codePostal;
	}

	public String getNomVille() {
		return nomVille;
	}

	public void setNomVille(String nomVille) {
		this.nomVille = nomVille;
	}
	
}
