/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Puji
 */
public class Mahasiswa {
     private String nama;
    private String NIM;
    private String jurusan;
    private float IPK;

    public Mahasiswa(String nama, String NIM, String jurusan, float IPK) {
        this.nama = nama;
        this.NIM = NIM;
        this.jurusan = jurusan;
        this.IPK = IPK;
    }

    public void ubahNama(String namaBaru) {
        this.nama = namaBaru;
    }

    public void tampilInformasi() {
        System.out.println("Nama: " + nama);
        System.out.println("NIM: " + NIM);
        System.out.println("Jurusan: " + jurusan);
        System.out.println("IPK: " + IPK);
    }

    public static void main(String[] args) {
        Mahasiswa mhs = new Mahasiswa("PUJI NURWAHIDAH", "C2083207034", "PTI", 3.79f);
        mhs.tampilInformasi(); 
        mhs.ubahNama("FUJI");
        mhs.tampilInformasi(); 
    }
    
}
