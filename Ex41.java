/*******************
 41 - O restaurante a quilo Bem-Bão cobra R$12,00 por cada quilo de refeição. Escreva um algoritmo
que leia o peso do prato montado pelo cliente (em quilos) e imprima o valor a pagar. Assuma que a
balança já desconte o peso do prato.  
*************************/
import java.util.Scanner;

public class Ex41 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Quantos Kg tem o seu prato montado?: ");
        double kg = scanner.nextDouble();
        
        double pagar = kg * 12;
        
        System.out.println("O valor do prato ficou: " + pagar);
    }
}