package org.example.classes;

import org.example.interfaces.Commande;

public class CommandeAvancer implements Commande {
    @Override
    public void executer(Tondeuse tondeuse, int maxX, int maxY) {
        switch (tondeuse.getDirection()) {
            case N:
                if (tondeuse.getY() < maxY) {
                    tondeuse.setPosition(tondeuse.getX(), tondeuse.getY() + 1);
                }
                break;
            case E:
                if (tondeuse.getX() < maxX) {
                    tondeuse.setPosition(tondeuse.getX() + 1, tondeuse.getY());
                }
                break;
            case S:
                if (tondeuse.getY() > 0) {
                    tondeuse.setPosition(tondeuse.getX(), tondeuse.getY() - 1);
                }
                break;
            case O:
                if (tondeuse.getX() > 0) {
                    tondeuse.setPosition(tondeuse.getX() - 1, tondeuse.getY());
                }
                break;
        }
    }
}
