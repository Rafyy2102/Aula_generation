/*2) Crie uma classe avião e apresente os atributos e métodos referentes
esta classe, em seguida crie um objeto avião, defina as instancias deste
objeto e apresente as informações deste objeto no console.*/
package PacoteJavaAtividade14_10_20;

public class exer2_Aviao {
	
	String cor;
	String modelo;
	double veloAtua;
	double veloMax;
	
	void vou()
	{
		System.out.println("O avião esta voando...");
	}
	
	void ateriza(double velocidade)
	{
		double veloNova = this.veloAtua+velocidade;
		this.veloAtua = veloNova;
	}
	int descer_rodas()
	{
		if(this.veloAtua<0)
		{
			return -1;
		}
		if(this.veloAtua>=0 && this.veloAtua<10)
		{
			return 1;
		}
		if(this.veloAtua>=10 && this.veloAtua< 80)
		{
			return 2;
		}
		return 3;
	}
	
}
