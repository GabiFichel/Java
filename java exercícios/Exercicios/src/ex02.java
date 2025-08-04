import java.util.Scanner;
public class ex02 {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a, b, c;
        System.out.println("Informe o primeiro número: ");
        a = scanner.nextInt();
        System.out.println("Informe o segundo número: ");
        b = scanner.nextInt();
        System.out.println("Informe o terceiro número: ");
        c = scanner.nextInt();

        if (a > b && a > c) {
            System.out.println("O número " + a + " é o maior deles");
        }  else if (b > a && b > c) {
            System.out.println("O número " + b + " é o maior deles");
        }  else if (c > a && c > b) {
            System.out.println("O número " + c + " é o maior deles");
        } else if (a == b && b == c) {
            System.out.println("Os números são iguais.");
        } else {
            System.out.println("inválido.");
        }
    }
}