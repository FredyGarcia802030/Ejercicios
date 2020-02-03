
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package area.del.rectangulo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;.del.rectangulo;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *
 * @author Z
 */
public class AreaDelRectangulo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
    InputStreamReader input=new InputStreamReader (System.in);
    BufferedReader teclado=new BufferedReader(input);
    double base,altura = 0,area;
    System.out.println("digite la base");
    base=Double.valueOf(teclado.readLine());
    System.out.println("digite la altura");
    altura=Double.valueOf(teclado.readLine());
    area=base*altura;
    System.out.println(" area del rectangulo "+area);
    
    }
    
}
