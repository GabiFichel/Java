/******************************************************************************

39 -  Escreva um algoritmo para ler o nome e a idade de uma pessoa, e exibir quantos dias de vida
ela possui. Considere sempre anos completos, e que um ano possui 365 dias. Ex: uma pessoa
com 19 anos possui 6935 dias de vida; veja um exemplo de saída: MARIA, VOCÊ JÁ VIVEU 6935
DIAS


*******************************************************************************/
import java.util.Scanner;

public class Ex39 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nome;
        int idade, dias;
        
        System.out.println("Informe seu nome: ");
        nome = scanner.nextLine();
        System.out.println("Informe sua idade: ");
        idade = scanner.nextInt();
        
        dias = 365 * idade;
        
        System.out.println(nome + ", você já viveu " + dias + " dias.");
        
     
    }
}
        
        
        
        