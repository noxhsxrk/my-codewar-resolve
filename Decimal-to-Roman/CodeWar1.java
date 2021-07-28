/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codewar.DecimaltoRoman;

import java.util.Arrays;

/**
 *
 * @author Noahs
 */
public class CodeWar1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Conversion c = new Conversion();
        int[] n = new int[4];
        n = c.digitSplit(11);
        System.out.println(c.digitConvert(n));
    }
    
}
