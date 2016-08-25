package br.trainee.aline.teste;

import br.trainee.aline.faculdade.EmpregadoDaFaculdade;
import br.trainee.aline.faculdade.GeradorDeRelatorio;
import br.trainee.aline.faculdade.ProfessorDaFaculdade;

public class TesteFaculdade {

	public static void main(String[] args) {

		GeradorDeRelatorio gerador = new GeradorDeRelatorio();
		EmpregadoDaFaculdade empregado1 = new EmpregadoDaFaculdade();
		ProfessorDaFaculdade empregado2 = new ProfessorDaFaculdade();

		empregado1.setNome("Aline");
		empregado1.setSalario(5000.0);

		empregado2.setNome("Laís");
		empregado2.setSalario(1000.0);
		empregado2.setHorasDeAula(2);

		gerador.adiciona(empregado1);
		gerador.adiciona(empregado2);
		System.out.println("Novo salário do professor: " +empregado2.getGastos());

	}

}
