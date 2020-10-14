/*5) Crie uma classe patinete e apresente os atributos e métodos referentes
esta classe, em seguida crie um objeto patinete, defina as instancias deste
objeto e apresente as informações deste objeto no console.*/
package PacoteJavaAtividade14_10_20;

public class exer5_patinete {
	private String rodas;
	private String modelo;
	private String cores;
	
	public exer5_patinete(String duas, String aluminio, String cor)
	{
		rodas = duas;
		modelo = aluminio;
		cores = cor;
	}
	public String getpatientes()
	{
		String patinetes = rodas + ", "+" "+modelo+ ", "+cores;
		return patinetes;
	}	
}
