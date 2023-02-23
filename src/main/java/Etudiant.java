/**
 * TP1 DEV 2
 * @author Dylan
 */
public class Etudiant {
    String nom, prenom, ine;
    Adresse adresse;
    char promo;
    
    /**
     * Constructeur par défaut pour créer un objet Etudiant
     */
    public Etudiant() {
        this.nom = "";
        this.prenom = "";
        this.ine = "";
        this.adresse = new Adresse();
        this.promo = '0';
    }
    
    /**
     * Constructeur avec paramètres pour créer un objet Etudiant
     * @param pfNom IN : nom de l'étudiant
     * @param pfPrenom IN : prénom de l'étudiant
     * @param PfIne IN : INE de l'étudiant
     * @param pfPromo IN : promo de l'étudiant
     * @param pfAdresse IN : adresse de l'étudiant
     */
    public Etudiant(String pfNom, String pfPrenom, String PfIne, char pfPromo, Adresse pfAdresse) {
        this.nom = pfNom;
        this.prenom = pfPrenom;
        this.ine = PfIne;
        this.adresse = pfAdresse;
        this.promo = pfPromo;
    }
}

