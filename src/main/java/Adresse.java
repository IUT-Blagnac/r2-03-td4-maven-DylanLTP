/**
 * TP1 DEV 2
 * @author Dylan
 */
public class Adresse {
    String nomRue, codePostal, ville;
    int numRue;
    
    /**
     * Constructeur par défaut pour créer un objet Adresse
     */
    Adresse() {
        this.numRue = 1;
        this.nomRue = "";
        this.codePostal = "";
        this.ville = "";
    }
    
    /**
     * Constructeur avec paramètres pour créer un objet Adresse
     * @param pfNumRue IN : Numéro de la rue
     * @param pfNomRue IN : Nom de la rue
     * @param pfCodePostal IN : Code postal de la ville
     * @param pfVille IN : Nom de la ville
     */
    Adresse(int pfNumRue, String pfNomRue, String pfCodePostal, String pfVille) {
        this.numRue = pfNumRue;
        this.nomRue = pfNomRue;
        this.codePostal = pfCodePostal;
        this.ville = pfVille;
    }
}

