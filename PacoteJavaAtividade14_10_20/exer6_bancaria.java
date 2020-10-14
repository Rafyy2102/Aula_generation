/*6) Crie uma classe conta bancaria e apresente os atributos e métodos
referentes esta classe, em seguida crie um objeto conta bancaria, defina
as instancias deste objeto e apresente as informações deste objeto no
console.*/
package PacoteJavaAtividade14_10_20;

public class exer6_bancaria {

	private String conta_nome;
	private String conta_numero;
	private String conta_agencia;

	public exer6_bancaria(String nomes, String conta, String agencias)
	{
		conta_nome = nomes;
		conta_numero = conta;
		conta_agencia = agencias;
	}
	public String getBancaria()
	{
		String Bancaria = conta_nome + ", "+" "+conta_numero+ ", "+conta_agencia;
		return Bancaria;
	}
}
