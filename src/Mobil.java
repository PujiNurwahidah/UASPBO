/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Puji
 */
public class Mobil {
    private String merek;
    private int tahunProduksi;
    private String warna;
    private int kecepatan;

public Mobil(String merek, int tahunProduksi, String warna) {
        this.merek = merek;
        this.tahunProduksi = tahunProduksi;
        this.warna = warna;
        this.kecepatan = 0;
    }

public void percepat(int nilaiKecepatan) {
        this.kecepatan += nilaiKecepatan;
    }

public void tampilInformasi() {
        System.out.println("Informasi Mobil:");
        System.out.println("Merek: " + merek);
        System.out.println("Tahun Produksi: " + tahunProduksi);
        System.out.println("Warna: " + warna);
        System.out.println("Kecepatan: " + kecepatan + " km/h");
    }
 public static void main(String[] args) {
        Mobil mobilku = new Mobil("Honda", 2022, "Putih");
        mobilku.tampilInformasi(); 

        mobilku.percepat(50); 
        mobilku.tampilInformasi(); 
    }
    
}
