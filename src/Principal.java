
import java.util.Scanner;

import model.Pessoa;
import service.AlunoService;
import service.PessoaService;
import util.Menu;

public class Principal {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		AlunoService alunoService = new AlunoService(entrada);
		PessoaService pessoaService = new PessoaService(entrada);
		boolean continua = true;
		do {
			Menu.bemVindo();
			Menu.selecionar();
			String verificacao = entrada.next();
			verificacao = verificacao.toLowerCase();
			verificacao = verificacao.replace("ã", "a");
			System.out.println(verificacao);
			if(verificacao.equals("n")|| verificacao.equals("nao") || verificacao.equals("NÃO") || verificacao.equals("NAO")) {
				Menu.cadastroPessoa();
				int opcaoEscolhidaPessoa = entrada.nextInt();
				if(opcaoEscolhidaPessoa == 1) {
					pessoaService.cadastrarPessoa();
					Menu.cadastroPessoa();
				}else if(opcaoEscolhidaPessoa == 2) {
					pessoaService.mostrarTodos();
					Menu.cadastroPessoa();
				}else if(opcaoEscolhidaPessoa == 3) {
					entrada.nextLine();
					System.out.println("Escolha o número de referência da pessoa que você quer atualizar: ");
					pessoaService.mostrarTodos();
					int referenciaPessoaEscolhida = entrada.nextInt();
					pessoaService.atualizarPessoa(referenciaPessoaEscolhida);
					Menu.cadastroPessoa();
				}else if(opcaoEscolhidaPessoa == 4) {
					entrada.nextLine();
					System.out.println("Escolha o número de referência da pessoa que você quer excluir os dados: ");
					pessoaService.mostrarTodos();
					int referenciaPessoaExcluir = entrada.nextInt();
					pessoaService.excluirDadosPessoa(referenciaPessoaExcluir);
					Menu.cadastroPessoa();
				}else if(opcaoEscolhidaPessoa == 0) {
						continua = false;
				}
			}else{
				Menu.cadastroAluno();
				do {
					int opcaoEscolhidaAluno = entrada.nextInt();
					if(opcaoEscolhidaAluno == 1) {
						alunoService.cadastrarAluno();
						Menu.cadastroAluno();
					}else if(opcaoEscolhidaAluno == 2) {
						alunoService.mostrarTodos();
						Menu.cadastroAluno();
					}else if(opcaoEscolhidaAluno == 3) {
						entrada.nextLine();
						System.out.println("Escolha o número de referência do aluno que você quer atualizar: ");
						alunoService.mostrarTodos();
						int referenciaAlunoEscolhido = entrada.nextInt();
						alunoService.atualizarAluno(referenciaAlunoEscolhido);
						Menu.cadastroAluno();
					}else if(opcaoEscolhidaAluno == 4) {
						entrada.nextLine();
						System.out.println("Escolha o número de referência do aluno que você quer excluir os dados: ");
						alunoService.mostrarTodos();
						int referenciaAlunoExcluir = entrada.nextInt();
						alunoService.excluirDadosAluno(referenciaAlunoExcluir);
						Menu.cadastroAluno();
					}else if(opcaoEscolhidaAluno == 0) {
						continua = false;
					}
				}while(continua);
			}	
			
		}while(continua);
		alunoService.mostrarTodos();
		pessoaService.mostrarTodos();
	}
}
