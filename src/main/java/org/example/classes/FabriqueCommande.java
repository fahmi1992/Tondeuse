package org.example.classes;

import org.example.interfaces.Commande;

import java.util.ArrayList;
import java.util.List;

public class FabriqueCommande {

    // Méthode de fabrique pour créer une liste de commandes à partir d'une chaîne d'instructions
    public static List<Commande> creerCommandes(String instructions) {
        List<Commande> commandes = new ArrayList<>();
        for (char caractereCommande : instructions.toCharArray()) {
            switch (caractereCommande) {
                case 'G':
                    commandes.add(new CommandeGauche());
                    break;
                case 'D':
                    commandes.add(new CommandeDroite());
                    break;
                case 'A':
                    commandes.add(new CommandeAvancer());
                    break;
                default:
                    throw new IllegalArgumentException("Commande invalide : " + caractereCommande);
            }
        }
        return commandes;
    }
}

