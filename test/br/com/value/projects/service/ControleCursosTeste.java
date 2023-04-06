package br.com.value.projects.service;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import br.com.value.projects.dominio.Curso;
import br.com.value.projects.builder.ControleCursos;
import br.com.value.projects.dominio.Aluno;

public class ControleCursosTeste {
	ControleCursos controle = new ControleCursos();
	
	@Test
	public void matriculaStatusAtivo() {
		Aluno aluno = new Aluno("Margarida");

		aluno.CursosLiberados(new Curso("Curso Básico I"));
		aluno.CursosLiberados(new Curso("Curso Básico II"));

		assertEquals(2, aluno.getCursosLiberados().size());
	}

	@Test
	public void cursoFinalizadoAcimaMedia() {
		Aluno aluno = new Aluno("Margarida");
		Curso cursoPrincipal = new Curso("Curso Básico I", 8.7);

		aluno.CursosLiberados(cursoPrincipal);
		controle.verificaCurso(aluno, cursoPrincipal); // Como está acima da média 7, libera mais 3 cursos

		assertEquals(4, aluno.getCursosLiberados().size());
	}

	@Test
	public void cursoFinalizadoAbaixoMedia() {
		Aluno aluno = new Aluno("Margarida");
		Curso cursoPrincipal = new Curso("Curso Básico I", 5.7);

		aluno.CursosLiberados(cursoPrincipal);
		controle.verificaCurso(aluno, cursoPrincipal); // Como está abaixo da média 7, não libera mais 3 cursos

		assertEquals(1, aluno.getCursosLiberados().size());
	}

}