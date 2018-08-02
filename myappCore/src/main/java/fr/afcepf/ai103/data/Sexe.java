package fr.afcepf.ai103.data;

public class Sexe {
	
	private int idSexe;
	private String libelleSexe;
	
	public Sexe() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Sexe [idSexe=" + idSexe + ", libelleSexe=" + libelleSexe + "]";
	}

	public int getIdSexe() {
		return idSexe;
	}

	public void setIdSexe(int idSexe) {
		this.idSexe = idSexe;
	}

	public String getLibelleSexe() {
		return libelleSexe;
	}

	public void setLibelleSexe(String libelleSexe) {
		this.libelleSexe = libelleSexe;
	}

}
