package PacoteJavaAtividade08_10_20;

import java.util.Scanner;

public class Exerc4 {
/*4- Uma empresa desenvolveu uma pesquisa para saber as características
psicológicas dos indivíduos de uma região. Para tanto, a cada uma das pessoas
era perguntado: idade, sexo (1-feminino / 2-masculino / 3-Outros), e as opções
(1, se a pessoa era calma; 2, se a pessoa era nervosa e 3, se a pessoa era
agressiva). Pede-se para elaborar um sistema que permita ler os dados de 150
pessoas, calcule e mostre: (WHILE)
 o número de pessoas calmas;
 o número de mulheres nervosas;
 o número de homens agressivos;
 o número de outros calmos;
 o número de pessoas nervosas com mais de 40 anos;
 o número de pessoas calmas com menos de 18 anos.*/
	
	public static void main(String[] args) 
	{
		Scanner teclado = new Scanner(System.in);
		int idade, sexo, psico, pessoa=1, mn=1, ha=0, contpc=0, contoc=0, contpn40=0, contpc18=0 ;
				
		while(pessoa<=2)
		{
			System.out.println("Informe sua idade: ");
			idade = teclado.nextInt();
			while(idade < 1 || idade > 100)
			{
				System.out.print("\nInforme sua idade: ");
				idade = teclado.nextInt();
			}
			System.out.println("Escolha uma opção: \n1-Feminino\n2-Masculino\n3-Outros ");
			sexo = teclado.nextInt();
			while(sexo < 1 || sexo > 3)
			{
				System.out.print("\nInforme seu sexo: 1-Feminino 2-Masculino 3-Outros ");
				sexo = teclado.nextInt();
			}	
			
			System.out.println("\nEscolha uma opção: \n1-Pessoa calma\n2-Pessoa nervosa\n3-Pessoa agressiva ");
			psico = teclado.nextInt();
			while(psico < 1 || psico > 3)
			{
				System.out.print("\nInforme com seu fator psicológico: 1-Calmo/a 2-Nervoso/a 3-Agressivo/a");
				psico = teclado.nextInt();
			}
			switch(psico)
			{
			case 1:
				if(psico == 1) contpc++;
				else if(sexo == 3 && psico == 1) contoc++;											
		        break;
			case 2:
				if(psico == 2 && idade > 40) contpn40++;
				else if(psico == 1 && idade < 18) contpc18++;
		        break;
			case 3:
				if(sexo == 1 && psico == 2) mn++; 
				if(sexo == 2 && psico == 3) ha++;
		        break;
		    }		
			
			pessoa++;
		}
			System.out.printf("\nO numero de pessoas calmas:"+ contpc);
			System.out.printf("\nO numero de mulheres nervosas:"+mn);
			System.out.printf("\nO numero de homens agressivos: "+ha );
			System.out.printf("\nO numero de outros calmos: "+contoc );
			System.out.printf("\nO numero de pessoas nervosa com mais de 40 anos: "+contpn40);
			System.out.printf("\nO numero de pessoas calmas com menos de 18 anos: "+contpc18);	
	}
}


