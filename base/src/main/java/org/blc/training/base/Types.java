package org.blc.training.base;

/**
 * 
 * @author r.hendrick
 */
public class Types {
    
    /**
     * Exécution de l'application
     * 
     * @param arg tableau de paramètre 
     */
    public static void main(String[] arg){
        System.out.println("Démarrage de la class Types");
        
        // Création d'une variable boolean
        // Variable non initialisée
        boolean isActivated;
        isActivated = true; // Affectation d'une variable
        System.out.println("isActivated = " + isActivated);
        
        // Création d'une variable boolean
        // Variable initialisée
        boolean isActivatedAtInit = false;
        System.out.println("isActivatedAtInit = " + isActivatedAtInit);
        
        // Création d'une variable class Boolean
        // Variable initialisée
        Boolean isActivatedClass = false;
        int isEqualtToActivatedAtInit 
                = isActivatedClass.compareTo(isActivatedAtInit);
        System.out.println("isActivatedClass =" + isActivatedClass);
        
        System.out.println("isEqualToActivatedInit = " + isEqualtToActivatedAtInit);
        
        //=======================================================
        int variableInt = 38;
        System.out.println("Raphaël tu as " + variableInt + " ans");
        
        Integer variableIntClass = 38;
        System.out.println("Rapahël tu as " + variableInt + " ans en class");
        
        // bit (1/8 bytes) / byte (1 byte) / short(2 bytes) / int (4bytes) / long (8bytes)
        
        // ======================================================
        
        double square3 = Math.sqrt(3.5);
        float squareFloat3 = (float) square3;
        System.out.println("racine de (3.5) en double = " + square3
                        + " et en float = " + squareFloat3);
        
        // ======================================================
        // 20 ans => enfant / 40 jeune / 50 adulte / 60 vieux
        Integer agePersonne = 65;
        
        // < : strictement inférieure
        // <= : inférieure ou égale
        // == : égale
        // >= : supérieure ou égale
        // > : strictement supérieure
        // != : différent
        
        if(agePersonne <= 20){
            System.out.println("Tu es un enfant !");
        }else if(agePersonne <= 40){
            System.out.println("Tu es jeune !");
        }else if(agePersonne <= 50){
            System.out.println("Tu es adulte !");
        }else if(agePersonne <= 60){
            System.out.println("Tu es vieux !");
        }else{
            System.out.println("Vous êtes au delà de 60 ans !");
        }
        
        
    }
}
