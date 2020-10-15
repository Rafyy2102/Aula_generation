/*4. Implemente a classe Administrador como subclasse da classe pessoa. Um determinado
administrador tem como atributos da classe Pessoa e também os atributos próprios como
ajudaDeCusto (ajudas referentes a viagens, estadias). FAZERRRRR*/
package PacoteAtividade15_10_20;

public class Administrador extends Pessoa {
	private double ajudaCusto;
	
	public Administrador (String nome, String endereco, String telefone, String CPF, int idade, double custo)
	{
		super(nome, endereco, telefone, CPF, idade);
		this.ajudaCusto = custo;		
	}
	
	public void Informacao()
	{
		System.out.println("Nome do Administrador: "+getNome()+ "\nNº CPF: "+getCpf()+ "\nSua idade é: "+getIdade()+ "\nNº de seu contato é: "+getTelefone()+ "\nSeu endereço: "+getEndereco());
		System.out.println("\n");
		System.out.println("O valor do custo é: R$  "+ajudaCusto);
	}

	public double getAjudaCusto() {
		return ajudaCusto;
	}

	public void setAjudaCusto(double ajudaCusto) {
		this.ajudaCusto = ajudaCusto;
	}
}
