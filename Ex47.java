/******************************************************************************

47. Desenvolva um algoritmo que leia um conjunto de 20 valores inteiros,
guarde-os em um vetor e escreva-os em ordem inversa.

*******************************************************************************/
import java.util.Scanner;
public class Ex47
{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] numero = new int[20];
		
		System.out.println("Informe 20 número inteiros: ");
		for (int i = 0; i < 20; i++) {
		    System.out.println("Número " + (i+1) + ": ");
		    numero[i] = scanner.nextInt();
		}
		System.out.println("----- Números em ordem inversa -------");
		for (int i = 19; i >= 0; i--) {
		    System.out.println(numero[i]);
		}
	}
}
