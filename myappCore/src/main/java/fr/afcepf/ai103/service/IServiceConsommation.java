package fr.afcepf.ai103.service;

import java.util.List;

import fr.afcepf.ai103.data.Consommation;

public interface IServiceConsommation {
	public Consommation ajouterConsommation (Consommation conso);
	public List<Consommation> recupererListAlimentsStockJeter (Integer idStockPerso);
	public List<Consommation> recupererListAlimentsStockConso (Integer idStockPerso);
}
