/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bagian1.array;

/**
 *
 * @author Adytiya Pratama 2410010408
 */
public class LatihanMandiriArray {
   public static void main(String[] args) {

        // Soal 1
        double[] suhu = {30.5, 28.7, 32.1, 27.9, 31.4, 29.8};

        double tertinggi = suhu[0];
        double terendah = suhu[0];

        for (int i = 1; i < suhu.length; i++) {
            if (suhu[i] > tertinggi) {
                tertinggi = suhu[i];
            }
            if (suhu[i] < terendah) {
                terendah = suhu[i];
            }
        }

        System.out.println("=== Soal 1 ===");
        System.out.println("Suhu tertinggi : " + tertinggi);
        System.out.println("Suhu terendah  : " + terendah);

        // Soal 2
        String[] hari = {"Senin", "Selasa", "Rabu", "Kamis", "Jumat"};

        System.out.println("\n=== Soal 2 ===");
        System.out.println("Nama hari yang memiliki lebih dari 5 huruf:");

        for (String h : hari) {
            if (h.length() > 5) {
                System.out.println(h);
            }
        }

        // Soal 3
        int[] angka = {4, 8, 15, 16, 23, 42};
        int jumlahGenap = 0;

        for (int a : angka) {
            if (a % 2 == 0) {
                jumlahGenap++;
            }
        }

        System.out.println("\n=== Soal 3 ===");
        System.out.println("Jumlah angka genap: " + jumlahGenap);
    } 
}
