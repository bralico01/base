package org.blc.training.base;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Primitive execute le programme de démarrage de l'application pricnipale et va
 * nous permettre d'écrire nos première ligne de prog.
 * <p>
 * Début d'un nouveau paragraphe de programme
 * <p>
 * Voir le class {@link org.blc.training.base.Bureau}
 *
 * @author r.hendrick
 */
public class Calcul {

    /**
     * Main permet de lancer l'application. Il s'agit du texte principale
     *
     * @param args permet de lancer des information spécifique
     * {@link org.blc.training.base.Bureau}
     */
    public static void main(String[] args) {

        // création de variable entière initialisée
        int noteEleve01 = 5;
        int noteEleve02 = 7;

        // Création de variable non initilisée et definition de la valeur
        int noteEleve03;
        int noteEleve04;
        noteEleve03 = 8;
        noteEleve04 = 9;

        // Création de variable initilisée et non initilése sur une ligne
        int noteEleve05 = 3, noteEleve06; noteEleve06 = 4;
        
        // Donner la moyen des 3 premiers étudiant
        int moy123 = (noteEleve01 + noteEleve02 + noteEleve03)/3;
        System.out.println("La moyenne des élèves " 
                + "01(" + noteEleve01 + ")+"
                + "02(" + noteEleve02 + ")+"
                + "03(" + noteEleve03 + ")"
                + " = " + moy123
        );
        
        // Donner la moyen des 3 premiers étudiant en float
        float moy123f = (noteEleve01 + noteEleve02 + noteEleve03)/3f;
        System.out.println("La moyenne float des élèves " 
                + "01(" + noteEleve01 + ")+"
                + "02(" + noteEleve02 + ")+"
                + "03(" + noteEleve03 + ")"
                + " = " + moy123f
        );
        
        // Donner la moyen des 3 premiers étudiant en float sans f
        float moy123fn = (float) ((noteEleve01 + noteEleve02 + noteEleve03)/3.0);
        System.out.println("La moyenne float casté du double des élèves " 
                + "01(" + noteEleve01 + ")+"
                + "02(" + noteEleve02 + ")+"
                + "03(" + noteEleve03 + ")"
                + " = " + moy123fn
        );
        
        // Donner la moyen des 3 premiers étudiant en float
        double moy123d = (noteEleve01 + noteEleve02 + noteEleve03)/3d;
        System.out.println("La moyenne double des élèves " 
                + "01(" + noteEleve01 + ")+"
                + "02(" + noteEleve02 + ")+"
                + "03(" + noteEleve03 + ")"
                + " = " + moy123d
        );
        // Donner la moyen des 3 premiers étudiant en float
        double moy123df = (double) moy123fn;
        System.out.println("La moyenne double moy123df des élèves " 
                + "01(" + noteEleve01 + ")+"
                + "02(" + noteEleve02 + ")+"
                + "03(" + noteEleve03 + ")"
                + " = " + moy123df
        );
        
        double moy123dfM = moy123df - (moy123df-6.6666665);
        System.out.println("La moyenne double moy123dfM des élèves " 
                + "01(" + noteEleve01 + ")+"
                + "02(" + noteEleve02 + ")+"
                + "03(" + noteEleve03 + ")"
                + " = " + moy123dfM
        );
    }

}
