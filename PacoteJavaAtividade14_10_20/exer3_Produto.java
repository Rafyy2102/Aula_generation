/*3) Crie uma classe produto eletrônico e apresente os atributos e métodos
referentes esta classe, em seguida crie um objeto produto eletrônico,
defina as instancias deste objeto e apresente as informações deste objeto
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
