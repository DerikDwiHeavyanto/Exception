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
public class ThrowDemo {
    public static void main(String[] args) {
        String input = "Invalid input";
        try{
            if (input.equals("Invalid input")) {
                throw new RuntimeException("throw demo");
            }else{
                System.out.println(input);
            }
            System.out.println("After throwing....");
        }
        catch(RuntimeException e){
            System.out.println("Exception Caught Here....");
            System.out.println(e);
        }
    }
}
