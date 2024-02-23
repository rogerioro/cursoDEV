import java.util.Scanner;

public class Main {
    public static void main(String[] args){
    Scanner scanner = new Scanner (System.in);
    //declaração de variáveis
    double num1 = 0, num2 = 0, num3 = 0, nota1 = 0, nota2 = 0, nota3 = 0, cm = 0;
    int ano = 1992;
    
    
        //coleta de valores para as variáveis
        System.out.printf("Digite o primeiro número: %n");
        num1 = scanner.nextInt();
        
        System.out.println("Digite o segundo número número:");
        num2 = scanner.nextInt();
        
        //trabalhando as váriaveis num1, num2 e num3
        double soma = num1 + num2;
        System.out.println("A soma dos valores é " + soma);
        
        double subtracao = num1 - num2;
        System.out.println("A subtração entre os números é " + subtracao);
        
        double mult = num1 * num2;
        System.out.println("A multiplicação entre os números é " + mult);
        
        double divisao = num1/num2;
        System.out.printf("A Divisão entre os números é = %.2f%n", divisao);
        
        double sobradivisao = num1 % num2;
        System.out.println("A Sobra da divisão entre os números é " + sobradivisao);
        
        System.out.printf ("Digite mais um número: %n");
        num3 = scanner.nextInt();
        
        double x = ((num1 + num2) * num3);//resolvendo a expressão a+b*x
        System.out.println("Levando em consideração os números digitados, vamos fazer a seguinte equação (A + B * C) onde A é o primeiro número digitado, B o segundo e C o terceiro");
        System.out.println("O resultado da equação é "+ x);
        
        double media = ((num1 + num2 + num3)/3);
        System.out.printf("A média entre os três número é %.2f%n", media);
        
        System.out.println("######################################");
        System.out.println("Vamos calcular notas, digite a primeira nota:");
        nota1 = scanner.nextInt();
        
        System.out.println("Digite a segunda nota:");
        nota2 = scanner.nextInt();
        
        System.out.println("Digite a terceira nota:");
        nota3 = scanner.nextInt();
        
        double medianotas = ((nota1 + nota2 + nota3)/3);
        System.out.printf("A média das notas é %.2f%n ", medianotas);
        
        System.out.println("######################################");
        System.out.printf("Este programa também converte medidas, digite aluns centímetros e vamos te mostrar o valor em quilômetros:%n");
        cm = scanner.nextInt();
        
        double km = cm/100000;
        
        System.out.printf("Isto equivale à %.5f quilômetros%n", km);
        
        System.out.println("######################################");
        System.out.printf("Eu nasci no ano de 1992, abaixo alguns resultados %n");
        System.out.println("O ano seguinte é " + (++ano));
        ano = 1992;
        System.out.println("O ano anterior é " + (--ano));
        
        System.out.println("######################################");
        System.out.println("Digite mais um número: ");
        int num4 = scanner.nextInt();
        
        int quadrado = num4*num4;
        int cubo = num4*num4*num4;
        
        System.out.printf("O quadrado do valor digitado é %d e o cubo é %d .%n", quadrado, cubo);
        
        
        System.out.println("######################################");
        System.out.println("Digamos que você irá fazer uma viagem, vamos calcular o tempo que ela levará!");
        System.out.println("Por favor, digite a distância em KM:");
        double distacia = scanner.nextInt();
        
        System.out.println("Digite a velocidade média da viagem em Km/h:");
        double velcmedia = scanner.nextInt();
        
        double tempo = distacia/velcmedia;
        
        System.out.printf("O tempo de viagem será de %.2f Horas!%n",tempo);
        
        System.out.println("######################################");
        System.out.println("Agora vamos resolver equacoes do segundo grau. 'x =ax²+bx+c' ");
        System.out.println("Digite o Valor de A:");
        double valora = scanner.nextInt();
        
        System.out.println("Digite o Valor de B:");
        double valorb = scanner.nextInt();
        
        System.out.println("Digite o Valor de C:");
        double valorc = scanner.nextInt();
        
        if (valora != 0){
            double delta = (valorb*valorb) - (4*valora*valorc);
            double raizdelta = Math.sqrt(delta);
            
            if (delta >= 0){
                double raiz1 = (-valorb + raizdelta)/(2*valora);
                double raiz2 = (-valorb - raizdelta)/(2*valora);
                System.out.printf("Os valores da equacao são %.2f e %2f%n", raiz1, raiz2);
            }else{
                delta = -delta;
                raizdelta = Math.sqrt(delta);
                System.out.printf("A primeira raíz da equacao e %.2f, e + %.2f%n", (-valorb)/(2*valora), raizdelta/(2*valora));
                System.out.printf("A segunda raíz da equacao e %.2f, e - %.2f%n", (-valorb)/(2*valora), raizdelta/(2*valora));
            }
            
            
        }else{
            System.out.println("Valor de A inválido");
            }
    }
    
}

