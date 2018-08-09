package fr.afcepf.ai103.dao;

import java.util.List;

import fr.afcepf.ai103.data.Region;
import fr.afcepf.ai103.data.Ville;

public interface IDaoRegion {

	public Region insererRegion(Region region);

	public void mettreAJourRegion(Region region);

	public Region rechercherRegionByIdRegion(Integer idRegion);

	public List<Region> rechercherRegions();

	public List<Region> rechercherRegionByLibelleRegion(String libelleRegion); // Select * from REGION

	public List<Ville> rechercherVilleParRegion(Integer idRegion);
}
