package service;


import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Scanner;

import model.Aluno;
import util.Contador;
import util.NormalizaData;


public class AlunoService {
	Scanner entrada;
	public AlunoService(Scanner entrada) {
		this.entrada = entrada;
	}
	ArrayList<Aluno> alunos = new ArrayList<>();
	
	public void cadastrarAluno() {
		entrada.nextLine();
		
		System.out.println("Digite o nome do aluno: ");
		String nome = entrada.nextLine();
		System.out.println("Digite o telefone do aluno: ");
		String telefone = entrada.nextLine();
		System.out.println("Digite o dia de nascimento do aluno: ");
		int diaNascimento = entrada.nextInt();
		System.out.println("Digite o mês de nascimento do aluno: ");
		int mesNascimento = entrada.nextInt();
		System.out.println("Digite o ano de nascimento do aluno: ");
		int anoNascimento = entrada.nextInt();
		System.out.println("Digite a nota final do curso: ");
		Double notaFinalCurso = entrada.nextDouble();
		Aluno aluno = new Aluno(nome, telefone, diaNascimento, mesNascimento, anoNascimento, notaFinalCurso, LocalDateTime.now());
		aluno.getId();
		aluno.getNome();
		aluno.getTelefone();
		aluno.getDiaNascimento();
		aluno.getMesNascimento();
		aluno.getAnoNascimento();
		aluno.getNotaFinalCurso();
		aluno.getData();
		
		alunos.add(aluno);
	}
	
	public void mostrarTodos() {
		System.out.println("************ ALUNOS CADASTRADOS ************");
		for(int listaDeAlunos = 0; listaDeAlunos < alunos.size(); listaDeAlunos++) {
			Aluno listaAluno = alunos.get(listaDeAlunos);
			System.out.println("Referência: " + "["+ listaDeAlunos + "] " + listaAluno);	
		}
	}
	
	public void atualizarAluno(int referencia) {
		for(int alunoAtualizacao = 0; alunoAtualizacao < alunos.size(); alunoAtualizacao++) {
			Aluno listaAluno = alunos.get(alunoAtualizacao);
		}
		alunos.remove(referencia);
		cadastrarAluno();
		System.out.println("Data da última atualização: " + NormalizaData.formata(LocalDateTime.now()));
	}
	public void excluirDadosAluno(int referencia) {
		for(int alunoExcluir = 0; alunoExcluir < alunos.size(); alunoExcluir++) { 
		}	
		alunos.remove(referencia);
	}
}
