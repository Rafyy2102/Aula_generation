package PacoteJavaAtividade08_10_20;

import java.util.Scanner;

public class Exerc2 {
/*2-Ler 10 n�meros e imprimir quantos s�o pares e quantos s�o �mpares.(FOR)*/
	
	public static void main(String[] args) 
	{
		Scanner ver = new Scanner(System.in);
		int num, par=0, impar=0, cont=0;
		
		//System.out.println("O programa s� para quando digitar -99");	
		
		for(cont=0; cont<10;cont++)
		{
			System.out.print("Inform me um n�mero: ");
			num = ver.nextInt();
			
			if(num %2 == 0)
			{
				par++;
			}
			else 
			{
				impar++;
			}			
		}
		System.out.printf("Quantidade de Par: %d\n", par);
		System.out.printf("Quantidade de Impar: %d\n", impar);
	}
}
