//Leitura de um caractere
import java.util.Scanner;
public class Ex004 {
    public static void main(String[]Args){
        //Scanner é uma classe que permite a entrada de dados

        Scanner sc = new Scanner(System.in);

        //Declaração de variáveis
        char a;

        //Atribuição de valores
        a = sc.next().charAt(0);

        //Impressão de valores
        System.out.println("Você digitou: " + a);

        
    }
}
