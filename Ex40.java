/******************************************************************
 40 -  Um motorista deseja colocar no seu tanque X reais de gasolina. 
 Escreva um algoritmo para ler o preço do litro da gasolina e o 
 valor do pagamento, e exibir quantos litros ele conseguiu colocar no tanque.
******************************************************************/
import java.util.Scanner;

public class Ex40 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o preço do litro da gasolina: R$ ");
        double precoPorLitro = scanner.nextDouble();
        System.out.print("Digite o valor que deseja gastar em gasolina: R$ ");
        double valorPagamento = scanner.nextDouble();
        
        double litros = valorPagamento / precoPorLitro;

        System.out.printf("Você consegue colocar %.2f litros de gasolina no tanque.%n", litros);
    }
}
        