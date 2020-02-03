package javaapplication16;
import javax.swing.JOptionPane;

/**
 *
 * @author Z
 */
public class Proyecto16_Unidad1 {
    public static int mayuscula(String cadena){
        int total=0;
        for(int i=0;i<cadena.length();i++){
            if(cadena.charAt(i)>=65 && cadena.charAt(i)<=90){
                total++;
             }
         }
        return total;
     }
     public static int manuscula(String cadena){
        int total=0;
        for(int i=0;i<cadena.length();i++){
            if(cadena.charAt(i)>=95 && cadena.charAt(i)<=122){
                total++;
             }
         }
        return total;
     }
    public static void main(String[] args) {
        String entrada;
        int conta1=0,conta2=0,totaletras;
        entrada = JOptionPane.showInputDialog("Introduce Un Texto");
        for (int i=0; i<entrada.length();i++){
            if ((entrada.toLowerCase().charAt(i)=='a')||(entrada.toLowerCase().charAt(i)=='e')||
                (entrada.toLowerCase().charAt(i)=='i')||(entrada.toLowerCase().charAt(i)=='o')||
                (entrada.toLowerCase().charAt(i)=='u')){
                     conta2++;
              }
             }
        for (int i=0; i<entrada.length();i++){
            if ((entrada.toLowerCase().charAt(i)=='b')||(entrada.toLowerCase().charAt(i)=='c')||
                (entrada.toLowerCase().charAt(i)=='d')||(entrada.toLowerCase().charAt(i)=='f')||
                (entrada.toLowerCase().charAt(i)=='g')||(entrada.toLowerCase().charAt(i)=='h')||
                (entrada.toLowerCase().charAt(i)=='j')||(entrada.toLowerCase().charAt(i)=='k')||
                (entrada.toLowerCase().charAt(i)=='l')||(entrada.toLowerCase().charAt(i)=='m')||
                (entrada.toLowerCase().charAt(i)=='n')||(entrada.toLowerCase().charAt(i)=='ñ')||
                (entrada.toLowerCase().charAt(i)=='p')||(entrada.toLowerCase().charAt(i)=='q')||
                (entrada.toLowerCase().charAt(i)=='r')||(entrada.toLowerCase().charAt(i)=='s')||
                (entrada.toLowerCase().charAt(i)=='t')||(entrada.toLowerCase().charAt(i)=='v')||
                (entrada.toLowerCase().charAt(i)=='w')||(entrada.toLowerCase().charAt(i)=='x')||
                (entrada.toLowerCase().charAt(i)=='y')||(entrada.toLowerCase().charAt(i)=='z')){
                conta1++;
            }
         }
        totaletras=conta1+conta2;
         System.out.println("Numero Total De vocales Es De: "+conta1);
         System.out.println("Numero Total De Consonantes Es De: "+conta2);
         System.out.println("El Numero Total De consonantes Es De: " +
                manuscula(entrada));
         System.out.println("El Numero Total De vocales Es De: " +
                mayuscula(entrada));
         System.out.println("Total De Letras: "+totaletras);
     }
 }