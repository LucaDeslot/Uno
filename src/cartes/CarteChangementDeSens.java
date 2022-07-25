package cartes;

public class CarteChangementDeSens extends Carte {

    public CarteChangementDeSens(Uno uno, Couleur c){
        super(uno, c);
    }

    @Override
    public boolean peutEtreRecouverte(Carte c) {
        return c.peutEtrePoseeSur(this);
    }

    @Override
    public boolean peutEtrePoseeSur(CarteChangementDeSens c) {
        return true;
    }

    @Override
    public int getValeur() {
        return 20;
    }

    @Override
    public int effet() {
        return 0;
    }

}
