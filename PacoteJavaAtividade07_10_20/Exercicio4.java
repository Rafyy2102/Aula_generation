package PacoteJavaAtividade07_10_20;

import java.util.Scanner;

public class Exercicio4 {
/*4- Fa�a um programa em que permita a entrada de um n�mero qualquer e exiba se este
n�mero � par ou �mpar. Se for par exiba tamb�m a raiz quadrada do mesmo; se for
�mpar exiba o n�mero elevado ao quadrado.*/
	
	public static void main(String[] args) 
	{
		Scanner ver= new Scanner(System.in);
		int num;
		
		System.out.print("Digite um n�mero: ");
		num = ver.nextInt();
		
		if(num % 2 == 0) 
			System.out.printf("O n�mero "+num+" � par \n" + "A raiz quadrada �: "+Math.sqrt(num));			
		else 
			System.out.printf("O n�mero "+num+ " � impar \n" + "O quadrado �: "+Math.pow(num,2));
	}
}
