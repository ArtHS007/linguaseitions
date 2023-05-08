/*
Eu esqueci oq esse código faz
Alpha; 08/05/2023 ( ͠❛ ͜ʖ ͡❛)✌
*/

//Importa a classe Scanner
import java.util.Scanner;
//Classe principal
public class linguiciations{
    //Método execuatado primeiro
    public static void main (String args[]) {
    Scanner leitor = new Scanner(System.in);
    //Cria as vars que receberão notas
    Double n1, n2, n3, n4, media;
    //Inicializa as vars
    media = n1 = n2 = n3 = n4 = 0.0;

    System.out.println("Insira 4 notas");
    //Notas
    n1 = leitor.nextDouble();
    n2 = leitor.nextDouble();
    n3 = leitor.nextDouble();
    n4 = leitor.nextDouble();
    //Calcula a média
    media = (n1 + n2 + n3 + n4)/4;
     //mostra se passou, reprovou ou está de recuperação.
    if (media>= 6){
        System.out.println ("You have passed!");
    }else if(media >= 4 && media <= 6){
        System.out.println ("You NEED to study more. :|");
    }else{
        System.out.println ("You had been reproved.");
    }
    }
    
}