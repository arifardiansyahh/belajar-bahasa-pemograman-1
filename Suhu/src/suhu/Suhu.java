/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package suhu;

import static java.lang.System.out;
import java.util.Scanner;

/**
 *
 * @author Arif Ardiansyah
 */
public class Suhu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner Baca = new Scanner (System.in);
        float c,r,f,k;
        System.out.println("Celcius = ");c=Baca.nextFloat();
        r= 4/5f*c;
        f= 5/9f*c+32;
        k=273+c;
        out.println("Celcius = "+c);
        out.println("Reamur = "+r);
        out.println("Farenheit = "+f);
        out.println("Kelvin = "+k);
              
    }
    
}
