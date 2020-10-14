/*6) Crie uma classe conta bancaria e apresente os atributos e métodos
referentes esta classe, em seguida crie um objeto conta bancaria, defina
as instancias deste objeto e apresente as informações deste objeto no
console.*/
package PacoteJavaAtividade14_10_20;

public class Bancaria_Conta {

	public static void main(String[] args)
	{
		exer6_bancaria conta = new exer6_bancaria("Antonio da Silva", "100-56 ","Cotia036");
		System.out.println(conta.getBancaria());
	}
}
