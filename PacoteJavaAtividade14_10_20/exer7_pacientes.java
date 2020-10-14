/*7) Crie uma classe paciente e apresente os atributos e métodos referentes
esta classe, em seguida crie um objeto paciente, defina as instancias deste
objeto e apresente as informações deste objeto no console.*/
package PacoteJavaAtividade14_10_20;

public class exer7_pacientes {

	private String nome;
	private String idade;
	private String medico;
	
	public exer7_pacientes(String  nomes, String idades, String medicos)
	{
		nome = nomes;
		idade = idades;
		medico = medicos;
	}
	public String getpaciente()
	{
		String Pacientes =  nome + ", "+" "+idade+ ", "+medico;
		return Pacientes;
	}

}
