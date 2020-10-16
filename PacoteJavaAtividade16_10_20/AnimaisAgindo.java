package PacoteJavaAtividade16_10_20;

public class AnimaisAgindo {

	public static void main(String[] args) 
	{
		Cachorro cao = new Cachorro("billy" ,2, "80 km/h", "","");
		
		Cavalo cavalo = new Cavalo("Joca" ,5, "88 km/h", "","");
		
		Preguisa preguica = new Preguisa("Renren" ,10, "120 metro/h", "","");
		
		Animal[] animal = new Animal[3];
		animal[0] = cao;
		animal[1] = cavalo;
		animal[2] = preguica;
		
		for(Animal animais:animal)
		{
			System.out.println(animais.getSom());
			//System.out.println("Seu nome é: "+animais.getNome()+"\nSua idade é: "+animais.getIdade()+" anos"+"\nSua velocidade: "+animais.getCorrer()+"\n");
		}
	}
}
