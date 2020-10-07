package PacoteJavaAtividade07_10_20;

import java.util.Scanner;

public class Exercicio1 {
/*1-Faça um programa que receba três inteiros e diga qual deles é o maior.*/
	
	public static void main(String[] args) 
	{
		Scanner leia = new Scanner(System.in);
		int n1, n2, n3;
		
		System.out.print("Digite N1: ");
		n1 = leia.nextInt();
		System.out.print("Digite N2: ");
		n2 = leia.nextInt();
		System.out.print("Digite N3: ");
		n3 = leia.nextInt();
		
		if(n1 > n2 && n1 > n3) 
			System.out.println("O maior é: "+ n1);
			  if(n2>n1 && n2>n3)
				System.out.println("O maior número é "+ n2);
					else
						System.out.println("O maior é "+ n3);		
		
	}

}
