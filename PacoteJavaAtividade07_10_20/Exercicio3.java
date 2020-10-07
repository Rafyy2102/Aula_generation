package PacoteJavaAtividade07_10_20;

import java.util.Scanner;

public class Exercicio3 {
/*3- Faça um programa que receba a idade de uma pessoa e mostre na saída em qual
categoria ela se encontra: 10-14Infantil; 15-17Juvenil;18-25Adulto*/
	
	public static void main(String[] args) 
	{
		Scanner leia = new Scanner(System.in);		
		int idade;
		String nome;
		
		System.out.print("Digite seu nome: ");
		nome = leia.next();
				
		System.out.print("Digite sua idade: ");
		idade = leia.nextInt();
		
		if(idade >= 10 && idade <= 14) 
		
			System.out.print(nome+ " Sua classificação é Infantil.");
		else if(idade >= 15 && idade <= 17) 
		
			System.out.print(nome+ " Sua classificação é Juvenil.");
		else if(idade >= 18 && idade <= 25) 
		
			System.out.print(nome+ " Sua classificação é Adulta.");
		else 
			System.out.print(nome+ " Sem classificação.");				
	}
}
