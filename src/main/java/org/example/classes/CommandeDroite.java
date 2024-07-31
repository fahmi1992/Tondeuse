package org.example.classes;

import org.example.interfaces.Commande;

public class CommandeDroite implements Commande {
    @Override
    public void executer(Tondeuse tondeuse, int maxX, int maxY) {
        tondeuse.setDirection(tondeuse.getDirection().pivoterADroite());
    }
}
