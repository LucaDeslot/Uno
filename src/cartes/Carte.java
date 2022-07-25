package cartes;

public abstract class Carte {

    private Couleur couleur ;
    private Uno uno;

    public Carte(Uno uno, Couleur couleur) {
        this.uno = uno;
        this.couleur = couleur;
    }

    public Carte(Uno uno){
        this.uno = uno;
    }

    public abstract boolean peutEtreRecouverte(Carte c);

    public abstract int getValeur();

    public abstract int effet();

    public Couleur getCouleur() {
        return couleur;
    }

    public void setCouleur(Couleur c) {
        this.couleur = c;
    }

    public boolean estSansCouleur(){
        return false;
    }

    public void appliquerEffet(){

    }

    public boolean estDeCouleurCompatible(Couleur c){
        return this.couleur == c;
    }

    public boolean peutEtrePoseeSur(CarteChiffre c){
        return c.getCouleur() == this.getCouleur() || c.getValeur() == this.getValeur();
    }

    public boolean peutEtrePoseeSur(CarteChangementDeSens c){
        return c.getCouleur() == this.getCouleur();
    }

    public boolean peutEtrePoseeSur(CarteJoker c){
        return c.getCouleur() == this.getCouleur();
    }

    public boolean peutEtrePoseeSur(CartePasseTonTour c){
        return c.getCouleur() == this.getCouleur();
    }

    public boolean peutEtrePoseeSur(CartePlus2 c){
        return c.getCouleur() == this.getCouleur();
    }

    public boolean peutEtrePoseeSur(CartePlus4 c){
        return c.getCouleur() == this.getCouleur();
    }
}
