package oo.composicao;

import java.util.ArrayList;
import java.util.List;

public class Aluno {
	
	final String nome;
	final List<Curso> cursos = new ArrayList<>();
	
	//Construtor
	Aluno(String nome){
		this.nome = nome;
	}
	
	void addCurso(Curso curso){
		//pra curso eu adiciono este Curso
		this.cursos.add(curso);
		//e no curso eu adiciono este Aluno
		curso.alunos.add(this);
	}
	public String toString() {
		return nome;
	}
	
	Curso setCursoPorNome(String nome) {
		for(Curso curso: this.cursos) {
			if(curso.nome.equalsIgnoreCase(nome));
				return curso;
		}
		return null;			
	}
	

}
