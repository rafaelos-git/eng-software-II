package br.com.value.projects.builder;

import br.com.value.projects.dominio.Aluno;
import br.com.value.projects.dominio.Curso;

public class ControleCursos {
    public void verificaCurso(Aluno aluno, Curso cursoTerminado) {
        boolean cursoValidado = false;
		for (Curso curso : aluno.getCursos()) {
			if (curso.getNome() == cursoTerminado.getNome()) {
                if (curso.getMedia() >= 7) {
				    cursoValidado = true;
                }
                curso.finalizarCurso();
			}
		}

        if (cursoValidado) {
			aluno.CursosLiberados(new Curso(cursoTerminado.getNome() + " - " + "Complementar I"));
			aluno.CursosLiberados(new Curso(cursoTerminado.getNome() + " - " + "Complementar II"));
            aluno.CursosLiberados(new Curso(cursoTerminado.getNome() + " - " + "Complementar III"));
		}
    }
}
