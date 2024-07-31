package org.example.classes;

import org.example.enums.Direction;
import org.example.interfaces.Commande;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CommandeTest {

    private Tondeuse tondeuse;
    private static final int maxX = 5;
    private static final int maxY = 5;

    @BeforeEach
    void setUp() {
        tondeuse = new Tondeuse(1, 2, Direction.N);
    }

    @Test
    void testCommandeGauche() {
        Commande commandeGauche = new CommandeGauche();
        commandeGauche.executer(tondeuse, maxX, maxY);
        assertEquals(Direction.O, tondeuse.getDirection());
    }

    @Test
    void testCommandeDroite() {
        Commande commandeDroite = new CommandeDroite();
        commandeDroite.executer(tondeuse, maxX, maxY);
        assertEquals(Direction.E, tondeuse.getDirection());
    }

    @Test
    void testCommandeAvancer() {
        Commande commandeAvancer = new CommandeAvancer();
        commandeAvancer.executer(tondeuse, maxX, maxY);
        assertEquals(1, tondeuse.getX());
        assertEquals(3, tondeuse.getY());
    }

    @Test
    void testCommandeAvancerLimite() {
        tondeuse.setPosition(5, 5);
        tondeuse.setDirection(Direction.N);
        Commande commandeAvancer = new CommandeAvancer();
        commandeAvancer.executer(tondeuse, maxX, maxY);
        assertEquals(5, tondeuse.getX());
        assertEquals(5, tondeuse.getY()); // Ne doit pas dépasser la limite

        tondeuse.setDirection(Direction.E);
        commandeAvancer.executer(tondeuse, maxX, maxY);
        assertEquals(5, tondeuse.getX());
        assertEquals(5, tondeuse.getY()); // Ne doit pas dépasser la limite
    }
}

