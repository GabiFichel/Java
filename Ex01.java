/**************************************************************************************
 1.Faça um algoritmo para calcular a média final da disciplina de programação, mostrar
essa média final e também uma mensagem informando se o aluno foi aprovado
(média >= 7) ou reprovado. Considere duas avaliações.

***************************************************************************************/
import java.util.Scanner;
public class Ex01 {
    public static void main(String[] args) {
        double nota1, nota2, media;
        Scanner ler = new Scanner(System.in);
        
        System.out.print("Digite a sua primeira nota: ");
        nota1 = ler.nextDouble();
        System.out.println("Digite a sua segunda nota: ");
        nota2 = ler.nextDouble();
        
        media = (nota1 + nota2) / 2;
        
        System.out.println("Sua média é: " + media);
        
        if (media>=7)
        System.out.println("Você está aprovado!");
        else
        System.out.println("Você está reprovado!");
    }
    
}