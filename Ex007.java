//Funções matemáticas em Java
//Exercício 07: Crie um programa que calcule a raiz quadrada, potenciação e arredondamento de um número.
public class Ex007 {
    public static void main(String[]Args){
        //Declaração de variáveis
        double x = 3.0;
        double y = 4.0;
        double z = -5.0;
        double A, B, C;

        //Raiz quadrada
        A = Math.sqrt(x);
        B = Math.sqrt(y);
        C = Math.sqrt(25.0);
        System.out.println("Raiz quadrada de " + x + " = " + A);
        System.out.println("Raiz quadrada de " + y + " = " + B);
        System.out.println("Raiz quadrada de 25 = " + C);

        //Potenciação
        A = Math.pow(x, y);
        B = Math.pow(x, 2.0);
        C = Math.pow(5.0, 2.0);
        System.out.println(x + " elevado a " + y + " = " + A);
        System.out.println(x + " elevado ao quadrado = " + B);
        System.out.println("5 elevado ao quadrado = " + C);

        //Arredondamento
        A = Math.abs(y);
        B = Math.abs(z);
        System.out.println("Valor absoluto de " + y + " = " + A);
        System.out.println("Valor absoluto de " + z + " = " + B);
    }
}
