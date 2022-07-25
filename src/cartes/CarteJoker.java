package cartes;

public class CarteJoker extends Carte {
    public CarteJoker(Uno uno) {
        super(uno);
    }

    @Override
    public boolean peutEtreRecouverte(Carte c) {
        return false;
    }

    @Override
    public boolean peutEtrePoseeSur(CarteChiffre c) {
        return true;
    }

    @Override
    public boolean peutEtrePoseeSur(CarteChangementDeSens c) {
        return true;
    }

    @Override
    public boolean peutEtrePoseeSur(CarteJoker c) {
        return true;
    }

    @Override
    public boolean peutEtrePoseeSur(CartePasseTonTour c) {
        return true;
    }

    @Override
    public boolean peutEtrePoseeSur(CartePlus2 c) {
        return true;
    }

    @Override
    public boolean peutEtrePoseeSur(CartePlus4 c) {
        return true;
    }

    @Override
    public int getValeur() {
        return 50;
    }

    @Override
    public int effet() {
        return 0;
    }
}
