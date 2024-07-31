package org.example;

import org.example.classes.FabriqueCommande;
import org.example.classes.Pelouse;
import org.example.classes.Tondeuse;
import org.example.enums.Direction;
import org.example.interfaces.Commande;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

import static org.example.constantes.Const.NOMFICHIER;

public class Main {
    public static void main(String[] args) {

        try (BufferedReader lecteur = new BufferedReader(new FileReader(NOMFICHIER))) {
            String ligne = lecteur.readLine();
            if (ligne == null) {
                System.out.println("Fichier d'entrée invalide");
                return;
            }

            // Lire les dimensions de la pelouse
            String[] dimensionsPelouse = ligne.split(" ");
            int maxX = Integer.parseInt(dimensionsPelouse[0]);
            int maxY = Integer.parseInt(dimensionsPelouse[1]);

            Pelouse pelouse = new Pelouse(maxX, maxY);

            while ((ligne = lecteur.readLine()) != null) {
                // Lire la position initiale et la direction de la tondeuse
                String[] positionInitiale = ligne.split(" ");
                int x = Integer.parseInt(positionInitiale[0]);
                int y = Integer.parseInt(positionInitiale[1]);
                Direction direction = Direction.valueOf(positionInitiale[2]);

                Tondeuse tondeuse = new Tondeuse(x, y, direction);
                pelouse.ajouterTondeuse(tondeuse);

                // Lire les instructions pour la tondeuse
                if ((ligne = lecteur.readLine()) != null) {
                    List<Commande> commandes = FabriqueCommande.creerCommandes(ligne);
                    pelouse.executerInstructions(commandes, tondeuse);
                }
            }

            // Afficher la position finale de chaque tondeuse
            for (Tondeuse tondeuse : pelouse.getTondeuses()) {
                System.out.println(tondeuse);
            }

        } catch (IOException e) {
            System.out.println("Erreur de lecture du fichier : " + e.getMessage());
        }
    }
}