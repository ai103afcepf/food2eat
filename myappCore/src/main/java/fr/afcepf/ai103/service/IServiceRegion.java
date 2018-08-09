package fr.afcepf.ai103.service;

import java.util.List;

import fr.afcepf.ai103.data.Region;
import fr.afcepf.ai103.data.Ville;

public interface IServiceRegion {

	public Region creerOrModifierRegion(Region region);

	public List<Region> rechercherRegions();

	public Region rechercherRegionByIdRegion(Integer idregion);

	public List<Region> rechercherRegionByLibelleRegion(String libelleRegion);

	public List<Ville> rechercherRegionByNomVille(Integer idRegion);
}
