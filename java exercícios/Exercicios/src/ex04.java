import java.util.Scanner;
public class ex04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o intervalo de números ");
        int numero = scanner.nextInt();
        for(int i=0; i <= numero ; i++) {
            if (i % 2 != 0) {
                System.out.println("Número "+i);

            }
        }
        scanner.close();
    }
}
