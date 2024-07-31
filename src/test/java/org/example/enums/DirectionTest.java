package org.example.enums;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class DirectionTest {

    @Test
    void testPivoterAGauche() {
        assertEquals(Direction.O, Direction.N.pivoterAGauche());
        assertEquals(Direction.S, Direction.O.pivoterAGauche());
        assertEquals(Direction.E, Direction.S.pivoterAGauche());
        assertEquals(Direction.N, Direction.E.pivoterAGauche());
    }

    @Test
    void testPivoterADroite() {
        assertEquals(Direction.E, Direction.N.pivoterADroite());
        assertEquals(Direction.S, Direction.E.pivoterADroite());
        assertEquals(Direction.O, Direction.S.pivoterADroite());
        assertEquals(Direction.N, Direction.O.pivoterADroite());
    }
}
