import java.util.Scanner;
public class ex01 {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a, b;
        System.out.println("Informe o primeiro número: ");
        a = scanner.nextInt();
        System.out.println("Informe o segundo número: ");
        b = scanner.nextInt();

        System.out.println("Resultados");
        System.out.println("Soma: " + (a + b));
        System.out.println("Subtração: " + (a - b));
        System.out.println("Multiplicação: " + (a * b));
        System.out.println("Divisão Inteira: " + (a % b));
        System.out.println("Divisão Exata: " + ((double)a / b));
    }
}
