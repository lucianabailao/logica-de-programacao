package logicaDeProgramacao;

import java.util.Scanner;

public class Cadastro {

public static void main(String[] args) {

Scanner input = new Scanner(System.in);
String nome,endereco, email ;
int telefone;


System.out.print("Bem Vindo, faremos seu cadastro!");
System.out.println("Digite seu nome: ");
  nome = input.next();
System.out.println("Digite seu endere�o.");
  endereco = input.next();
System.out.println("Digite seu email.");
  email = input.next();
System.out.println("Digite seu telefone");
  telefone = input.nextInt();
System.out.println("Ol�, confira seus dados  " + nome
+ " seu endere�o: " + endereco +" "+ email + String.valueOf(telefone));
System.out.println("Cadastro realizado com sucesso!");
}
 
}