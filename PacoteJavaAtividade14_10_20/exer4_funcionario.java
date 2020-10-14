/*4) Crie uma classe funcionário e apresente os atributos e métodos
referentes esta classe, em seguida crie um objeto funcionário, defina as
instancias deste objeto e apresente as informações deste objeto no
console.*/
package PacoteJavaAtividade14_10_20;

public class exer4_funcionario {
	
	public void funcionarios()
	{
		System.out.printf("O salario do fucnionario inteiro: %d \n", salario(1000));
		System.out.printf("O salario do fucnionario double: %f \n ", salario(1.500));
	}
	public int salario(int valorInt)
	{
		System.out.printf("O salario do funcionario em inteiro: %d \n",valorInt);
		return valorInt * valorInt;
	}
	public double salario(double valorDouble)
	{
		System.out.printf("O salario do funcionario em double: %f \n",valorDouble);
		return valorDouble * valorDouble;
	}	
}
