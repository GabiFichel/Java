/************************************************
6. Faça um algoritmo que receba um número
inteiro qualquer e mostre se ele é par ou impar.

************************************************/
import java.util.Scanner;
public class Ex06 
{
	public static void main(String[] args) {
	Scanner ler = new Scanner(System.in);
	int n1, par;
	
	System.out.println("Digite um número: ");
	n1 = ler.nextInt();
	
	par = n1 % 2;
	
	if (par == 0)
	System.out.println("Seu número é par");
	else if (par == 1)
	System.out.println("Seu número é ímpar");
	}
}
