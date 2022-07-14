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
	ArrayList<Object> alunos = new ArrayList<>();
	
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
		
		
		alunos.add(Contador.proximoId());
		alunos.add(nome);
		alunos.add(telefone);
		alunos.add(diaNascimento);
		alunos.add(mesNascimento);
		alunos.add(anoNascimento);
		alunos.add(notaFinalCurso);
		alunos.add(NormalizaData.formata(LocalDate.now()));
	}
	
	public void mostrarTodos() {
		for(int i = 0; i < alunos.size(); i++) {
			System.out.println(alunos.get(i));
		}
		
		
	}
	
	public void atualizarAluno(int id) {
		alunos.removeAll(alunos);
		
		
	}
	public void excluirDadosAluno(int id) {
		alunos.remove(id);
	}
	
	
	
}
