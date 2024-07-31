package org.example.interfaces;

import org.example.classes.Tondeuse;

public interface Commande {
    void executer(Tondeuse tondeuse, int maxX, int maxY);
}
