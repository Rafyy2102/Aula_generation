package PacoteJavaAtividade07_10_20;

import java.util.Scanner;

public class Exercicio4 {
/*4- Faça um programa em que permita a entrada de um número qualquer e exiba se este
número é par ou ímpar. Se for par exiba também a raiz quadrada do mesmo; se for
ímpar exiba o número elevado ao quadrado.*/
	
	public static void main(String[] args) 
	{
		Scanner ver= new Scanner(System.in);
		int num;
		
		System.out.print("Digite um número: ");
		num = ver.nextInt();
		
		if(num % 2 == 0) 
			System.out.printf("O número "+num+" é par \n" + "A raiz quadrada é: "+Math.sqrt(num));			
		else 
			System.out.printf("O número "+num+ " é impar \n" + "O quadrado é: "+Math.pow(num,2));
	}
}
