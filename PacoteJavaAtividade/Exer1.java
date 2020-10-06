package PacoteJavaAtividade;

import java.util.Scanner;

public class Exer1 {
/*1.Faça um sistema que leia a idade de uma pessoa expressa em 
 * anos, meses e dias e mostre-a expressa apenas em dias. */
	
	
	public static void main(String[] args) 
	{
		Scanner ler = new Scanner(System.in);
		short dia, mes, ano; 
		short DA = 365, DM = 30;
		
		System.out.print("Digite seu dia de nascimento: ");
		dia = ler.nextShort();
		System.out.print("Digite o mês do seu nascimento: ");
		mes = ler.nextShort();
		System.out.print("Digite o ano do seu nascimento: ");
		ano = ler.nextShort();
		
		dia += (ano * DA) + (mes * DM);
		
		System.out.print("A sua idade em dias é : "+ dia);		
	}
}
