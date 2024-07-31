package org.example.classes;

import org.example.interfaces.Commande;

import java.util.ArrayList;
import java.util.List;

public class Pelouse {
    private final int maxX;
    private final int maxY;
    private final List<Tondeuse> tondeuses;

    public Pelouse(int maxX, int maxY) {
        this.maxX = maxX;
        this.maxY = maxY;
        this.tondeuses = new ArrayList<>();
    }

    public void ajouterTondeuse(Tondeuse tondeuse) {
        tondeuses.add(tondeuse);
    }

    public List<Tondeuse> getTondeuses() {
        return tondeuses;
    }

    public void executerInstructions(List<Commande> commandes, Tondeuse tondeuse) {
        for (Commande commande : commandes) {
            tondeuse.executerCommande(commande, maxX, maxY);
        }
    }
}

