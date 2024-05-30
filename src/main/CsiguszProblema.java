package main;

import java.util.logging.Level;
import java.util.logging.Logger;
import modell.Csigusz;

public class CsiguszProblema {
    public static void main(String[] args) {
        try {
            Csigusz cs1 = new Csigusz("cs-1");
            feladat(cs1);
            Csigusz cs2 = new Csigusz("cs-2", "piros");
            feladat(cs2);
        } catch (Exception ex) {
            //Logger.getLogger(CsiguszProblema.class.getName()).log(Level.SEVERE, null, ex);
            System.err.println("A hiba oka: " + ex.getMessage());
        }
    }

    private static void feladat(Csigusz cs1) {
        System.out.println(cs1.toString());
        char elso = cs1.getSzin().charAt(0);
    }
    
}
