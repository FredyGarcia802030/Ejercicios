/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package area.de.cubo;

import java.util.Scanner;

/**
 *programa que calcule area de cubo 6 x 12 L2
 * @author Z
 */
public class AreaDeCubo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
        double area, lado;
        Scanner input = new Scanner(System.in);
        System.out.print(" digite el valor del lado- > ");
        lado = input.nextDouble();
        area = 6 * lado * lado;
        System.out.println("A área de un cubo para un lado "+lado+ " 6: "+ area);
        
    }
    
    
}
