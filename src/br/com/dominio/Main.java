package br.com.dominio;

import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {
		Curso curso1 = new Curso();
		Curso curso2 = new Curso();
		Mentoria mentoria = new Mentoria();
		Bootcamp bootcamp = new Bootcamp();
		Dev dev1 = new Dev();
		Dev dev2 = new Dev();
		
		curso1.setTitulo(" curso java");
		curso1.setDescricao(" descrição curso java");
		curso1.setCargaHoraria(8);
				
		curso2.setTitulo(" curso javascript");
		curso2.setDescricao(" descrição curso javascript");
		curso2.setCargaHoraria(8);
		
		mentoria.setTitulo(" mentoria");
		mentoria.setDescricao(" descrição mentoria");
		mentoria.setData(LocalDate.now());
		
		bootcamp.setNome("Bootcamp Java Develop");
		bootcamp.setDescricao("Descrição Bootcamp Java Develop");
		bootcamp.getConteudos().add(curso1);
		bootcamp.getConteudos().add(curso2);
		bootcamp.getConteudos().add(mentoria);
		
		dev1.setNome("Camila");
		dev1.inscrever(bootcamp);
		
		dev2.setNome("João");
		dev2.inscrever(bootcamp);
		
		System.out.println("Conteúdos Inscritos de Camila:"+dev1.getConteudosInscritos()+"\nConteúdos Inscritos de João:"+dev2.getConteudosInscritos());
		System.out.println("-");
		dev1.progredir();
		dev2.progredir();
		System.out.println("Conteúdos Concluídos de Camila:"+dev1.getConteudosConcluidos()+"\nConteúdos Concluídos de João:"+dev2.getConteudosConcluidos());
		System.out.println("XP de Camila: "+ dev1.calcularTotalXp()+"\nXP de João: "+dev2.calcularTotalXp());
	}

}
