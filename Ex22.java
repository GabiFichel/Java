/***
22)Faça um programa que receba a idade e o sexo de sete pessoas e que calcule e mostre:
A idade média do grupo;
A idade média das mulheres;
A idade média dos homens; 
***/
import java.util.Scanner;

public class Ex22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int somaIdades = 0;
        int somaIdadesMulheres = 0;
        int somaIdadesHomens = 0;
        int countMulheres = 0;
        int countHomens = 0;

        for (int i = 1; i <= 7; i++) {
            System.out.print("Digite a idade da " + i + "ª pessoa: ");
            int idade = scanner.nextInt();
            System.out.print("Digite o sexo da " + i + "ª pessoa (M para masculino, F para feminino): ");
            char sexo = scanner.next().charAt(0);

            somaIdades += idade;

            if (sexo == 'F' || sexo == 'f') {
                somaIdadesMulheres += idade;
                countMulheres++;
            } else if (sexo == 'M' || sexo == 'm') {
                somaIdadesHomens += idade;
                countHomens++;
            }
        }

        double mediaIdadeGrupo = (double) somaIdades / 7;
        double mediaIdadeMulheres = countMulheres > 0 ? (double) somaIdadesMulheres / countMulheres : 0;
        double mediaIdadeHomens = countHomens > 0 ? (double) somaIdadesHomens / countHomens : 0;

        System.out.println("Idade média do grupo: " + mediaIdadeGrupo);
        System.out.println("Idade média das mulheres: " + mediaIdadeMulheres);
        System.out.println("Idade média dos homens: " + mediaIdadeHomens);
    }
}