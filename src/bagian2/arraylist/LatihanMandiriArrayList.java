/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bagian2.arraylist;

import java.util.ArrayList;

/**
 *
 * @author Adytiya Pratama 2410010408
 */
public class LatihanMandiriArrayList {
    public static void main(String[] args) {

        // Soal 1
        ArrayList<String> daftarBelanja = new ArrayList<>();

        daftarBelanja.add("Beras");
        daftarBelanja.add("Gula");
        daftarBelanja.add("Minyak");
        daftarBelanja.add("Telur");

        daftarBelanja.remove(1); // menghapus item ke-2 (index 1)

        System.out.println("=== Soal 1 ===");
        System.out.println("Isi daftar belanja:");
        for (String item : daftarBelanja) {
            System.out.println(item);
        }
        System.out.println("Jumlah item akhir: " + daftarBelanja.size());

        // Soal 2
        ArrayList<Integer> angka = new ArrayList<>();

        angka.add(10);
        angka.add(25);
        angka.add(7);
        angka.add(40);
        angka.add(18);

        int terbesar = angka.get(0);

        for (int nilai : angka) {
            if (nilai > terbesar) {
                terbesar = nilai;
            }
        }

        System.out.println("\n=== Soal 2 ===");
        System.out.println("Nilai terbesar: " + terbesar);

        // Soal 3
        ArrayList<String> nama = new ArrayList<>();

        nama.add("Andi");
        nama.add("Budi");
        nama.add("Aisyah");
        nama.add("Citra");
        nama.add("Ahmad");
        nama.add("Dina");

        System.out.println("\n=== Soal 3 ===");
        System.out.println("Nama yang diawali huruf A:");

        for (String n : nama) {
            if (n.startsWith("A")) {
                System.out.println(n);
            }
        }
    }
}
