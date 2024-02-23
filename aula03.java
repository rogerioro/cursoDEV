import java.util.Scanner;
//import java.util.Date;
import java.util.Calendar;

public class Main
{
  public static void main (String[]args)
  {
    Scanner sc = new Scanner (System.in);
    Scanner variavelString = new Scanner(System.in);
    int menuID;
    System.out.println("Este programa tem várias opções:");
    System.out.println("1 - Verificaçao de maioridade;");
    System.out.println("2 - Classificação de triângulos;");
    System.out.println("3 - Validar numero;");
    System.out.println("4 - Validar numero par ou impar;");
    System.out.println("5 - Login;");
    System.out.println("6 - Desconto na compra;");
    System.out.println("7 - Verificar vogal ou consoante;");
    System.out.println("8 - Converter temperaturas;");
    System.out.println("9 - Verificar ano bisexto;");
    System.out.println("10 - Aprovação em disciplina;");
    System.out.println("11 - Calcular o preço final das maças;");
    System.out.println("12 - Distinguir tipo de polígono;");
    System.out.println("13 - Validar se é um polígono ou não;");
    System.out.println("Escolha sua opção:");
    menuID = sc.nextInt();
    while ((menuID > 13) || menuID < 1){
        System.out.println("Você digitou um número inválido, tente novamente:");
        menuID = sc.nextInt();
    }
    
    //PROGRAMA 1 - validar maioridade da pessoa
    if(menuID == 1){
	System.out.print("Este programa so e permitido para maiores de idade, por favor, digite o ano que voce nasceu:");
	int anoNascimento = sc.nextInt ();
	Calendar cal1 = Calendar.getInstance ();
	int anoAtual = cal1.get (Calendar.YEAR);
	int difAnos = anoAtual - anoNascimento;
	if (difAnos > 18){
	    System.out.println("Você pode usar este programa!1");
	    }else if (difAnos < 18){
	        System.out.println("Você não pode usar este programa!1");
	    } else if (difAnos == 18){
	    System.out.println("Digite o numero do mes que voce nasceu:");
	    int mesNascimento = sc.nextInt();
	    int mesAtual = cal1.get(Calendar.MONTH);
	    if (mesAtual > (mesNascimento - 1)){
	        System.out.println("Você pode usar este programa!2");
	    }else if (mesAtual < (mesNascimento -1)){
	       System.out.println("Você não pode usar este programa!2");
	    }else if(mesAtual == (mesNascimento - 1)){
	        System.out.println("Digite o dia que voce nasceu:");
	        int diaNascimento = sc.nextInt();
	        int diaAtual = cal1.get(Calendar.DAY_OF_MONTH);
	        if (diaAtual >= diaNascimento) {
	            System.out.println("Você pode usar este programa!3");
	        }else {
	            System.out.println("Você não pode usar este programa!");
	        } 
	    }
	  }
	}else if (menuID == 2){
	 //PROGRAMA 2 - classifica triângulos
	System.out.println("Este programa define tipos de triângulos!");
	System.out.println("Para tal, precisamos das medidas dos lados do triângulo, por favor, digite o primeiro número:");
	int lado1 = sc.nextInt();
	while (lado1 < 1){
	    System.out.printf("Você digitou um número invalido, tente novamente:%n");
	    lado1 = sc.nextInt();
	}
	System.out.printf("Agora digite o valor do segundo lado:%n");
	int lado2 = sc.nextInt();
		while (lado2 < 1){
	    System.out.printf("Você digitou um número invalido, tente novamente:%n");
	    lado2 = sc.nextInt();
	}
	System.out.printf("Agora digite o valor do segundo lado:%n");
	int lado3 = sc.nextInt();
		while (lado3 < 1){
	    System.out.printf("Você digitou um número invalido, tente novamente:%n");
	    lado3 = sc.nextInt();
	}
	if (lado1 == lado2 && lado2 == lado3){
	    System.out.println("Este é um triângulo EQUILÁTERO!");
	    }else if (lado1 != lado2 && lado2 != lado3 && lado1 != lado3){
	        System.out.println("Este é um triângulo ESCALENO!");
	    }else {
	        System.out.println("Este é um triângulo ISÓSCELES!");
	    }
	}else if (menuID == 3){
	    //PROGRAMA 3 - verifica se um número é positivo ou negativo
	 System.out.println("Digite um número qualquer:");
	 int numQualquer = sc.nextInt();
	 
	 if (numQualquer > 0 ){
	     System.out.println("Você digitou um número positivo, ele é: " + numQualquer);
	 }else if (numQualquer < 0){
	     System.out.println("Você digitou um número negativo, ele é: " + numQualquer);
	 }else{
	     System.out.println("Você digitou " + numQualquer);
	 }
	}else if (menuID == 4){
	    //PROGRAMA 4 verifica se um número é positivo ou negativo e par ou impar
	    System.out.println("Digite um número qualquer:");
	    int numQualquer2 = sc.nextInt();
	    int restoNumQualquer2 = numQualquer2 % 2;
	    if (restoNumQualquer2 == 0){
	         if (numQualquer2 > 0 ){
	     System.out.println("Você digitou um número PAR e positivo, ele é: " + numQualquer2);
	         }else if (numQualquer2 < 0){
	     System.out.println("Você digitou um número PAR e negativo, ele é: " + numQualquer2);
	         }else{
	     System.out.println("Você digitou " + numQualquer2);
	        }
	    }else {
	         if (numQualquer2 > 0 ){
	     System.out.println("Você digitou um número IMPAR e positivo, ele é: " + numQualquer2);
	         }else{
	     System.out.println("Você digitou um número IMPAR e negativo, ele é: " + numQualquer2);
	        }
	    }
	} else if (menuID == 5){
	    //PROGRAMA 5 - simula um login simples
	    //Scanner variavelString = new Scanner(System.in); //declarando outra scanner para ser usada como String
	    
	    System.out.println("Vamos logar no sistema, digite seu usuário: ");
	    String user = variavelString.nextLine();
	    
	    while (!user.equals("admin")){
	        System.out.println("Você digitou um usuario invalido, tente novamente");
	        user = variavelString.nextLine();
	    }
	    
	    System.out.println("Digete sua senha: ");
	    String senha = variavelString.nextLine();
	    
	    while (!senha.equals("senha123")){
	        System.out.println("Você digitou a senha errada, tente novamente");
	        senha = variavelString.nextLine();
	    }
	    
	    System.out.println("Você está logado, PARABÉNS!! ");
	    
	}else if (menuID ==6){
	    //PROGRAMA 6 - dá 10% de desconto em compras acima de R$100
	    
	    System.out.println("Por favor, digite o valor da sua compra: ");
	    double valorCompra = sc.nextInt();
	    
	    if (valorCompra >= 100){
	        
	        double valorDesconto = (valorCompra - ((valorCompra * 10)/100));
	        System.out.println("Boa, vc ganhou um desconto de 10%, o novo valor é R$" + valorDesconto);
	    } else{
	        System.out.println("Infelizmente você não atingiu o valor mínimo para desconto! :(");
	    }
	}else if (menuID == 7){
	    //PROGRAMA 7 - Verificar se o digitado é uma vogal ou consoante
	    
	    System.out.println("Por favor, digite uma letra qualquer:");
	    String letra = variavelString.nextLine();
	    
	    if (letra == "a" || letra == "e" || letra == "i" || letra == "o" || letra == "u"){
	        System.out.println("Você digitou uma vogal!");
	    }else {
	        System.out.println("Você digitou uma consoante!");
	    }
	}else if (menuID == 8){
	    System.out.println("Você deseja converter em qual sentido? ");
	    System.out.println("Digite 1 para converter de Celsius para Fahrenheit;");
	    System.out.println("Digite 2 para converter de Fahrenheit para Celsius;");
	    int menuConversao = sc.nextInt();
	    
	    while (menuConversao != 1 && menuConversao != 2){
	        System.out.println("Opção invalida, tente novamente:");
	        menuConversao = sc.nextInt();
	    }
	    double celsius;
	    double fahrenheit;
	    
	    if (menuConversao == 1){
	        System.out.println("Digite a temperatura em Celsius:");
	        celsius = sc.nextInt();
	        fahrenheit = (((celsius * 9)/5) +32);
	        System.out.println("A temperatura em Fahrenheit é: " + fahrenheit + "F");
	    }else {
	        System.out.println("Digite a temperatura em Fahrenheit");
	        fahrenheit = sc.nextInt();
	        celsius = (((fahrenheit - 32) * 5) / 9);
	        System.out.printf("A temperatura em Celsius é: %.4f%n C", celsius);
	    }
	}else if (menuID == 9){
	    //PROGRAMA 9 - Verificar se o ano é bisexto
	    System.out.println("Vamos verificar se o ano é bisexto ou não, por favor, digite o ano: ");
	    int anoBisexto = sc.nextInt();
	    double restoAnoBisexto = anoBisexto % 4;
	    
	    if (restoAnoBisexto == 0 ){
	        System.out.println("Este ano É bisexto!");
	    } else {
	        System.out.println("Este ano NÃO É bisexto");
	    }
	} else if (menuID == 10){
	    // PROGRAMA 10 - verificar se o aluno foi aprovado ou NÃO
	    System.out.println ("Vamos ver se vocÊ passou de ano, por favor, digite sua nota entre 0 e 10: ");
	    int notaAprovacao = sc.nextInt();
	    
	    while (notaAprovacao > 10 || notaAprovacao < 0){
	        System.out.println("Você digitou uma nota fora do range, tente novamente: ");
	        notaAprovacao = sc.nextInt();
	    }
	    
	    if (notaAprovacao >= 7){
	        System.out.println("PARABÉNS você foi aprovado!!");
	    }else {
	        System.out.println("Infelizmente foi não foi aprovado!");
	    }
	} else if (menuID == 11){
	    //PROGRAMA 11 - Calcular o preço das maças de acordo com a qtde
	    System.out.println("Digite a quantidade de maças que você comprou: ");
	    double macas = sc.nextInt();
	    
	    while (macas < 1){
	        System.out.println("Você digitou um valor invalido, tente novamente");
	        macas = sc.nextInt();
	    }
	    
	    if (macas >= 12){
	        System.out.println("Como você comprou mais de 12 maças, pagará apenas R$0,25 por cada maça.");
	        System.out.printf("O Valor final da sua compra ficou R$%.2f%n", (macas / 4));
	    }else{
	        System.out.println("Como você comprou menos de 12 maças, pagará apenas R$0,30 por cada maça.");
	        System.out.printf("O Valor final da sua compra ficou R$%.2f%n", ((macas * 3)/10));
	    }
	}else if (menuID == 12){
	    //PROGRAMA 12 - Ver a forma do polígono e calcular sua área quando possivel
	    System.out.printf("Vamos descobrir qual polígono é, o polígono tem quantos lados 3, 4 ou 5?%n");
	    int ladoPoligono = sc.nextInt();
	    
	    while (ladoPoligono > 5 || ladoPoligono < 3){
	        System.out.printf("Quantidade de lados invalida, tente novamente:%n");
	        ladoPoligono = sc.nextInt();
	    }
	    
	    if (ladoPoligono == 3){
	        System.out.printf("Digite o tamanho dos lados em cm: %n");
	        double tamanhoLadoPoligono = sc.nextInt();
	        System.out.printf("Você tem um triângulo e sua área é: %.2fcm²%n", (((tamanhoLadoPoligono * tamanhoLadoPoligono)* Math.sqrt(3)/4)));
	    }else if (ladoPoligono == 4){
	        System.out.printf("Digite o tamanho dos lados em cm: %n");
	        double tamanhoLadoPoligono = sc.nextInt();
	        System.out.printf("Você tem um quadrado e sua área é: %.2fcm²%n", (tamanhoLadoPoligono * tamanhoLadoPoligono));
	    }else{
	        System.out.printf("Você tem um Pentagono!");
	    }
	}else if (menuID == 13){
	    System.out.printf("Vamos descobrir qual polígono é, o polígono tem quantos lados 3, 4 ou 5?%n");
	    int ladoPoligono2 = sc.nextInt();
	    
	    if (ladoPoligono2 > 5){
	        System.out.printf("POLIGONO NÃO IDENTIFICADO");
	    }else if (ladoPoligono2 < 3) {
	        System.out.printf("NÃO É UM POLIGONO");
	    }else {
	        if (ladoPoligono2 == 3){
	        System.out.printf("Digite o tamanho dos lados em cm: %n");
	        double tamanhoLadoPoligono2 = sc.nextInt();
	        System.out.printf("Você tem um triângulo e sua área é: %.2fcm²%n", (((tamanhoLadoPoligono2 * tamanhoLadoPoligono2)* Math.sqrt(3)/4)));
	    }else if (ladoPoligono2 == 4){
	        System.out.printf("Digite o tamanho dos lados em cm: %n");
	        double tamanhoLadoPoligono2 = sc.nextInt();
	        System.out.printf("Você tem um quadrado e sua área é: %.2fcm²%n", (tamanhoLadoPoligono2 * tamanhoLadoPoligono2));
	    }else{
	        System.out.printf("Você tem um Pentagono!");
	    }
	    }   
	}
    }
}
