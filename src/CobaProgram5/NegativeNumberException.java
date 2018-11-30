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
public class NegativeNumberException extends Exception{
    private int bilangan;
    
    NegativeNumberException(){
    }
    NegativeNumberException(String pesan){
        super(pesan);
    }
}
