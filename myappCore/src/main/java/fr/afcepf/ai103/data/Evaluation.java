package fr.afcepf.ai103.data;

public class Evaluation {
	
	private int idEvaluation;
	private String commentaireEvaluation;
	
	public Evaluation() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Evaluation [idEvaluation=" + idEvaluation + ", commentaireEvaluation=" + commentaireEvaluation + "]";
	}

	public int getIdEvaluation() {
		return idEvaluation;
	}

	public void setIdEvaluation(int idEvaluation) {
		this.idEvaluation = idEvaluation;
	}

	public String getCommentaireEvaluation() {
		return commentaireEvaluation;
	}

	public void setCommentaireEvaluation(String commentaireEvaluation) {
		this.commentaireEvaluation = commentaireEvaluation;
	}

}
