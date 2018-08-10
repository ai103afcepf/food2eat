package fr.afcepf.ai103.dao;

import fr.afcepf.ai103.data.RelationFoodFriend;

public interface IDaoRelationFoodFriend {

	public RelationFoodFriend insererFoodFrien(RelationFoodFriend frien1);
	
	public void mettreAJourRelationFoodFreind(RelationFoodFriend friend1);
	
	public IDaoRelationFoodFriend getFoodFriend(Integer idRelationFoodFriend);
	
}
