package fr.afcepf.ai103.data;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class RelationFoodFriend {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idRelationFoodFriend;
	
	private Date dateDemandeFoodFriend;
	private Date dateRefusFoodFriend;
	private Date dateAcceptationFoodFriend;
	private Date dateRetraitFoodFriend;
	
	@ManyToOne // (cascade = CascadeType.ALL)
	@JoinColumn(name = "idUtilisateur")
	private Utilisateur utilisateur1;
	
	@ManyToOne // (cascade = CascadeType.ALL)
	@JoinColumn(name = "idUtilisateur")
	private Utilisateur utilisateur2;
	
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

	public int getIdRelationFoodFriend() {
		return idRelationFoodFriend;
	}

	public void setIdRelationFoodFriend(int idRelationFoodFriend) {
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

	public Utilisateur getUtilisateur1() {
		return utilisateur1;
	}

	public void setUtilisateur1(Utilisateur utilisateur1) {
		this.utilisateur1 = utilisateur1;
	}

	public Utilisateur getUtilisateur2() {
		return utilisateur2;
	}

	public void setUtilisateur2(Utilisateur utilisateur2) {
		this.utilisateur2 = utilisateur2;
	}
	
}
