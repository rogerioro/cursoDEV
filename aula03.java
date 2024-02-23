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
    System.out.println("1 - Verificaçao de maioridade;");
    System.out.println("2 - Classificação de triângulos;");
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
	    
	    
	    
	    
	}
  }
}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
