package logicaDeProgramacao;

import java.util.Scanner;

public class Calculo {

public static void main(String[] args) {
Scanner input = new Scanner (System.in);
Integer num1;
Integer num2;
Integer resto, divisao;

System.out.println("Bem Vindo ao programa, digite o primeiro número");
 num1 = input.nextInt();
System.out.println("Digite o segundo número");
 num2 = input.nextInt();
 resto = num1 % num2;
 divisao = num1 /num2; 
 System.out.print("A divisão, :" + divisao);
 System.out.println("O resto é, :" + resto.toString());

}

}