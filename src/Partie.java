import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;
import puissance4java.Grille;
import puissance4java.joueur;

/**
 * 
 */

/**
 * @author marcd
 *
 */
public class Partie {

  public joueur j1;
  public joueur j2;
  public Grille jeu;

  public Partie() {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Nom du joueur 1 :");
    String nom1 = scanner.nextLine();
    System.out.println("Nom du joueur 2 :");
    String nom2 = scanner.nextLine();
    j1 = new joueur(0, 1, nom1);
    j2 = new joueur(0, 2, nom2);
    jeu = new Grille();
    jeu.newGrille();
  }

  public boolean joueCoup(int col, int joueur) {
    if ((col < 0) || (col >= 7)) {
      return false;
    }

    // Trouve la première place vide dans la colonne
    for (int ligne = 0; ligne < 6; ligne++) {
      if (jeu.grille[ligne][col] == 0) {
        jeu.grille[ligne][col] = joueur;
        return true;
      }
    }
    // La colonne est pleine
    return false;
  }

  public int getIndiceLine(int col) {
    int indice = 0;
    while (jeu.grille[indice][col] != 0) {
      indice = indice + 1;
    }
    return indice-1;
  }

  public boolean testVictoire(int col, int line, int joueur) {
    if (jeu.chercheAlignement(col, line, 0, 1, joueur)
        || jeu.chercheAlignement(col, line, 1, 0, joueur)
        || jeu.chercheAlignement(col, line, 1, 1, joueur)
        || jeu.chercheAlignement(col, line, 1, -1, joueur)) {
      return true;
    }
    return false;
  }

  public static void main(String[] args) {
    Partie partie = new Partie();
    while (partie.j1.nbvictoires < 4 && partie.j2.nbvictoires < 4) {
      while (!partie.jeu.testGrillePleine()) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(partie.j1.nom + " choix colonne :");
        int col1 = scanner.nextInt();
        while (!partie.joueCoup(col1, 1)) {
          System.out.println("Choisir une autre colonne :");
          col1 = scanner.nextInt();
        }
        int ligne1 = partie.getIndiceLine(col1);
        if (partie.testVictoire(col1, ligne1, 1)) {
          System.out.println( partie.j1.nom +" gagne! \nLa partie recommence.");
          partie.j1.nbvictoires++;
          break;
        }
        System.out.println(Arrays.deepToString(partie.jeu.grille));
        System.out.println(partie.j2.nom + " choix colonne :");
        int col2 = scanner.nextInt();
        while (!partie.joueCoup(col2, 2)) {
          System.out.println("Choisir une autre colonne :");
          col1 = scanner.nextInt();
        }
        int ligne2 = partie.getIndiceLine(col2);
        if (partie.testVictoire(col2, ligne2, 2)) {
          System.out.println(partie.j2.nom +" gagne! \nLa partie recommence.");
          partie.j2.nbvictoires++;
          break;
        }
      }
      partie.jeu.newGrille();
      System.out.println(partie.j1.nom + partie.j1.nbvictoires +" victoire(s).");
      System.out.println(partie.j2.nom +" "+ partie.j2.nbvictoires +" victoire(s).");
    }
  }

}