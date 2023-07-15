/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Puji
 */
public class Buku {
    private String judul;
    private String penulis;
    private int tahunTerbit;
    private int jumlahHalaman;

    public Buku(String judul, String penulis, int tahunTerbit, int jumlahHalaman) {
        this.judul = judul;
        this.penulis = penulis;
        this.tahunTerbit = tahunTerbit;
        this.jumlahHalaman = jumlahHalaman;
    }

    public void tambahHalaman(int tambahanHalaman) {
        this.jumlahHalaman += tambahanHalaman;
    }

    public void tampilInformasi() {
        System.out.println("Judul: " + this.judul);
        System.out.println("Penulis: " + this.penulis);
        System.out.println("Tahun Terbit: " + this.tahunTerbit);
        System.out.println("Jumlah Halaman: " + this.jumlahHalaman);
    }

    public static void main(String[] args) {
        Buku buku1 = new Buku("Catatan Panjang Untuk Cerita yang Pendek", "Boy Candra", 2014, 212);
        buku1.tampilInformasi(); 
        buku1.tambahHalaman(50); 
        buku1.tampilInformasi(); 
    }
    
}
