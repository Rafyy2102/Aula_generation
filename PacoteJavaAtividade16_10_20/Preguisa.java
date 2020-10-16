package PacoteJavaAtividade16_10_20;

public class Preguisa extends Animal{
	private String preguica;
		
	
	public Preguisa (String nome, int idade, String corre, String pregui, String som)
	{
		super (nome, idade, corre, som);
		this.preguica = pregui;
				
	}	
	
	public String getPreguica() {
		return preguica;
	}

	public void setPreguica(String preguica) {
		this.preguica = preguica;
	}

	public String getSom()
	{
		return "Som do animal "+this.getPreguica() +" EHUMEHUMEHUM"+super.getSom();
	}
}
