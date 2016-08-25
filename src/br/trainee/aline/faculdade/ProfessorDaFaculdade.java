package br.trainee.aline.faculdade;

public class ProfessorDaFaculdade extends EmpregadoDaFaculdade {

	private int horasDeAula;

	public int getHorasDeAula() {
		return horasDeAula;
	}

	public void setHorasDeAula(int horasDeAula) {
		this.horasDeAula = horasDeAula;
	}

	public double getGastos() {
		return this.getSalario() + this.horasDeAula * 10;
	}

	// A palavra chave super, apesar do método ter sido reescrito, gostaríamos
	// de acessar o
	// método da classe mãe, para não ter de copiar e colocar o conteúdo desse
	// método e depois concatenar com a
	// informação das horas de aula.
    String getInfo() {
		String informacaoBasica = super.getInfo();
		String informacao = informacaoBasica + "\nHoras trabalhadas: " + this.horasDeAula;
		return informacao;
	}

}
