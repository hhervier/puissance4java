package puissance4java;

public class Grille {

  
  // ATTRIBUTS
  public int ligne;
  public int colonne;
  public int[][] grille;
  
  // CONSTRUCTEUR
  public Grille() {
    grille = new int[6][7];
  }
  
  public void newGrille() {
    grille = new int[6][7];
    for (int i = 0 ; i <= 6 ; i++) {
      for (int j = 0 ; j <= 6 ; j++) {
        grille[i][j] = 0;
      }
    }
  }
}
