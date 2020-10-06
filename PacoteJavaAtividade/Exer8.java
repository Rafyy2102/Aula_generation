package PacoteJavaAtividade;

import java.util.Scanner;

public class Exer8 {
/*8. O custo ao consumidor de um carro novo é a soma do custo de fábrica com a 
 * percentagem do distribuidor e dos impostos (aplicados ao custo de fábrica). 
 * Supondo que a percentagem do distribuidor seja de 28% e os impostos de 45%, 
 * escrever um sistema que leia o custo de fábrica de um carro e escreva o custo 
 * ao consumidor. */
	
	public static void main(String[] args)
	{
		Scanner ler = new Scanner(System.in);
		double perce = 0.28, impo = 0.45, valord, custof,  custoc, valori;
		
		System.out.print("Informe o valor de fabrica: ");
		custof = ler.nextDouble();
		
		valord = custof + ( custof * perce);
		impo = custof + (custof * impo);
		custoc = custof + valord + impo;
		
		System.out.printf("O valo do custo para o consumidor é: %.2f ",custoc);
	}
}
