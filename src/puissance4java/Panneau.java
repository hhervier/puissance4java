package puissance4java;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Graphics;


import javax.swing.*;

public class Panneau extends JPanel {
	int hauteur;
	int largeur;
	MonCanvas c;

	public Panneau(int h, int l) {
		this.setLayout(new FlowLayout());
		hauteur = h;
		largeur = l;
		this.setBounds(0, 0, l, h);
		c = new MonCanvas(h,l);
		c.setSize(l, h);
		this.add(c);
		c.setBackground(Color.WHITE);
		this.setVisible(true);
		

	}

}