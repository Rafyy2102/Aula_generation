package PacoteJavaAtividade;

import java.util.Scanner;

public class Exer2 {
/*2. Fa�a um sistema que leia a idade de uma pessoa
 *  expressa em dias e mostre-a expressa em anos, meses e dias. */
	
	public static void main(String[] args) 
	{
		Scanner ler = new Scanner(System.in);
		 int nascimento,anoA, idadeano,idademes,idadedia;
		 		    
		    System.out.print("Ano de seu Nascimento: ");
		    nascimento = ler.nextInt();
		    System.out.print("Ano Atual: ");
		    anoA = ler.nextInt();
		    
		    idadeano = anoA - nascimento;
		    idademes =  idadeano * 12;
		    idadedia = idadeano * 365;	  
		 
		    System.out.println("A em anos �:" + idadeano);
		    System.out.println("A idade em meses �: " + idademes);
		    System.out.println("A idade em dias �: " + idadedia);		    
	}
}


