/*3) Crie uma classe produto eletr�nico e apresente os atributos e m�todos
referentes esta classe, em seguida crie um objeto produto eletr�nico,
defina as instancias deste objeto e apresente as informa��es deste objeto
no console.*/
package PacoteJavaAtividade14_10_20;

public class exer3_Produto {

	private String celular;
	private String notebooks;
	private String relogio;
	
	public exer3_Produto(String smartfones, String notebook, String smartwatch )
	{
		celular = smartfones;
		notebooks = notebook;
		relogio = smartwatch;
	}
	public String getProduto()
	{
		String Produto = celular+", "+" "+notebooks+", " +" " + relogio;
		return Produto;
	}
}
