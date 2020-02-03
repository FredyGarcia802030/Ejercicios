
import java.util.Scanner;

public class Main 
{    
    public static void main(String[] args)
    {
        Scanner tecla = new Scanner (System.in);
        int numero ,inicial = 1 ,suma = 0,producto = 1;

        System.out.print("Introduce un numero: ");
        numero = tecla.nextInt();

        while(inicial < numero)
        {
            if(inicial%2==0)
            {
                suma = suma + inicial;
            }
            else
            {
                producto = producto * inicial;
            }
            inicial++;
        }

        System.out.println("\n La suma de los numero pares es: "+suma);
        System.out.println("\n El producto de los numeros naturales es: "+producto);
    }
}