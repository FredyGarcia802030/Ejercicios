/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package par.o.impar;

import java.util.Scanner;

/**
 *
 * @author Z
 */
public class ParOImpar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
    Scanner sn=new Scanner(System.in);
    
    System.out.println("introduzca numero");
    int num=sn.nextInt();
    
    if(num%2==0){
        System.out.println("el numero "+num+" es par ");
    }else{
        System.out.println("el numero "+num+" no es par ");
    }
    }
    
}
