/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kambingstatic;

/**
 *
 * Nama : Rezky Nur Fauzi
 * NIM  : 10118016
 * Kelas: IF-1 
 * Deskripsi Program : Program ini berisi program untuk menampilkan data 
 * yang di hasilkan oleh 2 class secara bersamaan
 */

public class KambingStatic {
    /**
     * @param args the command line arguments
     */
    
        //Nama Kambing sebagai konstanta
    public static final String Nama_kambing = "MIDUN";
    
    public static void main(String[] args) {
        // TODO code application logic here
        Mamalia.jumlahKambing = 485000;
        System.out.println(Nama_kambing + " memiliki kambing sebanyak " + Mamalia.jumlahKambing);
    }
    
    
    
}
