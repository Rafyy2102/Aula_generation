/*6. Implemente a classe Vendedor como subclasse da classe Pessoa. Um determinado vendedor
tem como atributos da classe Pessoa e também os atributos próprios como valorVendas
(correspondente ao valor monetário dos artigos vendidos) e o atributo comissao (porcentagem
do valorVendas que será adicionado ao vencimento base do Vendedor).FAZERRR*/
package PacoteAtividade15_10_20;

public class Vendedor extends Pessoa {
	private double valorVenda;
	private double comissao;
	
	public Vendedor(String nome, String endereco, String telefone, String CPF, int idade, double venda, double comissao)
	{
		super(nome, endereco, telefone, CPF, idade);
		this.valorVenda = venda;
		this.comissao = comissao;
	}
	
	public void Informacao()
	{
		System.out.println("Nome do Vendedor: "+getNome()+ "\nNº CPF: "+getCpf()+ "\nSua idade é: "+getIdade()+ "\nNº de seu contato é: "+getTelefone()+ "\nSeu endereço: "+getEndereco());
		System.out.println("O valor da venda é: R$  "+valorVenda+ "\nO valor da comissão é: R$ "+comissao);
	}

	public void total()
	{
		double Total = valorVenda + (comissao*(valorVenda/100));
		System.out.println("O valor é: R$ "+Total);
	}

	public double getValorVenda() {
		return valorVenda;
	}

	public void setValorVenda(double valorVenda) {
		this.valorVenda = valorVenda;
	}

	public double getComissao() {
		return comissao;
	}

	public void setComissao(double comissao) {
		this.comissao = comissao;
	}	
}
