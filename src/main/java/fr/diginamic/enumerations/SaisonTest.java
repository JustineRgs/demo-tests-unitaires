package fr.diginamic.enumerations;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class SaisonTest {

    @Test
    public void testValueOfLibelleNominal() {
        assertEquals(Saison.PRINTEMPS, Saison.valueOfLibelle("Printemps"));
        assertEquals(Saison.ETE, Saison.valueOfLibelle("Eté"));
        assertEquals(Saison.AUTOMNE, Saison.valueOfLibelle("Automne"));
        assertEquals(Saison.HIVER, Saison.valueOfLibelle("Hiver"));
    }

    @Test
    public void testValueOfLibelleInvalid() {
        assertNull(Saison.valueOfLibelle("printemps"));
        assertNull(Saison.valueOfLibelle("ete"));
        assertNull(Saison.valueOfLibelle("Automn"));
        assertNull(Saison.valueOfLibelle("Hiver!"));
        assertNull(Saison.valueOfLibelle(""));
        assertNull(Saison.valueOfLibelle(null));
    }
}
