package org.example.classes;

import org.example.interfaces.Commande;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class FabriqueCommandeTest {
    @Test
    void testCreerCommandes() {
        List<Commande> commandes = FabriqueCommande.creerCommandes("GDA");
        assertEquals(3, commandes.size());
        assertInstanceOf(CommandeGauche.class, commandes.get(0));
        assertInstanceOf(CommandeDroite.class, commandes.get(1));
        assertInstanceOf(CommandeAvancer.class, commandes.get(2));
    }

    @Test
    void testCreerCommandesInvalide() {
        assertThrows(IllegalArgumentException.class, () -> FabriqueCommande.creerCommandes("X"));
    }
}
