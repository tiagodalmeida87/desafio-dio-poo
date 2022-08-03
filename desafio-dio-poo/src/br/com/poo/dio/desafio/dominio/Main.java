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

		/*System.out.println(curso1);
		System.out.println(curso2);
		System.out.println(mentoria);*/
		
		Bootcamp bootcamp = new Bootcamp();
		bootcamp.setNome("Bootcamp Java Spring");
		bootcamp.setDescricao("Descri��o do Bootcamp Sprin Java");
		bootcamp.getConteudos().add(curso1);
		bootcamp.getConteudos().add(curso2);
		bootcamp.getConteudos().add(mentoria);
		
		Dev devTiago = new Dev();
		devTiago.setNome("Tiago");
		devTiago.inscreverBootcamp(bootcamp);
		System.out.println("Bootcamp: " + bootcamp.getNome());
		System.out.println("Conte�dos Inscritos Tiago: " + devTiago.getConteudosInscritos());
		devTiago.progredir();
		devTiago.progredir();
		System.out.println("-");
		System.out.println("Conte�dos Inscritos Tiago: " + devTiago.getConteudosInscritos());
		System.out.println("Conte�dos Conclu�dos Tiago: " + devTiago.getConteudosConcluidos());
		System.out.println("XP: " + devTiago.calcularTotalXp());
		
		System.out.println();
		System.out.println("-----------");
		System.out.println();
		
		Dev devDavi = new Dev();
		devDavi.setNome("Davi");
		devDavi.inscreverBootcamp(bootcamp);
		System.out.println("Conteudos Inscritos Davi: " + devDavi.getConteudosInscritos());
		devDavi.progredir();
		System.out.println("-");
		System.out.println("Conte�dos Inscritos Davi: " + devDavi.getConteudosInscritos());
		System.out.println("Conte�dos Conclu�dos Davi: " + devDavi.getConteudosConcluidos());
		System.out.println("XP: " + devDavi.calcularTotalXp());
	}

}
