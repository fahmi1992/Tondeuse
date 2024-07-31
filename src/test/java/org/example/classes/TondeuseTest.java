package org.example.classes;

import org.example.enums.Direction;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TondeuseTest {

    private Tondeuse tondeuse;

    @BeforeEach
    void setUp() {
        tondeuse = new Tondeuse(1, 2, Direction.N);
    }

    @Test
    void testPositionInitiale() {
        assertEquals(1, tondeuse.getX());
        assertEquals(2, tondeuse.getY());
        assertEquals(Direction.N, tondeuse.getDirection());
    }

    @Test
    void testSetPosition() {
        tondeuse.setPosition(3, 3);
        assertEquals(3, tondeuse.getX());
        assertEquals(3, tondeuse.getY());
    }

    @Test
    void testSetDirection() {
        tondeuse.setDirection(Direction.S);
        assertEquals(Direction.S, tondeuse.getDirection());
    }

    @Test
    void testToString() {
        assertEquals("1 2 N", tondeuse.toString());
    }
}

