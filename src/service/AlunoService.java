package service;


import java.time.LocalDate;
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
		Aluno aluno = new Aluno(nome, telefone, diaNascimento, mesNascimento, anoNascimento, notaFinalCurso, LocalDate.now());
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
		for(int i = 0; i < alunos.size(); i++) {
			Aluno listaAluno = alunos.get(i);
			System.out.println("Referência: " + "["+ i + "]" + listaAluno);	
		}
	}
	
	public void atualizarAluno(int id) {
		for(int i = 0; i < alunos.size(); i++) {
			
			Aluno listaAluno = alunos.get(i);
			
		}
		alunos.remove(id);
		cadastrarAluno();
		
	}
	public void excluirDadosAluno(int id) {
		for(int i = 0; i < alunos.size(); i++)
		alunos.remove(id);
	}
	
	
	
}
