/***
22)Faça um programa que receba a idade e o sexo de sete pessoas e que calcule e mostre:
A idade média do grupo;
A idade média das mulheres;
A idade média dos homens; 
***/
import java.util.Scanner;

public class Ex23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double somaPeso1_10 = 0;
        double somaPeso11_20 = 0;
        double somaPeso21_30 = 0;
        double somaPesoMaior31 = 0;
        int count1_10 = 0;
        int count11_20 = 0;
        int count21_30 = 0;
        int countMaior31 = 0;

        for (int i = 1; i <= 15; i++) {
            System.out.print("Digite a idade da " + i + "ª pessoa: ");
            int idade = scanner.nextInt();
            System.out.print("Digite o peso da " + i + "ª pessoa: ");
            double peso = scanner.nextDouble();

            if (idade >= 1 && idade <= 10) {
                somaPeso1_10 += peso;
                count1_10++;
            } else if (idade >= 11 && idade <= 20) {
                somaPeso11_20 += peso;
                count11_20++;
            } else if (idade >= 21 && idade <= 30) {
                somaPeso21_30 += peso;
                count21_30++;
            } else if (idade > 31) {
                somaPesoMaior31 += peso;
                countMaior31++;
            }
        }

        double mediaPeso1_10 = count1_10 > 0 ? somaPeso1_10 / count1_10 : 0;
        double mediaPeso11_20 = count11_20 > 0 ? somaPeso11_20 / count11_20 : 0;
        double mediaPeso21_30 = count21_30 > 0 ? somaPeso21_30 / count21_30 : 0;
        double mediaPesoMaior31 = countMaior31 > 0 ? somaPesoMaior31 / countMaior31 : 0;

        System.out.println("Média de peso das pessoas de 1 a 10 anos: " + mediaPeso1_10);
        System.out.println("Média de peso das pessoas de 11 a 20 anos: " + mediaPeso11_20);
        System.out.println("Média de peso das pessoas de 21 a 30 anos: " + mediaPeso21_30);
        System.out.println("Média de peso das pessoas maiores de 31 anos: " + mediaPesoMaior31);
    }
}