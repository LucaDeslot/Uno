package cartes;

public enum Couleur {

  JAUNE("Jaune"), VERT("Vert"), BLEU("Bleu"), ROUGE("Rouge");

  private String nom;

    Couleur (String nom) {
    assert(nom.toUpperCase().equals("JAUNE") || nom.toUpperCase().equals("VERT") || nom.toUpperCase().equals("BLEU") || nom.toUpperCase().equals("ROUGE"));
    this.nom = nom;
  }

  public String getNom() {
    return this.nom;
  }

  public String toString(){
    return this.nom;
  }

}
