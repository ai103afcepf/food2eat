package fr.afcepf.ai103.data;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

//
@Entity
public class AlimentGenerique {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idAlimentGenerique;
	private long codeBarreAlimentGenerique;
	public long getCodeBarreAlimentGenerique() {
		return codeBarreAlimentGenerique;
	}

	public void setCodeBarreAlimentGenerique(long codeBarreAlimentGenerique) {
		this.codeBarreAlimentGenerique = codeBarreAlimentGenerique;
	}

	private String libelleAlimentGenerique;
	private String imageAlimentGenerique;
	@Temporal(TemporalType.DATE)
	private Date datePropositionReferencementAlimentGenerique;
	@Temporal(TemporalType.DATE)
	private Date dateRejetReferencementAlimentGenerique;
	@Temporal(TemporalType.DATE)
	private Date dateAcceptationReferencementAlimentGenerique;
	@Temporal(TemporalType.DATE)
	private Date dateModificationReferencementAlimentGenerique;
	@Temporal(TemporalType.DATE)
	private Date dateRetraitReferencementAlimentGenerique;

	@OneToMany(mappedBy = "alimentGenerique", fetch = FetchType.LAZY)
	private List<StockPerso> listeAlimentsStockPerso;

	@ManyToOne
	@JoinColumn(name = "idCategorieAliment")
	private CategorieAliment categorieAliment;

	@ManyToOne
	@JoinColumn(name = "idStockageConservation")
	private StockageConservation stockageConservation;

	@ManyToOne
	@JoinColumn(name = "idPackagingContenant")
	private PackagingContenant packagingContenant;

	@ManyToOne
	@JoinColumn(name = "idMotifRejetRef")
	private MotifRejetRef motifRejetRef;

	@ManyToOne
	@JoinColumn(name = "idMotifRetraitRef")
	private MotifRejetRef motifRetraitRef;

	@ManyToOne
	@JoinColumn(name = "idOrigine")
	private Origine origine;

	@ManyToOne
	@JoinColumn(name = "idLabel")
	private Label label;

	@ManyToOne
	@JoinColumn(name = "idNutriscore")
	private Nutriscore nutriscore;

	@ManyToOne
	@JoinColumn(name = "idPortionUnite")
	private PortionUnite portionUnite;

	@ManyToOne
	@JoinColumn(name = "idNbUnites")
	private NbUnites nbUnites;

	public AlimentGenerique() {
		super();
	}

	@Override
	public String toString() {
		return "AlimentGenerique [idAlimentGenerique=" + idAlimentGenerique + ", libelleAlimentGenerique="
				+ libelleAlimentGenerique + ", imageAlimentGenerique=" + imageAlimentGenerique
				+ ", datePropositionReferencementAlimentGenerique=" + datePropositionReferencementAlimentGenerique
				+ ", dateRejetReferencementAlimentGenerique=" + dateRejetReferencementAlimentGenerique
				+ ", dateAcceptationReferencementAlimentGenerique=" + dateAcceptationReferencementAlimentGenerique
				+ ", dateModificationReferencementAlimentGenerique=" + dateModificationReferencementAlimentGenerique
				+ ", dateRetraitReferencementAlimentGenerique=" + dateRetraitReferencementAlimentGenerique + "]";
	}

	public Integer getIdAlimentGenerique() {
		return idAlimentGenerique;
	}

	public void setIdAlimentGenerique(Integer idAlimentGenerique) {
		this.idAlimentGenerique = idAlimentGenerique;
	}

	public String getLibelleAlimentGenerique() {
		return libelleAlimentGenerique;
	}

	public void setLibelleAlimentGenerique(String libelleAlimentGenerique) {
		this.libelleAlimentGenerique = libelleAlimentGenerique;
	}

	public String getImageAlimentGenerique() {
		return imageAlimentGenerique;
	}

	public void setImageAlimentGenerique(String imageAlimentGenerique) {
		this.imageAlimentGenerique = imageAlimentGenerique;
	}

