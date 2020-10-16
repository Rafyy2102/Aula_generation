package PacoteJavaAtividade16_10_20;

public class Cachorro extends Animal{
	private String cao;

	public Cachorro(String nome, int idade, String correr, String som, String cachorro)
	{
		super(nome, idade, correr, som);
		this.cao = cachorro;
	}
	
	public String getCao() {
		return cao;
	}

	public void setCao(String cao) {
		this.cao = cao;
	}

	public String getSom()
	{
		return "Som do animal "+this.getCao() +" AU AU AU AU"+super.getSom();
	}
}