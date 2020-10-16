/*Crie uma hierarquia de classes conforme abaixo com os seguintes atributos e
comportamentos (observe a tabela), utilize os seus conhecimentos e distribua as
características de forma que tudo o que for comum a todos os animais fique na classe
Animal---> cachorro/cavalo/preguisa:nome, idade, emiti som, corre. 
E invoque o método que emite o som de cada um de forma polimórfica, isto independente do tipo de animal.*/

package PacoteJavaAtividade16_10_20;

public class Animal {
	private String nome;
	private int idade;
	private String correr;
	private String som;
	
	public Animal(String nome, int idade, String corre, String som)
	{
		this.nome = nome;
		this.idade = idade; 
		this.correr = corre;
		this.som = som;
	}
		
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getCorrer() {
		return correr;
	}

	public void setCorrer(String corre) {
		this.correr = corre;
	}

	public String getSom() {
		return som;
	}

	public void setSom(final String som) {
		this.som = som;
	}	
}
