//Ler um texto até a quebra de linha
import java.util.Scanner;
public class Ex005 {
    public static void main(String[]Args){
        //Classe Scanner
        Scanner sc = new Scanner(System.in);

        //Declaração de variáveis
        String a;
        String b;
        String c;

        //Atribuição de valores
        a = sc.nextLine();
        b = sc.nextLine();
        c = sc.nextLine();

        //Impressão de valores
        System.out.println("Dados digitados:");
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

        //Fechamento do Scanner
        sc.close();
    }
}
