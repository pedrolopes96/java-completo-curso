//Ler um texto até a quebra de linha, limpando o buffer
import java.util.Scanner;
public class Ex006 {
    public static void main(String[]Args){
        //Classe Scanner
        Scanner sc = new Scanner(System.in);

        //Declaração de variáveis
        String a, b, c;
        int d;
        
        //Atribuição de valores
        d = sc.nextInt();
        sc.nextLine(); //Limpando o buffer
        a = sc.nextLine();
        b = sc.nextLine();
        c = sc.nextLine();

        //Impressão de valores
        System.out.println("Dados digitados:");
        System.out.println(d);
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

        //Fechamento do Scanner
        sc.close();
    }
}
