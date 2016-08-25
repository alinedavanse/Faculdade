package br.trainee.aline.faculdade;

public class EmpregadoDaFaculdade {

	private String nome;
	private double salario;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	double getGastos() {
		return this.salario;
	}

	String getInfo() {
		return "\nNome: " + this.nome + "\nSalário: " + this.salario;
	}
}
