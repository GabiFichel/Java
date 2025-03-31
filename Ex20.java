/*****
20) Faça um algoritmo que leia 20 números e, ao final, escreva quantos estão entre 0 e
100, quantos estão entre 101 e 200 e quantos são maiores de 200. 
*****/
import java.util.Scanner;

public class Ex20 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int contar0_100 = 0;
        int contar101_200 = 0;
        int contarMaior200 = 0;

        for (int i = 1; i <= 20; i++) {
            System.out.print("Digite o " + i + "º número: ");
            int numero = ler.nextInt();

        
            if (numero >= 0 && numero <= 100) {
                contar0_100++;
            } else if (numero >= 101 && numero <= 200) {
                contar101_200++;
            } else if (numero > 200) {
                contarMaior200++;
            }
        }
        System.out.println("Números entre 0 e 100: " + contar0_100);
        System.out.println("Números entre 101 e 200: " + contar101_200);
        System.out.println("Números maiores que 200: " + contarMaior200);

    }
}