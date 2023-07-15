/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Puji
 */
public class PersegiPanjang {
    private float panjang;
    private float lebar;

    public PersegiPanjang(float panjang, float lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }

    public float hitungLuas() {
        return panjang * lebar;
    }

    public float hitungKeliling() {
        return 2 * (panjang + lebar);
    }

    public static void main(String[] args) {
        PersegiPanjang pp = new PersegiPanjang(5, 10);
        System.out.println("Luas persegi panjang: " + pp.hitungLuas());
        System.out.println("Keliling persegi panjang: " + pp.hitungKeliling());
    }
    
}
