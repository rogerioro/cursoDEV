import java.util.Scanner;
//import java.util.Date;
import java.util.Calendar;

public class Main
{
  public static void main (String[]args)
  {
    Scanner sc = new Scanner (System.in);
    int menuID;
    System.out.println("Este programa tem várias opções:");
    System.out.println("1 - Verificaçao de maioridade:");
    System.out.println("2 - Classificação de triângulos:");
    System.out.println("3 - Validar numero:");
    System.out.println("4 - Validar numero par ou impar:");
    System.out.println("5 - Login:");
    System.out.println("Escolha sua opção:");
    menuID = sc.nextInt();
    while ((menuID > 13) || menuID < 1){
        System.out.println("Você digitou um número inválido, tente novamente:");
        menuID = sc.nextInt();
    }
    
    //programa 1
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
	 //PROGRAMA 2
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
	    //PROGRAMA 3
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
	    String user;
	    System.out.println("Vamos logar no sistema, digite seu usuário: ");
	    user = sc.nextLine();
	    
	    while (!user.equals("admin")){
	        System.out.println("Você digitou um usuario invalido, tente novamente");
	        user = sc.nextLine();
	    }
	}
  }
}
		
