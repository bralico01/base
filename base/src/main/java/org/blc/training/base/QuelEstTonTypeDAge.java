/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.blc.training.base;

/**
 *
 * @author r.hendrick
 */
public class QuelEstTonTypeDAge {

    public static void main(String[] argc) {
        
        /**
         * Validation des informations d'entrée par l'utilisateur
         */
        if(argc.length == 0){
            System.out.println(
                    "/ ! \\ Merci de spécifier le paramètre d'age "
                            + "ex : java QuelEstTonTypDAge.java 38 !");
            // Quitte 
            return;
        }
        
        
        /**
         * Explication fonctionnement d'un tableau
         */
        System.out.println("Nombre d'argument fourni : " + argc.length);
        if(argc.length >0 ){
            System.out.println("[0] : " + argc[0]);
        }
        
        if(argc.length >1 ){
            System.out.println("[1] : " + argc[1]);
        }
        
        if(argc.length >2 ){
            System.out.println("[2] : " + argc[2]);
        }
        
        if(argc.length >3 ){
            System.out.println("[3] : " + argc[3]);
        }
        
        

        // RECUPERE L INFORMATION DONNER PAR L'UTILISATEUR SOUS FORME DE TEXTE
        // Rappel un tableau argc ...
        // [0]: valeur 1
        // [1]: valeur 2
        // [2]: valeur 3
        String ageStr = argc[0];        
        
        
        // ======================================================
        // 20 ans => enfant / 40 jeune / 50 adulte / 60 vieux
        Integer agePersonne = Integer.valueOf(ageStr);
        
        // OPERTATEUR DE TEST
        // < : strictement inférieure
        // <= : inférieure ou égale
        // == : égale
        // >= : supérieure ou égale
        // > : strictement supérieure
        // != : différent de
        
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
