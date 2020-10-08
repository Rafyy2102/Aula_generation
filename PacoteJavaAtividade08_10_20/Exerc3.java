package PacoteJavaAtividade08_10_20;

import java.util.Scanner;

public class Exerc3 {
/*3- Solicitar a idade de várias pessoas e imprimir: Total de pessoas com menos de
21 anos. Total de pessoas com mais de 50 anos. O programa termina quando
idade for =-99. (WHILE)*/
	
	public static void main(String[] args) 
	{
		Scanner ver = new Scanner(System.in);
		int idade=0, ida21=0, ida50=0;
		
		System.out.println("O programa só para quando digitar -99");	
		
		while(idade<98)
		{
			System.out.print("Informe sua idade: ");
			idade = ver.nextInt();
			
			if(idade<=21)
			{
				ida21 = ida21+1;
			}
			else if(idade>50)
			{
				ida50 = ida50+1;
			}			
		}
		System.out.printf("Idade maior que 21: %d\n", ida21);
		System.out.printf("Idade maior que 50: %d\n", ida50);
	}

}
