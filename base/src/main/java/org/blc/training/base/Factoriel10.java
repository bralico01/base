/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.blc.training.base;

/**
 * La factoriel d'un nombre est sa multiplication par lui-même jusqu'à atteindre
 * son nombre 3!=1x2x3=6 => 10! 11!
 *
 * Limiter les valeur entrer au paramètres 1 argments Limiter entre un nombre 1
 * et 10 Test : la valeur est égale à un nombre entre 1 à 10 en fonction du
 * nombre, je faire la multiplication.
 *
 * @author r.hendrick
 */
public class Factoriel10 {

    /**
     * Point d'entrée de l'application principale
     *
     * @param arg [0]: correspond à un nombre entier obligatoirement
     */
    public static void main(String[] arg) {

        // Paramètre d'identification si cube ou cylindre
        int nombre = 0;

        System.out.println("Longueur tableau : " + arg.length);

        // Valider le minimum d'information fourni !
        if (arg.length != 1) {
            System.out.println("Attention, un seul paramètre est attendu !");
            return;
        }

        // Récupère le paramètre
        nombre = Integer.valueOf(arg[0]);// récupère le nombre

        // La factoriel de zéro
        if (nombre == 0) {
            System.out.println("Il n'est pas résonnable de faire la factoriel de 0 ==> 0 !\nSavez-vous calculer ?");
            return;
        }

        // Il vient successivement 
        int factoriel = 1;
        
        if(nombre > 1){
            factoriel = factoriel * 2;
        }
        if(nombre > 2){
            factoriel = factoriel * 3;
        }
        if(nombre > 3){
            factoriel = factoriel * 4;
        }
        if(nombre > 4){
            factoriel = factoriel * 5;
        }
        if(nombre > 5){
            factoriel = factoriel * 6;
        }
        if(nombre > 6){
            factoriel = factoriel * 7;
        }
        if(nombre > 7){
            factoriel = factoriel * 8;
        }
        if(nombre > 8){
            factoriel = factoriel * 9;
        }
        if(nombre > 9){
            factoriel = factoriel * 10;
        }
        if(nombre > 10){
            System.out.println("La factoriel calculable du systeme est compris entre 1 et 10 !\n"
                    + "Votre nombre " + nombre  + " est supérieur à 10 !!");
            return;
        }
        System.out.println("La factoriel de " + nombre + "! = " + factoriel);
    }
}
