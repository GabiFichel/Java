/*******************
42 - Uma fábrica de camisetas produz os tamanhos pequeno, médio e grande, cada uma sendo
vendida respectivamente por 10, 12 e 15 reais. Construa um algoritmo em que o usuário forneça a
quantidade de camisetas pequenas, médias e grandes referentes a uma venda, e a máquina
informe quanto será o valor arrecadado.

*************************/
import java.util.Scanner;

public class Ex42 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Quantas camisetas pequenas você vendeu?: ");
        int camisetaP = scanner.nextInt();
        int totalP = camisetaP * 10;
        System.out.println("Você arrecadou um valor de: " + totalP + " reais com as camisetas P");
        
         System.out.println("Quantas camisetas médias você vendeu?: ");
        int camisetaM = scanner.nextInt();
        int totalM = camisetaM * 12;
        System.out.println("Você arrecadou um valor de: " + totalM + " reais com as camisetas M");
        
        System.out.println("Quantas camisetas grandes você vendeu?: ");
        int camisetaG = scanner.nextInt();
        int totalG = camisetaG * 15;
        System.out.println("Você arrecadou um valor de: " + totalG + " reais com as camisetas G");
        
        
        int total = totalG + totalM + totalP;
        System.out.print("Você arrecadou no total R$ " + total);
        
    }
}