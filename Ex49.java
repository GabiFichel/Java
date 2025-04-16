/******************************************************************************

49. Desenvolva um algoritmo que leia 2 vetores de 10 elementos inteiros
cada. Em seguida, calcule a soma desses vetores, guarde o resultado em um terceiro vetor e escreva o resultado.

*******************************************************************************/
import java.util.Scanner;
public class Ex49
{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] vetor1 = new int[10];
		int[] vetor2 = new int[10];
		int[] somaVetores = new int[10];
		
		System.out.println("Digite 10 elementos inteiros para este vetor: ");
		for (int i = 0; i < 10; i++) {
		    System.out.println("Elemento " + (i+1) + ": ");
		    vetor1[i] = scanner.nextInt();
		}
		System.out.println("Digite 10 elementos inteiros para este segundo vetor: ");
		for (int i = 0; i < 10; i++) {
		    System.out.println("Elemento " + (i+1) + ": ");
		    vetor2[i] = scanner.nextInt();
		}
		
		for (int i = 0; i < 10; i++) {
            somaVetores[i] = vetor1[i] + vetor2[i];
		}
		System.out.println("A soma dos vetores é:");
        for (int i = 0; i < 10; i++) {
            System.out.println("Elemento " + (i + 1) + ": " + somaVetores[i]);
        }
	}
}