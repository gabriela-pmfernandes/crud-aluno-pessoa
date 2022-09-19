package service;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Scanner;

import model.Pessoa;
import util.Menu;
import util.NormalizaData;

public class PessoaService {
	Scanner entrada;
	public PessoaService(Scanner entrada) {
		this.entrada = entrada;
	}
	ArrayList<Pessoa> pessoas = new ArrayList<>();
	
	public void cadastrarPessoa() {
		entrada.nextLine();
		
		System.out.println("Digite o nome da pessoa: ");
		String nome = entrada.nextLine();
		System.out.println("Digite o telefone da pessoa: ");
		String telefone = entrada.nextLine();
		System.out.println("Digite o dia de nascimento da pessoa: ");
		int diaNascimento = entrada.nextInt();
		System.out.println("Digite o mês de nascimento da pessoa: ");
		int mesNascimento = entrada.nextInt();
		System.out.println("Digite o ano de nascimento da pessoa: ");
		int anoNascimento = entrada.nextInt();
		Pessoa pessoa = new Pessoa(nome, telefone, diaNascimento, mesNascimento, anoNascimento);
		pessoa.getId();
		pessoa.getNome();
		pessoa.getTelefone();
		pessoa.getDiaNascimento();
		pessoa.getMesNascimento();
		pessoa.getAnoNascimento();
		pessoa.getData();
		
		pessoas.add(pessoa);
	}
	public void mostrarTodos() {
		System.out.println("************ PESSOAS CADASTRADAS ************");
		for(int listaDePessoas = 0; listaDePessoas < pessoas.size(); listaDePessoas++) {
			Pessoa listaPessoa = pessoas.get(listaDePessoas);
			System.out.println("Referência: " + "[" + listaDePessoas + "] " + listaPessoa);
		}
	}
	
	public void atualizarPessoa(int referencia) {
		for(int pessoaAtualizacao = 0; pessoaAtualizacao < pessoas.size(); pessoaAtualizacao++) {
			Pessoa listaPessoa = pessoas.get(pessoaAtualizacao);
		}
		pessoas.remove(referencia);
		cadastrarPessoa();
		System.out.println("Data da última atualização: " + NormalizaData.formata(LocalDateTime.now()));
	}
	
	public void excluirDadosPessoa(int referencia) {
		for(int pessoaExcluir = 0; pessoaExcluir < pessoas.size(); pessoaExcluir++) {	
		}
		pessoas.remove(referencia);
	}
}
