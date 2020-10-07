package PacoteJavaAtividade07_10_20;

import java.util.Scanner;

public class Exercicio2 {
/*2-Faça um programa que entre com três números e coloque em ordem crescente.*/
	
	public static void main(String[] args) 
	{
		Scanner leia = new Scanner(System.in);
		int n1, n2, n3;
		
		System.out.print("Digite o valor de N1: ");
		n1 = leia.nextInt();
		System.out.print("Digite o valor de N2: ");
		n2 = leia.nextInt();
		System.out.print("Digite o valor de N3: ");
		n3 = leia.nextInt();
		
		if(n1 < n2 && n1 < n3) 			
			  if(n2<n3)
				System.out.printf("Ordem crescente é:  "+ n1+", " +n2+", " +n3);		
	}
}
