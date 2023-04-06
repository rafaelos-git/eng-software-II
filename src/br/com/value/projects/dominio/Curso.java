package br.com.value.projects.dominio;

public class Curso {

	private String nome;
	private double media;
	private boolean status;

	public Curso(String nome) {
		this.nome = nome;
		this.media = 0;
		this.status = true;
	}

	public Curso(String nome, double media) {
		this.nome = nome;
		this.media = media;
		this.status = true;
	}

	public void finalizarCurso() {
		this.status = false;
	}

	public String getNome() {
		return nome;
	}

	public double getMedia() {
		return media;
	}

	public boolean isStatus() {
		return status;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Curso other = (Curso) obj;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		return true;
	}
	
}
