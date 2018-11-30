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
public class Latihan3 {
    public static void main(String[] args) {
        try{
            int a = 3/0;
            int num = Integer.parseInt(args[0]);
            System.out.println("Perintah selajutnya....");
        }
        catch(ArrayIndexOutOfBoundsException e){
    }
        catch(NullPointerException e){
    }
        catch(Exception e){
    }
}
}
