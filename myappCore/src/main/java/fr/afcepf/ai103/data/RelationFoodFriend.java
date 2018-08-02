package fr.afcepf.ai103.data;

import java.util.Date;

public class RelationFoodFriend {
	
	private int idRelationFoodFriend;
	private Date dateDemandeFoodFriend;
	private Date dateRefusFoodFriend;
	private Date dateAcceptationFoodFriend;
	private Date dateRetraitFoodFriend;
	
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
	
}
