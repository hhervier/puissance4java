package puissance4java;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class affichage {
	// Attributs////
	public Grille g;

	public static void main(String[] args) {
		JFrame fenetre = new JFrame();
		fenetre.setSize(800, 700);
		fenetre.setLocationRelativeTo(null);
		fenetre.setVisible(true);
		fenetre.setContentPane(new Panneau(700,600));
		fenetre.repaint();
	}
}
