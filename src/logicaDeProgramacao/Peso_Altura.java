package logicaDeProgramacao;

import java.util.Scanner;

public class Peso_Altura {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		float resultado, altura, peso;
		System.out.println("Digite o peso");
		peso = input.nextFloat();
		System.out.println("Digite a altura");
		altura = input.nextFloat();
		resultado = peso / (altura * altura);
		if (resultado < 20) {
			System.out.println(resultado + "Abaixo do peso");
		} else if (resultado < 25) {
			System.out.println(resultado + "Peso ideal");
		} else {
			System.out.println(resultado + "Acima do peso");
		}
		input.close();
		}
}