package logicaDeProgramacao;

import java.util.Scanner;

public class IsPar {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num;
		System.out.println("Digite um numero");
		num = input.nextInt();
		if (num % 2 == 0) {
			System.out.println(num + "é par");
		} else {
			System.out.println(num + "é impar");

		}
	}

}