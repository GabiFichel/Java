/***
 21)Faça um programa que receba a idade, o peso, a altura, a cor dos olhos 
(A – Azul, P- Preto, V- Verde e C- Castanho) e a cor dos cabelos 
(P – Preto, C- Castanho, L – Louro e R-Ruivo) de 20 pessoas e que calcule e mostre: 
A quantidade de pessoas com idade superior a 50 anos e peso inferior a 60 quilos;
A média das idades das pessoas com altura inferior a 1,50;
A porcentagem de pessoas com olhos azuis entre a s pessoas analisadas;
A quantidade de pessoas ruivas que não possuem olhos azuis; 

***/

import java.util.Scanner;

public class Ex21{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int countIdade50Peso60 = 0;
        int countAlturaMenor150 = 0;
        int somaIdadesAlturaMenor150 = 0;
        int countOlhosAzuis = 0;
        int countRuivosSemOlhosAzuis = 0;

        for (int i = 1; i <= 20; i++) {
            System.out.print("Digite a idade da " + i + "ª pessoa: ");
            int idade = scanner.nextInt();
            System.out.print("Digite o peso da " + i + "ª pessoa: ");
            double peso = scanner.nextDouble();
            System.out.print("Digite a altura da " + i + "ª pessoa: ");
            double altura = scanner.nextDouble();
            System.out.print("Digite a cor dos olhos (A - Azul, P - Preto, V - Verde, C - Castanho): ");
            char corOlhos = scanner.next().charAt(0);
            System.out.print("Digite a cor dos cabelos (P - Preto, C - Castanho, L - Louro, R - Ruivo): ");
            char corCabelos = scanner.next().charAt(0);

            // Condições
            if (idade > 50 && peso < 60) {
                countIdade50Peso60++;
            }
            if (altura < 1.50) {
                countAlturaMenor150++;
                somaIdadesAlturaMenor150 += idade;
            }
            if (corOlhos == 'A') {
                countOlhosAzuis++;
            }
            if (corCabelos == 'R' && corOlhos != 'A') {
                countRuivosSemOlhosAzuis++;
            }
        }
        double mediaIdadeAlturaMenor150 = countAlturaMenor150 > 0 ? (double) somaIdadesAlturaMenor150 / countAlturaMenor150 : 0;
        double porcentagemOlhosAzuis = (countOlhosAzuis / 20.0) * 100;

        System.out.println("Quantidade de pessoas com idade > 50 e peso < 60: " + countIdade50Peso60);
        System.out.println("Média das idades das pessoas com altura < 1,50: " + mediaIdadeAlturaMenor150);
        System.out.println("Porcentagem de pessoas com olhos azuis: " + porcentagemOlhosAzuis + "%");
        System.out.println("Quantidade de pessoas ruivas sem olhos azuis: " + countRuivosSemOlhosAzuis);
    }
}
