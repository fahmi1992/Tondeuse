package org.example.classes;

import org.example.enums.Direction;
import org.example.interfaces.Commande;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PelouseTest {

    private Pelouse pelouse;
    private Tondeuse tondeuse;

    @BeforeEach
    void setUp() {
        pelouse = new Pelouse(5, 5);
        tondeuse = new Tondeuse(1, 2, Direction.N);
    }

    @Test
    void testAjouterTondeuse() {
        pelouse.ajouterTondeuse(tondeuse);
        assertEquals(1, pelouse.getTondeuses().size());
    }

    @Test
    void testExecuterInstructions() {
        pelouse.ajouterTondeuse(tondeuse);
        List<Commande> commandes = FabriqueCommande.creerCommandes("GAGAGAGAA");
        pelouse.executerInstructions(commandes, tondeuse);
        assertEquals("1 3 N", tondeuse.toString());
    }
}

