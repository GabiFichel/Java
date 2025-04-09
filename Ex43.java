/*******************
43 - Faça um algoritmo para ler o salário de um funcionário e aumentá-Io em 15%. Após o aumento,
desconte 8% de impostos. Imprima o salário inicial, o salário com o aumento e o salário final.

*************************/
import java.util.Scanner;

public class Ex43 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Informe seu salário atual: ");
        double salarioInicial = scanner.nextDouble();
        double aumento = salarioInicial * 0.15;
        System.out.println("Você ganhou um aumento de 10%, resultando em: " + aumento);
        double salarioAumento = aumento + salarioInicial;
        System.out.println("Seu salário ficará: " + salarioAumento);
        double imposto = salarioAumento * 0.08;
        System.out.println("O imposto será de: " + imposto);
        double salarioFinal = salarioAumento - imposto;
        System.out.println("Seu salário final será: " + salarioFinal);
    }
}