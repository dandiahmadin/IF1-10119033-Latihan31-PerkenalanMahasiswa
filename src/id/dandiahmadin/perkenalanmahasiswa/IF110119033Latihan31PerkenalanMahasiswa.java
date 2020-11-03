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
 * Deskripsi Program : Program ini berisi perkenalan mahasiswa dengan konsep pendekatan berbasis objek
 */

public class IF110119033Latihan31PerkenalanMahasiswa {
    public static void main(String[] args) {
        Mahasiswa mhs1 = new Mahasiswa();
        mhs1.nama = "Dandi Ahmadin";
        mhs1.nim = "10119033";

        Mahasiswa mhs2 = new Mahasiswa();
        mhs2.nama = "Hayin Ananta";
        mhs2.nim = "10119005";

        Mahasiswa mhs3 = new Mahasiswa();
        mhs3.nama = "Ilham Zaki";
        mhs3.nim = "10119006";

        Mahasiswa mhs4 = new Mahasiswa();
        mhs4.nama = "M Ikhlas N F";
        mhs4.nim = "10119022";
        
        mhs1.perkenalanDiri();
        mhs2.perkenalanDiri();
        mhs3.perkenalanDiri();
        mhs4.perkenalanDiri();
        
//        Sesuai dengan ada yg di ppt
//        Mahasiswa mhs1 = new Mahasiswa();
//        mhs1.nama = "Rizki Adam Kurniawan";
//        mhs1.nim = "10110269";
//
//        Mahasiswa mhs2 = new Mahasiswa();
//        mhs2.nama = "Indra Tiola";
//        mhs2.nim = "10110270";
//
//        Mahasiswa mhs3 = new Mahasiswa();
//        mhs3.nama = "Robi Tanzil Ganefi";
//        mhs3.nim = "10110271";
//
//        Mahasiswa mhs4 = new Mahasiswa();
//        mhs4.nama = "Muhammad Nur Awaludin";
//        mhs4.nim = "10110269";

//        mhs1.perkenalanDiri();
//        mhs2.perkenalanDiri();
//        mhs3.perkenalanDiri();
//        mhs4.perkenalanDiri();
    }
}
