package cartes;

public class CartePlus2 extends Carte{

    public CartePlus2(Uno uno, Couleur couleur) {
        super(uno, couleur);
    }

    @Override
    public boolean peutEtreRecouverte(Carte c) {
        return false;
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
