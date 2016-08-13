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
public class decbin {
    public static int DB(int n){ 
        if (n<2){// en la base pongo condicion si el numero es menor que 2 si lo es se imprime
           System.out.print(n);
        } else {
            DB(n/2);// en el dominio el numero se divide entre 2 y despues vuelve a preguntar si si es menor que 0, despues se saca el residuo de n y se imprime    
            
            System.out.print(n%2);
            return n;
        }
        return 0;
        
 
    }
}


