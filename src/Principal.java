
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
			
			if(verificacao.equals("n�o")) {
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
				
					
					do {
						Menu.cadastroAluno();
					int opcaoEscolhidaAluno = entrada.nextInt();
					if(opcaoEscolhidaAluno == 1) {
						alunoService.cadastrarAluno();
						//Menu.cadastroAluno();
					}else if(opcaoEscolhidaAluno == 2) {
						alunoService.mostrarTodos();
						//Menu.cadastroAluno();
					}else if(opcaoEscolhidaAluno == 3) {
						entrada.nextLine();
						System.out.println("Escolha o n�mero de refer�ncia do aluno que voc� quer atualizar: ");
						alunoService.mostrarTodos();
						int referenciaAlunoEscolhido = entrada.nextInt();
						alunoService.atualizarAluno(referenciaAlunoEscolhido);
						//Menu.cadastroAluno();
					}else if(opcaoEscolhidaAluno == 4) {
						entrada.nextLine();
						System.out.println("Escolha o n�mero de refer�ncia do aluno que voc� quer excluir os dados: ");
						alunoService.mostrarTodos();
						int referenciaAlunoExcluir = entrada.nextInt();
						alunoService.excluirDadosAluno(referenciaAlunoExcluir);
						//Menu.cadastroAluno();
					}else if(opcaoEscolhidaAluno == 0) {
						continuaCadastro = false;
					}
				}while(continuaCadastro);
			}	
			
		}while(continua);
		alunoService.mostrarTodos();
	}
}
