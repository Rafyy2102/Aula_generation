package PacoteJavaAtividade08_10_20;

import java.util.Scanner;

public class Exerc5 {
/*5- Crie um programa que leia um número do teclado até que encontre um
número igual a zero. No final, mostre a soma dos números
digitados.(DO...WHILE)*/
	
	public static void main(String[] args) 
	{
		Scanner tecla = new Scanner(System.in);
		int num, soma=0;
				
		do 
		{
			System.out.print("Informe um número: ");
			num = tecla.nextInt();
						
			soma += num;
			
		}while(num!=0);
		
		System.out.printf("A soma dos valores é: %d", soma);	
	}
}
