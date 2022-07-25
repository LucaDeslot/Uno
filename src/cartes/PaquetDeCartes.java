package cartes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class PaquetDeCartes {

private ArrayList<Carte> cartes;

public PaquetDeCartes() {
  this.cartes = new ArrayList<>();
}

public void ajouter(Carte[] cartes) {
    this.cartes.addAll(Arrays.asList(cartes));
}

public void ajouter(PaquetDeCartes pdc){
    this.cartes.addAll(pdc.cartes);
}

public int getNombreDeCartes(){
  return this.cartes.size();
}

public boolean estVide(){
  return cartes.isEmpty();
}

public int getValeur() {
  int somme = 0;
  for (Carte c : cartes) {
    somme += c.getValeur();
  }

  return somme;
}

public String toString(){
  StringBuilder builder = new StringBuilder("Nombre de cartes = "+getNombreDeCartes()+"\n");
  for (Carte c : cartes) {
    builder.append(c.toString());
    builder.append("\n");
  }
  return builder.toString();
}

public void melanger(){
  Collections.shuffle(this.cartes);
}

public void retourner(){
  Collections.reverse(this.cartes);
}

public Carte piocher() {
  Carte c = this.cartes.get(this.cartes.size() - 1);
  this.cartes.remove(c);
  return c;
}

public Carte getSommet(){
  return this.cartes.get(this.cartes.size() - 1);
}





}
