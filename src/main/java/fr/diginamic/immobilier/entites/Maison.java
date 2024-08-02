package fr.diginamic.immobilier.entites;

/** Représente une maison avec toutes ses pièces
 * @author DIGINAMIC
 *
 */
public class Maison {

	/** pieces : tableau de pièces de la maison */
	private Piece[] pieces;

	/**
	 * Constructeur
	 */
	public Maison(){
		// Initialisation du tableau de pièces
		pieces = new Piece[0];
	}

	/** Ajoute une pièce à la maison
	 * @param nvPiece nouvelle pièce à ajouter
	 */
	public void ajouterPiece(Piece nvPiece) {
		if (nvPiece == null) {
			throw new IllegalArgumentException("La pièce ne peut pas être null");
		}

		// On est obligé d'agrandir le tableau initial de 1 à chaque ajout
		// d'une nouvelle pièce

		// On commence donc par créer un tableau temporaire appelé newTab
		// qui a une taille égale à la tableau du tableau pieces+1
		Piece[] newTab = new Piece[pieces.length + 1];

		// On déverse toutes les pièces du tableau pieces dans newTab
		System.arraycopy(pieces, 0, newTab, 0, pieces.length);

		// On place en dernière position dans le nouveau tableau la nouvelle
		// pièce
		newTab[pieces.length] = nvPiece;

		// Enfin on affecte newTab à pieces
		this.pieces = newTab;
	}

	public int nbPieces() {
		return pieces.length; // Correction : le nombre total de pièces
	}

	/** Retourne la superficie d'un étage
	 * @param choixEtage choix de l'étage
	 * @return double
	 */
	public double superficieEtage(int choixEtage) {
		double superficieEtage = 0;

		for (Piece piece : pieces) {
			if (choixEtage == piece.getNumEtage()) {
				superficieEtage += piece.getSuperficie(); // Correction : accumulation des superficies
			}
		}

		return superficieEtage;
	}

	/** Retourne la superficie totale pour un type de pièce donné
	 * @param typePiece type de pièce
	 * @return double
	 */
	public double superficieTypePiece(String typePiece) {
		if (typePiece == null) {
			return 0; // Correction : gestion des paramètres null
		}

		double superficie = 0;

		for (Piece piece : pieces) {
			if (typePiece.equals(piece.getType())) {
				superficie += piece.getSuperficie(); // Correction : accumulation des superficies
			}
		}

		return superficie;
	}

	/** Retourne la surface totale
	 * @return double
	 */
	public double calculerSurface() {
		double superficieTot = 0;

		for (Piece piece : pieces) {
			superficieTot += piece.getSuperficie();
		}

		return superficieTot;
	}

	/** Getter pour l'attribut pieces
	 * @return the pieces
	 */
	public Piece[] getPieces() {
		return pieces;
	}
}
