/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bagian3.perpustakaan;

/**
 *
 * @author Adytiya Pratama 2410010408
 */
public class MainPerpustakaan {
    public static void main(String[] args) {

        Perpustakaan perpus = new Perpustakaan();

        perpus.tambahBuku(new Buku("Laskar Pelangi", "Andrea Hirata", 2005));
        perpus.tambahBuku(new Buku("Bumi Manusia", "Pramoedya", 1980));
        perpus.tambahBuku(new Buku("Negeri 5 Menara", "Ahmad Fuadi", 2009));

        perpus.tampilkanKoleksi();

        System.out.println();

        perpus.pinjamBuku("Bumi Manusia");

        System.out.println();

        // Uji method kembalikanBuku
        perpus.kembalikanBuku("Bumi Manusia");

        System.out.println();

        // Uji method cariPenulis
        perpus.cariPenulis("Andrea Hirata");

        System.out.println();
        perpus.tampilkanKoleksi();

        System.out.println("Buku tersedia: " + perpus.jumlahTersedia());
    }

}
