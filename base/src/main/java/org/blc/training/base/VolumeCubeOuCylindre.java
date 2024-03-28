package org.blc.training.base;

import java.awt.Color;

/**
 * Permet de calculer le volume d'un cube ou d'un cylindre. En fonction du
 * premier parmètre, si le paramètre est à 0 alors, il s'agit d'un cube sinon 1,
 * c'est cylindre. le deuxième correspond respectivement à l'arrêt du cube,
 * sinon au diamètre du cube. Enfin, le 3ième parmètre correspond à la hauteur.
 *
 * / ! \ Il faudra veillez à ce que les dimenssions fournie soie supérieure à
 * zéro et soie des valeurs flottante précise
 *
 * Sinon le calcul ne peut être fait.
 *
 * @author r.hendrick
 */
public class VolumeCubeOuCylindre {

    /**
     * Point d'entrée de l'application principale
     *
     * @param arg [0]: 0(cube) ou 1(cylindre)/[1]:arret / [2]:si [0]=1 >>
     * hauteur cylindre
     */
    public static void main(String[] arg) {

        // Paramètre d'identification si cube ou cylindre
        int isCylindre = 0;
        // définition de la longueur d'arrête ou diamètre du cylindre
        double arret = 0.0;
        // si c'est un cylindre, il s'agit de la hauteur du cylindre
        double hauteur = 0.0;

        System.out.println("Longueur tableau : " + arg.length);

        // Que le minimum d'information aie été fourni
        if (arg.length < 2 || arg.length > 3) {
            System.out.println("Attention, le nombre de paramètre attendu doit"
                    + " être compris entre 2 et 3 !");
            return;
        }

        // récupère les informations 
        isCylindre = Integer.valueOf(arg[0]);// récupération valeur string cube ou cylindre
        arret = Double.valueOf(arg[1]);
        // hauteur
        if (isCylindre == 1 && arg.length == 3) { // veux dire qu'au moins un paramètre existe
            hauteur = Double.valueOf(arg[2]);
        } else if (isCylindre == 1) {
            System.out.println("Veuillez spécifier la hauteur ! ");
            return;
        }

        // Fournir le résultat
        if (isCylindre == 0) { //
            System.out.println("Le volume du cube d'arrête " + arret
                    + " = " + (arret * arret * arret));
        } else if (isCylindre == 1) {
            System.out.println("Le volume du cylindre de dimaètre " + arret
                    + " et de hauteur " + hauteur + " est égale à "
                    + (hauteur * Math.PI * arret / 4));
        } else {
            System.out.println("Le type de volume n'est pas configurer "
                    + ", choisir en paramètre 0 : soit 0 (cube) soit 1 (cylindre) !");
        }

    }
}
