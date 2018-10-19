package entities;

public class Funcionario implements Comparable<Funcionario> {
	
	private String nome;
	private Double salario;
	
	public Funcionario(String nome, Double salario) {
		this.nome = nome;
		this.salario = salario;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getSalario() {
		return salario;
	}

	public void setSalario(Double salario) {
		this.salario = salario;
	}

	@Override
	public int compareTo(Funcionario func) {//Compara��o e ordena��o de objetos por nome
		
		//return nome.compareTo(func.getNome());
		
		//se quiser comparar por sal�rio ordem CRESCENTE
		//return salario.compareTo(func.getSalario());
		
		//se quiser comparar por sal�rio ordem DECRESCENTE
		return -salario.compareTo(func.getSalario());
		
	}
	
	
	
	
	

}
