package logicaDeProgramacao;

import java.util.Scanner;

public class CadastraProfessor {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		String cidade, nome, telefone, cep;
		int numerodeprofessores;
		numerodeprofessores = 0;
		while (numerodeprofessores < 5) {
			numerodeprofessores = numerodeprofessores + 1;
			
			System.out.println("Bem Vindo ao Cadastro dos 5 Professores");
			
			System.out.println("Digite nome");
			nome = input.next();
			
			System.out.println("Digite o cep");
			cep = input.next();
			
			System.out.println("Digite o telefone");
			telefone = input.next();
			
			System.out.println("Digite a cidade");
			cidade = input.next();
		}
		System.out.println("Cadastro Concluido");
	}

}