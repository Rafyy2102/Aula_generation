package PacoteJavaAtividade08_10_20;

import java.util.Scanner;

public class Exerc6 {
/*6- Escrever um programa que receba vários números inteiros no teclado. E no
final imprimir a média dos números múltiplos de 3. Para sair digitar
0(zero).(DO...WHILE)*/
	
	public static void main(String[] args)
	{
		Scanner tecla = new Scanner(System.in);
		int num, media, soma=0, cont=0;
		
		do
		{
			System.out.print("Informe um número: ");
			num = tecla.nextInt();
			
			if(num%3 ==0 && num != 0)
			{
				soma += num;
				cont++;
			}
			
		}while(num != 0);
		
		media = soma / cont;					
		System.out.printf("\nA media dos valores é: %d", media);		
	}
}
