package fr.diginamic.immobilier.entites;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MaisonTest {

    private Maison maison;
    private Cuisine cuisine;
    private Chambre chambre;

    @BeforeEach
    public void setUp() {
        maison = new Maison();
        cuisine = new Cuisine(1, 15.0);
        chambre = new Chambre(1, 20.0);
    }

    @Test
    public void testAjouterPiece() {
        maison.ajouterPiece(cuisine);
        maison.ajouterPiece(chambre);

        // Vérifie que les pièces ont été ajoutées
        assertEquals(2, maison.getPieces().length);
        assertEquals(cuisine, maison.getPieces()[0]);
        assertEquals(chambre, maison.getPieces()[1]);
    }

    @Test
    public void testNbPieces() {
        maison.ajouterPiece(cuisine);
        maison.ajouterPiece(chambre);

        // Vérifie le nombre de pièces (doit être 2, pas 1)
        assertEquals(2, maison.nbPieces());
    }

    @Test
    public void testSuperficieEtage() {
        maison.ajouterPiece(cuisine);
        maison.ajouterPiece(chambre);

        // Vérifie la superficie pour l'étage 1
        assertEquals(35.0, maison.superficieEtage(1));
    }

    @Test
    public void testSuperficieTypePiece() {
        maison.ajouterPiece(cuisine);
        maison.ajouterPiece(chambre);

        // Vérifie la superficie pour le type "Cuisine"
        assertEquals(15.0, maison.superficieTypePiece("Cuisine"));

        // Vérifie la superficie pour le type "Chambre"
        assertEquals(20.0, maison.superficieTypePiece("Chambre"));
    }

    @Test
    public void testCalculerSurface() {
        maison.ajouterPiece(cuisine);
        maison.ajouterPiece(chambre);

        // Vérifie la surface totale
        assertEquals(35.0, maison.calculerSurface());
    }

    @Test
    public void testSuperficieEtageAvecEtageNonExistant() {
        maison.ajouterPiece(cuisine);
        maison.ajouterPiece(chambre);

        // Vérifie la superficie pour un étage qui n'existe pas
        assertEquals(0.0, maison.superficieEtage(2));
    }

    @Test
    public void testSuperficieTypePieceAvecTypeNonExistant() {
        maison.ajouterPiece(cuisine);
        maison.ajouterPiece(chambre);

        // Vérifie la superficie pour un type de pièce qui n'existe pas
        assertEquals(0.0, maison.superficieTypePiece("Salon"));
    }
}
