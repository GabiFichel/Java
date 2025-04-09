/*******************
45 - A lanchonete Gostosura vende apenas um tipo de sanduíche, cujo recheio inclui duas fatias de
queijo, uma fatia de presunto e uma rodela de hambúrguer. Sabendo que cada fatia de queijo ou
presunto pesa 50 gramas, e que a rodela de hambúrguer pesa 100 gramas, faça um algoritmo em
que o dono forneça a quantidade de sanduíches a fazer, e a máquina informe as quantidades (em
quilos) de queijo, presunto e carne necessários para compra. 

*************************/
import java.util.Scanner;

public class Ex45 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite a quantidade de sanduíches a fazer: ");
        int quantidadeSanduiches = scanner.nextInt();
        
       
        int quantidadeQueijoGramas = quantidadeSanduiches * 2 * 50; 
        int quantidadePresuntoGramas = quantidadeSanduiches * 1 * 50; 
        int quantidadeCarneGramas = quantidadeSanduiches * 1 * 100; 
        
        
        double quantidadeQueijoQuilos = quantidadeQueijoGramas / 1000.0;
        double quantidadePresuntoQuilos = quantidadePresuntoGramas / 1000.0;
        double quantidadeCarneQuilos = quantidadeCarneGramas / 1000.0;
        
    
        System.out.printf("Quantidade de queijo necessária: %.2f kg%n", quantidadeQueijoQuilos);
        System.out.printf("Quantidade de presunto necessária: %.2f kg%n", quantidadePresuntoQuilos);
        System.out.printf("Quantidade de carne necessária: %.2f kg%n", quantidadeCarneQuilos);
    }
}