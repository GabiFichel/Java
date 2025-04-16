/******************************************************************************

50. Desenvolva um algoritmo que leia um vetor de 10 elementos com valores de uma compra  no final mostre o valor gasto e o imposto.
a) Se a compra foi acima de R1.200,00 colocar imposto de 2.5% senão colocar imposto de 0.8%.
b) Mostrar os valores finais com e sem imposto.


*******************************************************************************/
import java.util.Scanner;
public class Ex50
{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double[] valor = new double[10];
		double soma = 0;
		
		
		System.out.println("Informe os valores da sua compra: ");
		for (int i = 0; i < 10; i++) {
		    System.out.println("Elemento " + (i+1) + ": ");
		    valor[i] = scanner.nextDouble();
		    soma += valor[i];
		}
		System.out.println("O total gasto é: " + soma);
		
		double totalGasto;
		double imposto;
        if (soma > 1200) {
            imposto = soma * 0.025; 
            totalGasto = soma + imposto;
            System.out.println("Adicionando os impostos, você terá que pagar: " + totalGasto);
        } else {
            imposto = soma * 0.008;
            totalGasto = soma + imposto;
            System.out.println("Adicionando os impostos, você terá que pagar: " + totalGasto);
        }
        
	}
}