
import java.util.Scanner;

import service.AlunoService;
import util.Menu;

public class Principal {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		AlunoService alunoService = new AlunoService(entrada);
		boolean continua = true;
		do {
			Menu.bemVindo();
			Menu.selecionar();
			String verificacao = entrada.next();
			
			if(verificacao.equals("não")) {
				Menu.cadastroPessoa();
				//int identificacao = entrada.nextInt();
				//if(identificacao == 1) {
					//alunoService.cadastrarAluno();
				//}else if(identificacao == 2) {
					//alunoService.mostrarTodos();
				//}else if(identificacao == 0) {
						//continua = false;
				//}
			}else{
				boolean continuaCadastro = true;
				
					Menu.cadastroAluno();
					do {
					int opcaoEscolhidaAluno = entrada.nextInt();
					if(opcaoEscolhidaAluno == 1) {
						alunoService.cadastrarAluno();
						Menu.cadastroAluno();
					}else if(opcaoEscolhidaAluno == 2) {
						alunoService.mostrarTodos();
					}else if(opcaoEscolhidaAluno == 3) {
						entrada.nextLine();
						System.out.println("Escolha o id do aluno que você quer atualizar: ");
						alunoService.mostrarTodos();
						int idAlunoEscolhido = entrada.nextInt();
						alunoService.atualizarAluno(idAlunoEscolhido);
						//alunoService.excluirDadosAluno(idAlunoEscolhido);
						alunoService.cadastrarAluno();
						Menu.cadastroAluno();
					}else if(opcaoEscolhidaAluno == 4) {
						entrada.nextLine();
						System.out.println("Escolha id do aluno que você quer excluir os dados: ");
						alunoService.mostrarTodos();
						int idAlunoExcluir = entrada.nextInt();
						alunoService.excluirDadosAluno(idAlunoExcluir);
						Menu.cadastroAluno();
					}else if(opcaoEscolhidaAluno == 0) {
						continuaCadastro = false;
					}
				}while(continuaCadastro);
			}	
			
		}while(continua);
		alunoService.mostrarTodos();
	}
}
