package fr.afcepf.ai103.data;


public class Region {
	
	private int idRegion;
	private String labelRegion;
	
	
	public Region() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Region [idRegion=" + idRegion + ", labelRegion=" + labelRegion + "]";
	}
	public int getIdRegion() {
		return idRegion;
	}
	public void setIdRegion(int idRegion) {
		this.idRegion = idRegion;
	}
	public String getLabelRegion() {
		return labelRegion;
	}
	public void setLabelRegion(String labelRegion) {
		this.labelRegion = labelRegion;
	}
	
}
