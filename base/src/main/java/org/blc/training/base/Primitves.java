package org.blc.training.base;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 * Primitive execute le programme de démarrage de l'application pricnipale et va
 * nous permettre d'écrire nos première ligne de prog.
 * 
 * <p>
 * Début d'un nouveau paragraphe de programme
 * <p>
 * Voir le class {@link org.blc.training.base.Bureau}
 *
 * @author r.hendrick
 */
public class Primitves {

    /**
     * Main permet de lancer l'application. Il s'agit du texte principale
     *
     * @param args permet de lancer des information spécifique
     * {@link org.blc.training.base.Bureau}
     */
    public static void main(String[] args) {
        try {
            System.out.println("Quel age as-tu ?");
            
            byte[] age = System.in.readNBytes(10);
            
            System.out.println("Taille du byte " + age.length);
            System.out.println("Conversion toString " + age.toString());

            System.out.println("Bonjour tu as " 
                    + Character.toString(age[0]) 
                    + Character.toString(age[1]) + " ans !");
        } catch (IOException ex) {
            Logger.getLogger(Primitves.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    
    
}
