package PacoteJavaAtividade;

import java.util.Scanner;

public class Exer7 {
/*7. Um sistema de equa��es lineares do tipo: linear, pode ser resolvido segundo mostrado abaixo: 
 * Escreva um sistema que l� os coeficientes a,b,c,d,e, f e calcula e mostra os valores de x e y. */
	
	public static void main(String[] args) 
	{
	Scanner ler = new Scanner(System.in);
	double a, b, c, d, e, f, x, y;
	
	System.out.print("Digite o valor de A: ");
	a = ler.nextDouble();
	System.out.print("Digite o valor de B: ");
	b = ler.nextDouble();
	System.out.print("Digite o valor de C: ");
	c = ler.nextDouble();
	System.out.print("Digite o valor de D: ");
	d = ler.nextDouble();
	System.out.print("Digite o valor de E: ");
	e = ler.nextDouble();
	System.out.print("Digite o valor de F: ");
	f = ler.nextDouble();
	
	x = (((c * e) - (b *f)) / ((a * e) - (b * d)));
	y = (((a * f) - (c *d)) / ((a * e) - (b * d)));
	
	System.out.printf("Os  valores de X s�o: %.2f ",x);
	System.out.println();
	System.out.printf("Os  valores de Y s�o: %.2f ",y);

	}
}
