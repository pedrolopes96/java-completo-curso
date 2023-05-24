//Entrada de dados

import java.util.Scanner;
public class Ex003 {
    public static void main(String[]Args){
        //Scanner é uma classe que permite a entrada de dados

        Scanner sc = new Scanner(System.in);

        //Declaração de variáveis
        double a;

        //Atribuição de valores
        a = sc.nextDouble();

        //Impressão de valores
        System.out.println(a);

        //Fechamento do Scanner
        sc.close();
    }
}
