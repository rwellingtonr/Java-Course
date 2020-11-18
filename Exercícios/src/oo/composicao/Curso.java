package oo.composicao;

import java.util.ArrayList;
import java.util.List;

public class Curso {
	
	//final para definir como contante o endereço de memória.
	//Embora o conteudo ser variável
	final String nome;
	final List<Aluno> alunos = new ArrayList<>();
	
	Curso(String nome){
		this.nome = nome;
	}
	
	void addAluno(Aluno aluno) {
		this.alunos.add(aluno);
		aluno.cursos.add(this);
	}

}
