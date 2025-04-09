/*******************
44 - Três amigos, Carlos, André e Felipe. decidiram rachar igualmente a conta de um bar. Faça um
algoritmo para ler o valor total da conta e imprimir quanto cada um deve pagar, mas faça com que
Carlos e André não paguem centavos. Ex: uma conta de R$101,53 resulta em R$33,00 para
Carlos, R$33,00 para André e R$35,53 para Felipe.

*************************/
import java.util.Scanner;

public class Ex44{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Quanto Carlos, André e Felipe gastaram no bar?");
        double conta = scanner.nextDouble();
        
        
        int valorCarlos = (int) (conta / 3);
        int valorAndre = (int) (conta / 3);
        double valorFelipe = conta - (valorAndre + valorCarlos);
        
        System.out.println("Carlos deve pagar R$" + valorCarlos);
        System.out.println("André deve pagar R$" + valorAndre);
        System.out.println("Felipe deve pagar R$" + valorFelipe);
    
    }
}