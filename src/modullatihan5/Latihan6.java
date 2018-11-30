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
public class Latihan6 extends Exception {
    private int bilangan ;
    
    Latihan6(){
    }
    Latihan6(String pesan){
        super(pesan);
    }
    Latihan6(String pesan, int nilai) {
        super(pesan);
        bilangan = nilai;
    }
    public int getBilangan  ( ) {
        return bilangan;
    }
}
