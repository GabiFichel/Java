/******************************************************************************

52. Faça um programa que leia 5 idades de pessoas, armazeno-os em um Array,
calcule e apresente a soma das idades. Verificar as idades e apresentar se 
a pessoal é " Melhor idade", " Adulto" ou "Criança".


*******************************************************************************/
import java.util.Scanner;
public class Ex52
{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] idades = new int[5];
		int adulto; 
		int melhorIdade;
		int crianca;
		int soma = 0;
		
		for (int i = 0; i < 5; i++) {
		    System.out.println("Digite a idade da " + (i+1) + "º pessoa: ");
		    idades[i] = scanner.nextInt();
    		    soma += idades[i];
		}
		System.out.println("A soma das idades é: " + soma);
		
        	for (int i = 0; i < 5; i++) {
            String classificacao;
            if (idades[i] < 12) {
                classificacao = "Criança";
            } else if (idades[i] < 60) {
                classificacao = "Adulto";
            } else {
                classificacao = "Melhor idade";
            }
            System.out.println("A pessoa " + (i + 1) + " com idade " + idades[i] + " é: " + classificacao);
        }
	}
}