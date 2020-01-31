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
  
  while(!testGrillePleine) { //On mettra grille non pleine et pas de vainqueur
    
  }

}
