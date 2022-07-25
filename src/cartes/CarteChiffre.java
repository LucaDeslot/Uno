package cartes;

public class CarteChiffre extends Carte {

    private final int valeur ;

    public CarteChiffre(Uno uno, Couleur couleur, int valeur) {
        super(uno, couleur);
        this.valeur = valeur;
    }

    @Override
    public boolean peutEtreRecouverte(Carte c) {
        return c.peutEtrePoseeSur(this);
    }

    @Override
    public int getValeur() {
        return this.valeur;
    }

    @Override
    public int effet() {
        return 0;
    }
}
