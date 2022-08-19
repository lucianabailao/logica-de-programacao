package logicaDeProgramacao;

import java.util.Scanner;

public class Conversor {

public static void main(String[] args) {
Scanner input = new Scanner(System.in);

float Mi;
    System.out.println("Bem Vindo");
    System.out.println("Digite um valor para converter milhas em km");
    Mi = input.nextFloat();
    System.out.println("O resultado é: " + (Mi  * 1609)+ "Km");
    
}

}
