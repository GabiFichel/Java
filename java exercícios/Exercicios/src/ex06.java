import java.util.Scanner;
public class ex06 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int soma = 0;
        int v[] = new int[10];
        for (int i = 0; i < 10; i++) {
            System.out.println("informe o" + i + "valor:");
            v[1] = ler.nextInt();
            soma = soma + v[1];
        }if (soma >15) {
            System.out.println(" a soma dos valores é: " + soma);
        }else
            System.out.println("a soma dos valores é menor que 10");

    }
}
