package puissance4java;

public class Action {
//
//	public boolean JoueCoup(int col, int joueur) {
//		if ((col < 0) || (col >= 7)) {
//			return false;
//		}
//
//		// Trouve la première place vide dans la colonne
//		for (int ligne = 0; ligne < taille; ligne++) {
//			if (jeu[col][ligne] == 0) {
//				jeu[col][ligne] = joueur;
//				return true;
//			}
//		}
//		// La colonne est pleine
//		return false;
//	}
//
//	public boolean testGrillePleine() {
//		for (int col = 0; col < 7; col++) {
//			for (int ligne = 0; ligne < 6; ligne++) {
//				if (jeu[col][ligne] == 0) {
//					return false;
//				}
//			}
//			return true;
//		}
//	}
//
//	public boolean chercheAlignement(int col, int line, int deplacementH, int deplacementV, int joueur) {
//		int compteur = 0;
//		int tempC = col;
//		int tempL = line;
//		while (jeu[tempL][tempC] == joueur && tempC >= 0 && tempC < col + 3 && tempL >= 0 && tempL < line + 3
//				&& tempL < 6 && tempC < 7) {
//			compteur = compteur + 1;
//			tempL = tempL + deplacementV;
//			tempC = tempC + deplacementH;
//		}
//		while (jeu[tempL][tempC] == joueur && tempC >= 0 && tempC < col - 3 && tempL >= 0 && tempL < line - 3
//				&& tempL < 6 && tempC < 7) {
//			compteur = compteur + 1;
//			tempL = tempL - deplacementV;
//			tempC = tempC - deplacementH;
//		}
//		if (compteur == 4) {
//			return true;
//		}
//		return false;
//	}
//	
//	
//	public int getIndiceLine(int col) {
//		int indice = 0;
//		while (jeu[indice][col] == 0) {
//			indice = indice + 1;
//		}
//		return indice + 1;
//	}
//	
//
//	public int testVictoire(int col, int line, int joueur) {
//		if (jeu.chercheAlignement(col, line, 0, 1, joueur) || jeu.chercheAlignement(col, line, 1, 0, joueur)
//				|| jeu.chercheAlignement(col, line, 1, 1, joueur) || jeu.chercheAlignement(col, line, 1, -1, joueur)) {
//			return joueur;
//		}
//		return 0;
//	}

}
