package fr.afcepf.ai103.web;

import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.event.ComponentSystemEvent;

import fr.afcepf.ai103.data.Utilisateur;
import fr.afcepf.ai103.data.Annonce;
import fr.afcepf.ai103.data.MotifAnnulationAnnonce;
import fr.afcepf.ai103.data.RendezVous;
import fr.afcepf.ai103.data.StockPerso;
import fr.afcepf.ai103.service.IServiceAnnonce;
import fr.afcepf.ai103.service.IServiceUtilisateur;

@ManagedBean
@SessionScoped
public class AnnonceBean {

	private Integer idUtilisateur = null;
	private Utilisateur utilisateurConnecte;
	
	private Integer idAnnonce;
	private Date dateCreationAnnonce;
	private Date datePublicationAnnonce;
	private Date dateFermetureAnnonce;
	private Date dateAnnulationCreationAnnonce;
	private Date dateAnnulationPublicationAnnonce;

	private String utilisateurAnnonce;
	private List<Annonce> listeAnnoncesAccueil;
	private List<RendezVous> listeRdvAnnonce;
	private MotifAnnulationAnnonce motifAnnulationAnnonce;
	private StockPerso stockPerso;

	private Annonce annonce;
	private Annonce selectedAnnonce;

	@EJB
	private IServiceAnnonce serviceAnnonce;

	@EJB
	private IServiceUtilisateur serviceUtilisateur;

	public AnnonceBean() {
		super();
	}

	@PostConstruct
	public void init(ComponentSystemEvent event) {
		listeAnnoncesAccueil = serviceAnnonce.rechercherAnnoncesAccueil(idUtilisateur).stream()
				.filter(e -> e.getDateFermetureAnnonce() == null)
				.filter(s -> s.getDateAnnulationCreationAnnonce() == null)
				.filter(obj -> obj.getDateAnnulationPublicationAnnonce() == null)
				.filter(e -> e.getMotifAnnulationAnnonce() == null).collect(Collectors.toList());
		listeRdvAnnonce = serviceAnnonce.afficherListeRdvByAnnonce(idAnnonce);
	}

	public List<RendezVous> getListeRdvAnnonce() {
		return listeRdvAnnonce;
	}

	public void setListeRdvAnnonce(List<RendezVous> listeRdvAnnonce) {
		this.listeRdvAnnonce = listeRdvAnnonce;
	}

	public Integer getIdAnnonce() {
		return idAnnonce;
	}

	public void setIdAnnonce(Integer idAnnonce) {
		this.idAnnonce = idAnnonce;
	}

	public Date getDateCreationAnnonce() {
		return dateCreationAnnonce;
	}

	public void setDateCreationAnnonce(Date dateCreationAnnonce) {
		this.dateCreationAnnonce = dateCreationAnnonce;
	}

	public Date getDatePublicationAnnonce() {
		return datePublicationAnnonce;
	}

	public void setDatePublicationAnnonce(Date datePublicationAnnonce) {
		this.datePublicationAnnonce = datePublicationAnnonce;
	}

	public Date getDateFermetureAnnonce() {
		return dateFermetureAnnonce;
	}

	public void setDateFermetureAnnonce(Date dateFermetureAnnonce) {
		this.dateFermetureAnnonce = dateFermetureAnnonce;
	}

	public Date getDateAnnulationCreationAnnonce() {
		return dateAnnulationCreationAnnonce;
	}

	public void setDateAnnulationCreationAnnonce(Date dateAnnulationCreationAnnonce) {
		this.dateAnnulationCreationAnnonce = dateAnnulationCreationAnnonce;
	}

	public Date getDateAnnulationPublicationAnnonce() {
		return dateAnnulationPublicationAnnonce;
	}

	public void setDateAnnulationPublicationAnnonce(Date dateAnnulationPublicationAnnonce) {
		this.dateAnnulationPublicationAnnonce = dateAnnulationPublicationAnnonce;
	}

	public String getUtilisateurAnnonce() {
		return utilisateurAnnonce;
	}

	public void setUtilisateurAnnonce(String utilisateurAnnonce) {
		this.utilisateurAnnonce = utilisateurAnnonce;
	}

	public List<Annonce> getListeAnnoncesAccueil() {
		return listeAnnoncesAccueil;
	}

	public void setListeAnnoncesAccueil(List<Annonce> listeAnnoncesAccueil) {
		this.listeAnnoncesAccueil = listeAnnoncesAccueil;
	}

	public MotifAnnulationAnnonce getMotifAnnulationAnnonce() {
		return motifAnnulationAnnonce;
	}

	public void setMotifAnnulationAnnonce(MotifAnnulationAnnonce motifAnnulationAnnonce) {
		this.motifAnnulationAnnonce = motifAnnulationAnnonce;
	}

	public StockPerso getStockPerso() {
		return stockPerso;
	}

	public void setStockPerso(StockPerso stockPerso) {
		this.stockPerso = stockPerso;
	}

	public Annonce getAnnonce() {
		return annonce;
	}

	public void setAnnonce(Annonce annonce) {
		this.annonce = annonce;
	}

	public IServiceAnnonce getServiceAnnonce() {
		return serviceAnnonce;
	}

	public void setServiceAnnonce(IServiceAnnonce serviceAnnonce) {
		this.serviceAnnonce = serviceAnnonce;
	}

	public Annonce getSelectedAnnonce() {
		return selectedAnnonce;
	}

	public void setSelectedAnnonce(Annonce selectedAnnonce) {
		this.selectedAnnonce = selectedAnnonce;
	}

	public IServiceUtilisateur getServiceUtilisateur() {
		return serviceUtilisateur;
	}

	public void setServiceUtilisateur(IServiceUtilisateur serviceUtilisateur) {
		this.serviceUtilisateur = serviceUtilisateur;
	}

}
