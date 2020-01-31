package puissance4java;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class affichage {
	// Attributs////
	public Grille g;
	
	public affichage (Grille gri) {
		g=gri;	
	}

	public static void main(String[] args,Grille gri) {
		JFrame fenetre = new JFrame();
		fenetre.setSize(800, 700);
		fenetre.setLocationRelativeTo(null);
		fenetre.setVisible(true);
		fenetre.setContentPane(new Panneau(701,601,gri));
		fenetre.setBackground(Color.WHITE);
		fenetre.repaint();
	}
}
