/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ed.irocha.a01;

/**
 *
 * @author casa
 */
public class escalera {
    public static int escalon(int n){
        if (n == 0){//Caso base, si el numero es 0 significa que ya estas abajo
           return n;
        } else {
            System.out.println("Vas en el escalon " + n);//
            return escalon(n-1);
            
        }
    
}
}