package br.com.value.projects.dominio;

import java.util.ArrayList;
import java.util.List;

public class Aluno {
	private String nome;
	private List<Curso> cursos;


	public Aluno(String nome) {
		this.nome = nome;
		this.cursos = new ArrayList<Curso>();
	}

	public String getNome() {
		return nome;
	}

	public List<Curso> getCursos() {
		return cursos;
	}

	public void CursosLiberados(Curso curso) {
		if (cursos.isEmpty() || !cursos.get(ultimoCursoVisto()).getNome().equals(curso.getNome())) {
			this.cursos.add(curso);
		}
	}

	public int ultimoCursoVisto() {
		return cursos.size()-1;
	}

	public List<Curso> getCursosLiberados() {
		return cursos;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Aluno other = (Aluno) obj;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		if (cursos == null) {
			if (other.cursos != null)
				return false;
		} else if (!cursos.equals(other.cursos))
			return false;
		return true;
	}
}
