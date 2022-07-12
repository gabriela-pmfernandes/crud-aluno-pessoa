
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
				
			}else{
				Menu.cadastroAluno();
			}
			
			int identificacao = entrada.nextInt();
			if(identificacao == 1) {
					alunoService.cadastrarAluno();
				int opcaoEscolhidaAluno = entrada.nextInt();
				
				
			}else if(identificacao == 2) {
				
			}else if(identificacao == 0) {
				continua = false;
			}
		}while(continua);
	}
}
