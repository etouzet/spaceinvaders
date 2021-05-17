package fr.unilim.iut.spaceinvaders;

public class Vaisseau {

	int x;
	int y;
	int longueur;
	int hauteur;

	public Vaisseau(int longueur, int hauteur) {
		this(longueur, hauteur, 0, 0);
	}

	public Vaisseau(int longueur, int hauteur, int x, int y) {
		this.longueur = longueur;
		this.hauteur = hauteur;
		this.x = x;
		this.y = y;
	}

	public boolean occupeLaPosition(int x, int y) {
		return (estAbscisseCouverte(x) && estOrdonneeCouverte(y));
	}

	private boolean estOrdonneeCouverte(int y) {
		return ordonneeLaPlusHaute(y) && ordonneeLaPlusBasse(y);
	}

	private boolean ordonneeLaPlusBasse(int y) {
		return y <= this.y;
	}

	private boolean ordonneeLaPlusHaute(int y) {
		return this.y - this.hauteur + 1 <= y;
	}

	private boolean estAbscisseCouverte(int x) {
		return (abscisseLaPlusAGauche() <= x) && (x <= abscisseLaPlusADroite());
	}

	private int abscisseLaPlusADroite() {
		return this.x + this.longueur - 1;
	}

	public void seDeplacerVersLaDroite() {
		this.x = this.x + 1;
	}

	public int abscisseLaPlusAGauche() {
		// TODO Auto-generated method stub
		return this.x;
	}

	public void seDeplacerVersLaGauche() {
		this.x = this.x - 1;
	}

	public void positionner(int x, int y) {
		this.x = x;
		this.y = y;
	}

}
