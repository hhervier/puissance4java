package puissance4java;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;

public class MonCanvas extends Canvas {
	int hauteur;
	int largeur;
	Grille gri;

	public MonCanvas(int h, int l,Grille g) {
		hauteur = h;
		largeur = l;
		gri=g;

	}

	public void paint(Graphics g) {
		for (int i = 0; i <= largeur; i = i + 100) {
			for (int j = 0; j <= hauteur; j = j + 100) {
				g.setColor(Color.BLUE);
				g.drawLine(i, 0, i, hauteur);
				g.drawLine(0, j, largeur, j);

			}

		}
		for (int i = 0; i <= 6; i = i + 1) {
			for (int j = 0; j <= 5; j = j + 1) {
				if (gri.grille[j][i] == 1) {
					g.setColor(Color.YELLOW);
					g.fillOval(i * 100, (5 - j) * 100, 100, 100);
				} else if (gri.grille[j][i] == 2) {
					g.setColor(Color.RED);
					g.fillOval(i * 100, (5 - j) * 100, 100, 100);
				} else {
				}
			}
		}

	}
}
