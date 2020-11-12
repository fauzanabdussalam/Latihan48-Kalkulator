/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo10k.pkg10119901.latihan48.kalkulator;

/**
 *
 * @author
 * NAMA                 : Fauzan Muhammad Abdussalam
 * KELAS                : IF-10K
 * NIM                  : 10119901
 * Deskripsi Program    : Kalkulator
 *
 */
public class PBO10K10119901Latihan48Kalkulator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Kalkulator k = new Kalkulator();
        
        k.setValue1(7);
        k.setValue2(5);
        
        System.out.println("VALUE 1 = " + k.getValue1());
        System.out.println("VALUE 2 = " + k.getValue2());
        
        k.setNameProject();
        k.setNoteProject("This project shown you how to manage method in java");
        
        System.out.println("Result Add is \t\t = " + k.add(k.getValue1(), k.getValue2()));
        System.out.println("Result Minus is \t = " + k.minus(k.getValue1(), k.getValue2()));
        System.out.println("Result Multiple is \t = " + k.multiplication(k.getValue1(), k.getValue2()));
        System.out.println("Result Division is \t = " + k.division(k.getValue1(), k.getValue2()));
    }
    
}
