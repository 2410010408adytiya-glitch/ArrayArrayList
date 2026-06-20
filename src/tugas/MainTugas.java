/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas;

/**
 *
 * @author Adytiya Pratama 2410010408
 */
public class MainTugas {
     public static void main(String[] args) {

        KelasKuliah kelas = new KelasKuliah();

        // Array mata kuliah
        String[] mataKuliah = {
            "Pemrograman Java",
            "Basis Data",
            "Jaringan Komputer"
        };

        System.out.println("=== Daftar Mata Kuliah ===");
        for (String mk : mataKuliah) {
            System.out.println("- " + mk);
        }

        System.out.println();

        // Tambah 5 mahasiswa
        kelas.tambahMahasiswa(new Mahasiswa("Andi", "231001", 85));
        kelas.tambahMahasiswa(new Mahasiswa("Budi", "231002", 70));
        kelas.tambahMahasiswa(new Mahasiswa("Citra", "231003", 55));
        kelas.tambahMahasiswa(new Mahasiswa("Dina", "231004", 90));
        kelas.tambahMahasiswa(new Mahasiswa("Eko", "231005", 45));

        kelas.tampilkanSemua();

        System.out.println();
        System.out.println("Rata-rata nilai : " + kelas.hitungRataRata());
        System.out.println("Jumlah lulus    : " + kelas.jumlahLulus());

        // Tambah 1 mahasiswa baru
        kelas.tambahMahasiswa(new Mahasiswa("Fajar", "231006", 80));

        System.out.println();
        System.out.println("Setelah menambah 1 mahasiswa:");
        System.out.println("Jumlah data mahasiswa = " + kelas.jumlahMahasiswa());
    }
}
