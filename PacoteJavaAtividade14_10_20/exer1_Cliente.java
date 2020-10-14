/*1) Crie uma classe cliente e apresente os atributos e métodos referentes
esta classe, em seguida crie um objeto cliente, defina as instancias deste
objeto e apresente as informações deste objeto no console.*/
package PacoteJavaAtividade14_10_20;

public class exer1_Cliente {
    //atributos privado
	private String Nome;
	private String segundonome;
	private String terceironome;
	//construtor e os argumentos
	public exer1_Cliente(String nome, String meio, String ultimo) 
	{
		Nome = nome;
		segundonome = meio;
		terceironome = ultimo;
	}	
	//metodo para juntar os atributos
	public String getNomeCompleto() 
	{
		String nomeCompleto = Nome + " "+ segundonome+" "+terceironome;
		return nomeCompleto;
	}
}


