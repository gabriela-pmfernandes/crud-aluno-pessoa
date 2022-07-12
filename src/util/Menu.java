package util;

import java.util.Scanner;

public class Menu {
	public static void bemVindo(){
		System.out.println("*********************************");
		System.out.println("Bem Vindo ao Sistema de Cadastro!");
		System.out.println("*********************************");
	}
	
	public static void selecionar() {
		System.out.println("Você é aluno?");
		System.out.println("Se sim, digite sua nota final");
		System.out.println("Se não, digite não");
		System.out.println("0 - Sair do sistema");
	}
	
	
	public static void cadastroPessoa() {
		System.out.println();
		System.out.println("Digite uma opção: ");
		System.out.println("1 - Cadastrar uma pessoa");
		System.out.println("2 - Mostrar pessoas cadastradas");
		System.out.println("3 - Atualizar dados de uma pessoa");
		System.out.println("4 - Excluir uma pessoa");
	}
	
	public static void cadastroAluno() {
		System.out.println();
		System.out.println("Digite uma opção");
		System.out.println("1 - Cadastrar um aluno");
		System.out.println("2 - Mostrar alunos cadastrados");
		System.out.println("3 - Atualizar dados de um aluno");
		System.out.println("4 - Excluir um aluno");
	}
}
