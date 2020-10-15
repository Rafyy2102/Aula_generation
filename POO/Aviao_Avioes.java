/*2) Crie uma classe avião e apresente os atributos e métodos referentes
esta classe, em seguida crie um objeto avião, defina as instancias deste
objeto e apresente as informações deste objeto no console.*/
package PacoteJavaAtividade14_10_20;

public class Aviao_Avioes {
	public static void main (String ars[])
	{		
		exer2_Aviao aviao = new exer2_Aviao();
		aviao.cor = "Branco";
		aviao.modelo = "TurboFan";
		aviao.veloAtua = 0;
		aviao.veloMax = 80;		
		aviao.vou();		
		aviao.ateriza(20);			
		System.out.println(aviao.veloAtua);
		aviao.descer_rodas();		
	}
}