	public Date getDatePropositionReferencementAlimentGenerique() {
		return datePropositionReferencementAlimentGenerique;
	}

	public void setDatePropositionReferencementAlimentGenerique(Date datePropositionReferencementAlimentGenerique) {
		this.datePropositionReferencementAlimentGenerique = datePropositionReferencementAlimentGenerique;
	}

	public Date getDateRejetReferencementAlimentGenerique() {
		return dateRejetReferencementAlimentGenerique;
	}

	public void setDateRejetReferencementAlimentGenerique(Date dateRejetReferencementAlimentGenerique) {
		this.dateRejetReferencementAlimentGenerique = dateRejetReferencementAlimentGenerique;
	}

	public Date getDateAcceptationReferencementAlimentGenerique() {
		return dateAcceptationReferencementAlimentGenerique;
	}

	public void setDateAcceptationReferencementAlimentGenerique(Date dateAcceptationReferencementAlimentGenerique) {
		this.dateAcceptationReferencementAlimentGenerique = dateAcceptationReferencementAlimentGenerique;
	}

	public Date getDateModificationReferencementAlimentGenerique() {
		return dateModificationReferencementAlimentGenerique;
	}

	public void setDateModificationReferencementAlimentGenerique(Date dateModificationReferencementAlimentGenerique) {
		this.dateModificationReferencementAlimentGenerique = dateModificationReferencementAlimentGenerique;
	}

	public Date getDateRetraitReferencementAlimentGenerique() {
		return dateRetraitReferencementAlimentGenerique;
	}

	public void setDateRetraitReferencementAlimentGenerique(Date dateRetraitReferencementAlimentGenerique) {
		this.dateRetraitReferencementAlimentGenerique = dateRetraitReferencementAlimentGenerique;
	}

	public CategorieAliment getCategorieAliment() {
		return categorieAliment;
	}

	public void setCategorieAliment(CategorieAliment categorieAliment) {
		this.categorieAliment = categorieAliment;
	}

	public StockageConservation getStockageConservation() {
		return stockageConservation;
	}

	public void setStockageConservation(StockageConservation stockageConservation) {
		this.stockageConservation = stockageConservation;
	}

	public PackagingContenant getPackagingContenant() {
		return packagingContenant;
	}

	public void setPackagingContenant(PackagingContenant packagingContenant) {
		this.packagingContenant = packagingContenant;
	}

	public MotifRejetRef getMotifRejetRef() {
		return motifRejetRef;
	}

	public void setMotifRejetRef(MotifRejetRef motifRejetRef) {
		this.motifRejetRef = motifRejetRef;
	}

	public MotifRejetRef getMotifRetraitRef() {
		return motifRetraitRef;
	}

	public void setMotifRetraitRef(MotifRejetRef motifRetraitRef) {
		this.motifRetraitRef = motifRetraitRef;
	}

	public Origine getOrigine() {
		return origine;
	}

	public void setOrigine(Origine origine) {
		this.origine = origine;
	}

	public Label getLabel() {
		return label;
	}

	public void setLabel(Label label) {
		this.label = label;
	}

	public Nutriscore getNutriscore() {
		return nutriscore;
	}

	public void setNutriscore(Nutriscore nutriscore) {
		this.nutriscore = nutriscore;
	}

	public PortionUnite getPortionUnite() {
		return portionUnite;
	}

	public void setPortionUnite(PortionUnite portionUnite) {
		this.portionUnite = portionUnite;
	}

	public NbUnites getNbUnites() {
		return nbUnites;
	}

	public void setNbUnites(NbUnites nbUnites) {
		this.nbUnites = nbUnites;
	}

	public List<StockPerso> getListeAlimentsStockPerso() {
		return listeAlimentsStockPerso;
	}

	public void setListeAlimentsStockPerso(List<StockPerso> listeAlimentsStockPerso) {
		this.listeAlimentsStockPerso = listeAlimentsStockPerso;
	}

}
