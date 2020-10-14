/*3) Crie uma classe produto eletrônico e apresente os atributos e métodos
referentes esta classe, em seguida crie um objeto produto eletrônico,
defina as instancias deste objeto e apresente as informações deste objeto
no console.*/
package PacoteJavaAtividade14_10_20;

public class Eletronico_produto {

	public static void main(String[] args)
	{
		exer3_Produto produto = new exer3_Produto("Samsung", "Macbook", "Xaiome");
		System.out.println(produto.getProduto());
	}
}
