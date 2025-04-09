/******************************************************************************

37 - Faça um algoritmo para calcular quantas ferraduras 
são necessárias para equipar todos os cavalos comprados para um haras.

*******************************************************************************/
import java.util.Scanner;

public class Ex37 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        
        System.out.print("Digite a quantidade de cavalos: ");
        int quantidadeCavalos = scanner.nextInt();
        
        
        int ferradurasPorCavalo = 4;
        int totalFerraduras = quantidadeCavalos * ferradurasPorCavalo;
        
        
        System.out.println("Total de ferraduras necessárias: " + totalFerraduras);
        
       
    }
}