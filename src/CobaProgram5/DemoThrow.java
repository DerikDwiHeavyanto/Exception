/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CobaProgram5;

/**
 *
 * @author ASUS A442U
 */
public class DemoThrow {
    public static void main(String[] args) {
        DataMhs obj = new DataMhs();
        obj.setNim("028498029");
        obj.setNilai(80);
        obj.setNama("Abimanyu");
        
        System.out.println("Nama anda : " + obj.getNama());
        System.out.println("Nilai anda adalah : " + obj.getNilai());
        System.out.println("NIM anda adalah : " + obj.getNim());
    }
    
}
