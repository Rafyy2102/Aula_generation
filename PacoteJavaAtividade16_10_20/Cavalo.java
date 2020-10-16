package PacoteJavaAtividade16_10_20;

public class Cavalo extends Animal{
	private String cavalo;
	
	
	public Cavalo(String nome, int idade, String corre, String cava,String som)
	{
		super (nome, idade, corre, som);
		this.cavalo = cava;
	}	

	public String getCavalo() {
		return cavalo;
	}

	public void setCavalo(String cavalo) {
		this.cavalo = cavalo;
	}

	public String getSom()
	{
		return "Som do animal "+this.getCavalo() +" IHIHIHIHI"+super.getSom();
	}
}
