package PacoteJavaAtividade;

import java.util.Scanner;

public class Exer5 {
/*5. Fa�a um sistema que leia as 3 notas de um aluno e calcule a m�dia final deste aluno. 
 * Considerar que a m�dia � ponderada e que o peso das notas �: 2,3 e 5, respectivamente. */
	
	public static void main(String[] args) 
	{
		Scanner ler = new Scanner(System.in);
		double n1 ,n2, n3, media;
		
		System.out.print("Digite a nota1: ");
		n1 = ler.nextDouble();
		System.out.print("Digite a nota2: ");
		n2 = ler.nextDouble();
		System.out.print("Digite a nota3: ");
		n3 = ler.nextDouble();
		
		media = ((n1 * 2) + (n2 * 3) + (n3 * 5)) / (2 + 3 + 5);
		System.out.printf("A nota final �: %.2f " , media);

	}
}
