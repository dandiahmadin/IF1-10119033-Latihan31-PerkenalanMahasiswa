/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.dandiahmadin.perkenalanmahasiswa;

/**
 *
 * @author
 * NAMA     : Dandi Ahmadin
 * KELAS    : IF-1
 * NIM      : 10119033
 * Deskripsi Program : Program ini berisi blueprint mahasiswa
 */

public class Mahasiswa {
    public String nim, nama;
    
    public void perkenalanDiri() {
        System.out.println("Hallo Everyone");
        System.out.println("My NIM is ".concat(nim));
        System.out.println("My Name is ".concat(nama).concat("\n"));
    }
}
