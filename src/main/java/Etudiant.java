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
     * Constructeur avec
     * @param pfNom
     * @param pfPrenom
     * @param PfIne
     * @param pfPromo
     * @param pfAdresse
     */
    public Etudiant(String pfNom, String pfPrenom, String PfIne, char pfPromo, Adresse pfAdresse) {
        this.nom = pfNom;
        this.prenom = pfPrenom;
        this.ine = PfIne;
        this.adresse = pfAdresse;
        this.promo = pfPromo;
    }
}

