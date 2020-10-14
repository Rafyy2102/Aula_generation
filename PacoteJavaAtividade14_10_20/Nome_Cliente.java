/*1) Crie uma classe cliente e apresente os atributos e métodos referentes
esta classe, em seguida crie um objeto cliente, defina as instancias deste
objeto e apresente as informações deste objeto no console.*/
package PacoteJavaAtividade14_10_20;

public class Nome_Cliente {
	public static void main(String args[])
	{
		exer1_Cliente cliente = new exer1_Cliente ("Joao","Antonio","Santos");
		System.out.println(cliente.getNomeCompleto());
	}	
}
