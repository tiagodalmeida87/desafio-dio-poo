package br.com.poo.dio.desafio.dominio;

import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {

		Curso curso1 = new Curso();
		curso1.setTitulo("Curso JAVA");
		curso1.setDescricao("Descricao do Curso");
		curso1.setCargaHoraria(50);

		Curso curso2 = new Curso();
		curso2.setTitulo("Curso PHP");
		curso2.setDescricao("Descricao do Curso PHP");
		curso2.setCargaHoraria(20);

		Mentoria mentoria = new Mentoria();
		mentoria.setTitulo("Mentoria em JAVA");
		mentoria.setDescricao("Descricao da Mentoria");
		mentoria.setData(LocalDate.now());

		System.out.println(curso1);
		System.out.println(curso2);
		System.out.println(mentoria);

	}

}
