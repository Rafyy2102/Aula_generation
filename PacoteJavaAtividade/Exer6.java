package PacoteJavaAtividade;

import java.util.Scanner;
import java.lang.*;

public class Exer6 {
/*6. Construa um programa em c que, tendo como dados de entrada dois pontos quaisquer no 
* plano, P(x1, y1) e P(x2, y2), escreva a distância entre eles. A fórmula que efetua tal cálculo é*/
	
	public static void main(String[] args)
	{
		Scanner ler = new Scanner(System.in);
		double x1,x2, y1, y2, d; 
		
		System.out.printf("Digite o valor de X1: ");
		x1 = ler.nextDouble();
		System.out.printf("Digite o valor de X2: ");
		x2 = ler.nextDouble();
		System.out.printf("Digite o valor de Y1: ");
		y1 = ler.nextDouble();
		System.out.printf("Digite o valor de Y2: ");
		y2 = ler.nextDouble();
		
		d = Math.sqrt((Math.pow(x2-x1,2) + Math.pow(y2-y1,2)));		
		System.out.printf ("O valor da raiz quadrada é: %.2f",d);		
	}
}
