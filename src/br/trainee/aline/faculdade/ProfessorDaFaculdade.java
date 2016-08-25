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

	// A palavra chave super, apesar do m�todo ter sido reescrito, gostar�amos
	// de acessar o
	// m�todo da classe m�e, para n�o ter de copiar e colocar o conte�do desse
	// m�todo e depois concatenar com a
	// informa��o das horas de aula.
    String getInfo() {
		String informacaoBasica = super.getInfo();
		String informacao = informacaoBasica + "\nHoras trabalhadas: " + this.horasDeAula;
		return informacao;
	}

}
