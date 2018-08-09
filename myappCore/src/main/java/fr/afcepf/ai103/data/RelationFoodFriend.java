package fr.afcepf.ai103.data;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class RelationFoodFriend {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idRelationFoodFriend;
	@Temporal(TemporalType.DATE)
	private Date dateDemandeFoodFriend;
	@Temporal(TemporalType.DATE)
	private Date dateRefusFoodFriend;
	@Temporal(TemporalType.DATE)
	private Date dateAcceptationFoodFriend;
	@Temporal(TemporalType.DATE)
	private Date dateRetraitFoodFriend;

	@ManyToOne // (cascade = CascadeType.ALL)
	@JoinColumn(name = "idUtilisateur")
	private Utilisateur utilisateurFriend1;

	@ManyToOne // (cascade = CascadeType.ALL)
	@JoinColumn(name = "idFriend")
	private Utilisateur utilisateurFriend2;

	public RelationFoodFriend() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "RelationFoodFriend [idRelationFoodFriend=" + idRelationFoodFriend + ", dateDemandeFoodFriend="
				+ dateDemandeFoodFriend + ", dateRefusFoodFriend=" + dateRefusFoodFriend
				+ ", dateAcceptationFoodFriend=" + dateAcceptationFoodFriend + ", dateRetraitFoodFriend="
				+ dateRetraitFoodFriend + "]";
	}

	public Integer getIdRelationFoodFriend() {
		return idRelationFoodFriend;
	}

	public void setIdRelationFoodFriend(Integer idRelationFoodFriend) {
		this.idRelationFoodFriend = idRelationFoodFriend;
	}

	public Date getDateDemandeFoodFriend() {
		return dateDemandeFoodFriend;
	}

	public void setDateDemandeFoodFriend(Date dateDemandeFoodFriend) {
		this.dateDemandeFoodFriend = dateDemandeFoodFriend;
	}

	public Date getDateRefusFoodFriend() {
		return dateRefusFoodFriend;
	}

	public void setDateRefusFoodFriend(Date dateRefusFoodFriend) {
		this.dateRefusFoodFriend = dateRefusFoodFriend;
	}

	public Date getDateAcceptationFoodFriend() {
		return dateAcceptationFoodFriend;
	}

	public void setDateAcceptationFoodFriend(Date dateAcceptationFoodFriend) {
		this.dateAcceptationFoodFriend = dateAcceptationFoodFriend;
	}

	public Date getDateRetraitFoodFriend() {
		return dateRetraitFoodFriend;
	}

	public void setDateRetraitFoodFriend(Date dateRetraitFoodFriend) {
		this.dateRetraitFoodFriend = dateRetraitFoodFriend;
	}

	public Utilisateur getUtilisateurFriend1() {
		return utilisateurFriend1;
	}

	public void setUtilisateurFriend1(Utilisateur utilisateurFriend1) {
		this.utilisateurFriend1 = utilisateurFriend1;
	}

	public Utilisateur getUtilisateurFriend2() {
		return utilisateurFriend2;
	}

	public void setUtilisateurFriend2(Utilisateur utilisateurFriend2) {
		this.utilisateurFriend2 = utilisateurFriend2;
	}

}
