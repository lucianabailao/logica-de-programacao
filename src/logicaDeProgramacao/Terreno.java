package logicaDeProgramacao;

import java.util.Scanner;

public class Terreno {

	public static void main(String[] args) {
		float base;
		float altura;
		Scanner input = new Scanner(System.in);
		System.out.println("Bem vindo ao Programa");
		System.out.println("Digite a base do terreno");
		base = input.nextFloat();
		System.out.println("Digite a altura do terreno");
		altura = input.nextFloat();
		if (base * altura > 100) {
			System.out.println("Terreno grande!");
		} else {
			System.out.println("Terreno pequeno!");

		}
		input.close();
	}
}