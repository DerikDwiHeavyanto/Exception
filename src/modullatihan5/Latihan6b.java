/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modullatihan5;

/**
 *
 * @author ASUS A442U
 */
public class Latihan6b {
    public static int hitungFaktorial (int n) throws Latihan6{
        if (n<0) {
            throw new Latihan6("Bilangan tidak boleh negatif",n);
        }
        int hasil = 1;
        for (int i = n; i >= 1; i--) {
            hasil *= i;
        }
        return hasil;
    }
    public static void main(String[] args) {
        System.out.println("Pada saat menghitung 5! ");        
        try {
            System.out.println("Hasil = " + hitungFaktorial(5));
        }catch (Latihan6 l6){
            System.out.println("Bilangan = " + l6.getBilangan());
        }
        System.out.println("\nPada saat menghitung -5! ");
        try{
            System.out.println("Hasil = " + hitungFaktorial(-5));
        }catch(Latihan6 l6){
            System.out.println("Hasil = " + l6.getBilangan());
            l6.printStackTrace();
        }
    }
}
