package PacoteJavaAtividade08_10_20;

public class Exerc1 {
/*1-Informar todos os números de 1000 a 1999 que quando divididos por 11
obtemos resto = 5. (FOR)*/
	
	public static void main(String[] args)
	{
		int n;
		
		for (n=1000; n<=1999; n++)
		{
			if((n % 11)==5)
			{
				System.out.printf("\n\nO número é: "+n);
			}
		}
	}
}
