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
    for (int i = 0 ; i < 6 ; i++) {
      for (int j = 0 ; j < 7 ; j++) {
        grille[i][j] = 0;
      }
    }
  }
  
  public boolean chercheAlignement(int col, int line, int deplacementH, int deplacementV, int joueur) {
    int compteur = 0;
    int tempC = col;
    int tempL = line;
    while (tempC >= 0 && tempC < col + 4 && tempL >= 0 && tempL < line + 4
        && tempL < 6 && tempC < 7 && grille[tempL][tempC] == joueur) {
      compteur = compteur + 1;
      tempL = tempL + deplacementV;
      tempC = tempC + deplacementH;
    }
    tempL = line - deplacementV;
    tempC = col - deplacementH;
    while (tempC >= 0 && tempC > col - 4 && tempL >= 0 && tempL > line - 4
        && tempL < 6 && tempC < 7 && grille[tempL][tempC] == joueur) {
      compteur = compteur + 1;
      tempL = tempL - deplacementV;
      tempC = tempC - deplacementH;
    }
    if (compteur == 4) {
      return true;
    }
    return false;
  }
  
  public boolean testGrillePleine() {
    for (int col = 0; col < 7; col++) {
      for (int ligne = 0; ligne < 6; ligne++) {
        if (grille[col][ligne] == 0) {
          return false;
        }
      }
    }
    return true;
  }
}
