import java.util.Scanner;
 
public class Triangulo
{
	public static void main(String[] args)
	{
		Scanner leer = new Scanner(System.in);
 
 
		boolean l1, l2, l3;
 
		System.out.println("Escriba el lado 1");
		l1 = leer.nextBoolean();
 
		System.out.println("Escriba el lado 2");
		l2 = leer.nextBoolean();
 
		System.out.println("Escriba el lado 3");
		l3 = leer.nextBoolean();
 
		if(l1==l2==l3)
			{
			System.out.println("Triangulo Equilatero");
			}	else	{
					if((l1==l2!=l3) || (l1==l3!=l2) || (l2==l3!=l1))
						{
							System.out.println("Triangulo Isoseles");
						}	else	{
								System.out.println("Triangulo Escaleno");
								}
					}
	}
}