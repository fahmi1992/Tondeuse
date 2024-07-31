package org.example.enums;

public enum Direction {
    N,
    E,
    S,
    O;

    // Pivoter vers la gauche
    public Direction pivoterAGauche() {
        return switch (this) {
            case N -> O;
            case O -> S;
            case S -> E;
            case E -> N;
        };
    }

    // Pivoter vers la droite
    public Direction pivoterADroite() {
        return switch (this) {
            case N -> E;
            case E -> S;
            case S -> O;
            case O -> N;
        };
    }
}
