/*3) Crie uma classe produto eletr�nico e apresente os atributos e m�todos
referentes esta classe, em seguida crie um objeto produto eletr�nico,
defina as instancias deste objeto e apresente as informa��es deste objeto
no console.*/
package PacoteJavaAtividade14_10_20;

public class Eletronico_produto {

	public static void main(String[] args)
	{
		exer3_Produto produto = new exer3_Produto("Samsung", "Macbook", "Xaiome");
		System.out.println(produto.getProduto());
	}
}
