package tests;

import cartes.*;

import java.util.Random;

public class FabriqueCartes {

  private static FabriqueCartes instance = new FabriqueCartes();

  public static FabriqueCartes getInstance() {return instance;}

  private FabriqueCartes(){}

  public PaquetDeCartes getPaquetVide() {
    return new PaquetDeCartes();
  }

  public PaquetDeCartes getPaquet0Vert() {
    PaquetDeCartes paquet = new PaquetDeCartes();
    Carte[] cartes = new Carte[1];
    cartes[0] = new CarteChiffre(new Uno(), Couleur.VERT,0);
    paquet.ajouter(cartes);
    return paquet;
  }

  public PaquetDeCartes getPaquet9Jaune() {
    PaquetDeCartes paquet = new PaquetDeCartes();
    Carte[] cartes = new Carte[1];
    cartes[0] = new CarteChiffre(new Uno(), Couleur.JAUNE, 9);
    paquet.ajouter(cartes);
    return paquet;
  }

  public PaquetDeCartes getPaquet9Rouge() {
    PaquetDeCartes paquet = new PaquetDeCartes();
    Carte[] cartes = new Carte[1];
    cartes[0] = new CarteChiffre(new Uno(), Couleur.ROUGE, 9);
    paquet.ajouter(cartes);
    return paquet;
  }

  public PaquetDeCartes getPaquet0Bleu() {
    PaquetDeCartes paquet = new PaquetDeCartes();
    Carte[] cartes = new Carte[1];
    cartes[0] = new CarteChiffre(new Uno(), Couleur.BLEU, 0);
    paquet.ajouter(cartes);
    return paquet;
  }

  public PaquetDeCartes getPaquetJoker(){
    PaquetDeCartes paquet = new PaquetDeCartes();
    Carte[] cartes = new Carte[1];
    cartes[0] = new CarteJoker(new Uno());
    paquet.ajouter(cartes);
    return paquet;
  }

  public PaquetDeCartes getPaquetPasseTour(){
    PaquetDeCartes paquet = new PaquetDeCartes();
    Carte[] cartes = new Carte[1];
    cartes[0] = new CartePasseTonTour(new Uno(), Couleur.BLEU);
    paquet.ajouter(cartes);
    return paquet;
  }

  public PaquetDeCartes getPaquetPlus4(){
    PaquetDeCartes paquet = new PaquetDeCartes();
    Carte[] cartes = new Carte[1];
    cartes[0] = new CartePlus4(new Uno());
    paquet.ajouter(cartes);
    return paquet;
  }

  public PaquetDeCartes getPaquetPlus2(){
    PaquetDeCartes paquet = new PaquetDeCartes();
    Carte[] cartes = new Carte[1];
    cartes[0] = new CartePlus2(new Uno(), Couleur.BLEU);
    paquet.ajouter(cartes);
    return paquet;
  }

  public PaquetDeCartes getPaquetChangementSens(){
    PaquetDeCartes paquet = new PaquetDeCartes();
    Carte[] cartes = new Carte[1];
    cartes[0] = new CarteChangementDeSens(new Uno(), Couleur.BLEU);
    paquet.ajouter(cartes);
    return paquet;
  }
}
