package puissance4java;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class Panneau extends JPanel {
	int hauteur;
	int largeur;

	public Panneau(int h, int l) {
		hauteur = h;
		largeur = l;
		this.setBounds(0, 0, l, h);
		this.setBackground(Color.GREEN);
		this.setVisible(true);

	}

	public void paintComponent(Graphics g) {
		for (int i = 0; i <= hauteur; i = i + 100) {
			for (int j = 0; j <= largeur; j = j + 100) {
				g.drawLine(i, 0, i, largeur);
				g.drawLine(0, j, hauteur, j);
			}

		}

	}

	public void Insertionjeton(Graphics g, Grille gri) {
		for (int i=0;i<=6;i=i+1) {
			for (int j=0;j<=5;j=j+1) {
				if (gri.grille[i][j]==1) {
					g.setColor(Color.YELLOW);
					g.fillOval(i*100,j*100,100,100);
				}
				else if(gri.grille[i][j]==2){
					g.setColor(Color.RED);
					g.fillOval(i*100,j*100,100,100);
				}
				else {}
		}
	}
}
}