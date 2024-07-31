package org.example.classes;

import org.example.enums.Direction;
import org.example.interfaces.Commande;

public class Tondeuse {
    private int x;
    private int y;
    private Direction direction;

    public Tondeuse(int x, int y, Direction direction) {
        this.x = x;
        this.y = y;
        this.direction = direction;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public Direction getDirection() {
        return direction;
    }

    public void setPosition(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void setDirection(Direction direction) {
        this.direction = direction;
    }

    // Exécuter une commande basée sur l'entrée
    public void executerCommande(Commande commande, int maxX, int maxY) {
        commande.executer(this, maxX, maxY);
    }

    @Override
    public String toString() {
        return x + " " + y + " " + direction;
    }
}
