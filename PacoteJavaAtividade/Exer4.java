package PacoteJavaAtividade;

import java.util.Scanner;

public class Exer4 {
/*4.Escreva um sistema que leia três números inteiros e 
* positivos (A, B, C) e calcule a seguinte expressão  */
	
	public static void main(String[] args) 
	{
		Scanner ler = new Scanner(System.in);
		int a, b, c, d, s, r;
		
		System.out.print("Entre com o valor de A: ");
		a = ler.nextInt(); 
		System.out.print("Entre com o valor de B: ");
		b = ler.nextInt();
		System.out.print("Entre com o valor de C: ");
		c = ler.nextInt();
		
		r = (a + b)^2;
		
		s = (b + c)^2;
		
		d = (r + s)/2;
		
		System.out.printf("A soma é: %d",d);
	}
}
