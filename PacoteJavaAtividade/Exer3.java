package PacoteJavaAtividade;

import java.util.Scanner;

public class Exer3 {
/*3. Fa�a um sistema que leia o tempo de dura��o de um evento
*  em uma f�brica expressa em segundos e mostre-o expresso em 
*  horas, minutos e segundos.*/
	
	public static void main(String[] args) 
	{
		Scanner ler = new Scanner(System.in);
		int segundos, horas, minutos, totalsegundos;
		
		System.out.print("Entre com o tempo do evento: ");
		totalsegundos = ler.nextInt(); 
		
		horas = totalsegundos /3600;
		minutos = (totalsegundos % 3600)/60;
		segundos = totalsegundos % 3600 % 60;
		
		System.out.print( horas+ "hrs: " +minutos+"min: "+segundos+"seg");		
	}
}
