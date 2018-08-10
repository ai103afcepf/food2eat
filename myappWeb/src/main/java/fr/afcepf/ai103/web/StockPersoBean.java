package fr.afcepf.ai103.web;

import java.util.Date;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import fr.afcepf.ai103.data.AlimentGenerique;
import fr.afcepf.ai103.data.Annonce;
import fr.afcepf.ai103.data.Consommation;
import fr.afcepf.ai103.data.StockPerso;
import fr.afcepf.ai103.data.Utilisateur;
import fr.afcepf.ai103.service.IServiceStockPerso;

@ManagedBean
@SessionScoped
public class StockPersoBean {
	

	private Integer idStockPerso;
	private Integer quantiteStockPerso;
	private Date dlcStockPerso;
	private Date dateAjoutStockPerso;
	private Date dateConsoChoisieStockPerso;
	private Utilisateur utilisateurStock;
	private List<Consommation> listeConsommations;
	private List<Annonce> listesAnnoncesStock;
	private AlimentGenerique alimentGenerique;
	
	private StockPerso stock;
	
	@EJB
	private IServiceStockPerso serviceStokPerso;
	
	public StockPersoBean() {
	
	}
	
	@PostConstruct
	public void init() {
		System.out.println("dans methode prefixée par @PostConstruct, serviceStokPerso=" + serviceStokPerso);
		stock = serviceStokPerso.recupererAlimentById(2);
	}
	

	public Integer getIdStockPerso() {
		return idStockPerso;
	}

	public void setIdStockPerso(Integer idStockPerso) {
		this.idStockPerso = idStockPerso;
	}

	public Integer getQuantiteStockPerso() {
		return quantiteStockPerso;
	}

	public void setQuantiteStockPerso(Integer quantiteStockPerso) {
		this.quantiteStockPerso = quantiteStockPerso;
	}

	public Date getDlcStockPerso() {
		return dlcStockPerso;
	}

	public void setDlcStockPerso(Date dlcStockPerso) {
		this.dlcStockPerso = dlcStockPerso;
	}

	public Date getDateAjoutStockPerso() {
		return dateAjoutStockPerso;
	}

	public void setDateAjoutStockPerso(Date dateAjoutStockPerso) {
		this.dateAjoutStockPerso = dateAjoutStockPerso;
	}

	public Date getDateConsoChoisieStockPerso() {
		return dateConsoChoisieStockPerso;
	}

	public void setDateConsoChoisieStockPerso(Date dateConsoChoisieStockPerso) {
		this.dateConsoChoisieStockPerso = dateConsoChoisieStockPerso;
	}

	public Utilisateur getUtilisateurStock() {
		return utilisateurStock;
	}

	public void setUtilisateurStock(Utilisateur utilisateurStock) {
		this.utilisateurStock = utilisateurStock;
	}

	public List<Consommation> getListeConsommations() {
		return listeConsommations;
	}

	public void setListeConsommations(List<Consommation> listeConsommations) {
		this.listeConsommations = listeConsommations;
	}

	public List<Annonce> getListesAnnoncesStock() {
		return listesAnnoncesStock;
	}

	public void setListesAnnoncesStock(List<Annonce> listesAnnoncesStock) {
		this.listesAnnoncesStock = listesAnnoncesStock;
	}

	public AlimentGenerique getAlimentGenerique() {
		return alimentGenerique;
	}

	public void setAlimentGenerique(AlimentGenerique alimentGenerique) {
		this.alimentGenerique = alimentGenerique;
	}

//	public IServiceStockPerso getServiceStokPerso() {
//		return serviceStokPerso;
//	}
//
//	public void setServiceStokPerso(IServiceStockPerso serviceStokPerso) {
//		this.serviceStokPerso = serviceStokPerso;
//	}

	public StockPerso getStock() {
		return stock;
	}

	public void setStock(StockPerso stock) {
		this.stock = stock;
	}


	
	
	
	
	

}
