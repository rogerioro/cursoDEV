//programa que Lê o nome da pessoa e a idade dela e imprem
//Após isso Lê duas variáveis e soma eles

import java.util.Scanner;
import java.util.InputMismatchException;

public class Main
{
	public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        int idade = 0;
        int num1 = 0;
        int num2 = 0;
        
        System.out.println("Digite seu nome:");
            String nome = scanner.nextLine();
            
        System.out.println("Digite seu sobrenome");
            String sobrenome = scanner.nextLine();
            
        while (true) {
            try {
                    System.out.println("Digite sua idade:");
                    idade = scanner.nextInt();
                    break; //Se for um número, sai do loop
            } catch (InputMismatchException e) {
                System.out.println ("Você não digitou um número, por favor, tente novamente!");
                scanner.nextLine();
            }
        }
        System.out.printf("Seu nome é: %s %s e sua idade é idade:%d %n%n%n", nome,sobrenome, idade);
        System.out.printf("Vamos fazer contas!!!%n%n");
        while (true) {
            try {
                    
                    System.out.println("Digite o primeiro número:");
                    num1 = scanner.nextInt();
                    break; //Se for um número, sai do loop
            } catch (InputMismatchException e) {
                System.out.println ("Você não digitou um número, por favor, tente novamente!");
                scanner.nextLine();
            }
        }
        while (true) {
            try {
                    System.out.println("Digite o segundo número:");
                    num2 = scanner.nextInt();
                    break; //Se for um número, sai do loop
            } catch (InputMismatchException e) {
                System.out.println ("Você não digitou um número, por favor, tente novamente!");
                scanner.nextLine();
            }
        }
        int somadosnumeros = num1 + num2;
        System.out.println("A soma dos números digitados é:" + somadosnumeros);
        }
	}