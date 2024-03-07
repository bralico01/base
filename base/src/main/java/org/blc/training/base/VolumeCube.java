/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.blc.training.base;

/**
 *
 * @author r.hendrick
 */
public class VolumeCube {

    public static void main(String[] argc) {
        float longueur = Float.valueOf(argc[0]);
        float largeur = Float.valueOf(argc[1]);
        float hauteur = Float.valueOf(argc[2]);
        float volume = longueur * largeur * hauteur;

        System.out.println("Volume de (" + longueur + "*"
                + largeur + "*" + hauteur + ")=" + volume);
    }
}
