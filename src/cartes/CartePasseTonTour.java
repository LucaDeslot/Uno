package cartes;

public class CartePasseTonTour extends Carte {

    public CartePasseTonTour(Uno uno, Couleur couleur) {
        super(uno, couleur);
    }

    @Override
    public boolean peutEtreRecouverte(Carte c) {
        return false;
    }

    @Override
    public boolean peutEtrePoseeSur(CartePasseTonTour c) {
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
