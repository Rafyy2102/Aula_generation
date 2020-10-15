/*4. Implemente a classe Administrador como subclasse da classe pessoa. Um determinado
administrador tem como atributos da classe Pessoa e tamb�m os atributos pr�prios como
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
		System.out.println("Nome do Administrador: "+getNome()+ "\nN� CPF: "+getCpf()+ "\nSua idade �: "+getIdade()+ "\nN� de seu contato �: "+getTelefone()+ "\nSeu endere�o: "+getEndereco());
		System.out.println("\n");
		System.out.println("O valor do custo �: R$  "+ajudaCusto);
	}

	public double getAjudaCusto() {
		return ajudaCusto;
	}

	public void setAjudaCusto(double ajudaCusto) {
		this.ajudaCusto = ajudaCusto;
	}
}
