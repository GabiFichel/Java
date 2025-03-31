/******************
18) Leia a idade de 20 pessoas e exiba a soma das idade, 
a média das idades e quantas pessoas são maiores de idade.

*******************/
import java.util.Scanner;
public class Ex18 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
       int somaIdades = 0;
        int maiorDeIdade = 0;
        int totalPessoas = 20;

        for (int i = 1; i <= totalPessoas; i++) {
            System.out.print("Digite a idade da " + i + "ª pessoa: ");
            int idade = ler.nextInt();

            somaIdades += idade;

            if (idade >= 18) {
                maiorDeIdade++;
            }
        }
        double mediaIdades = (double) somaIdades / totalPessoas;

        System.out.println("A soma das idades é: " + somaIdades);
        System.out.println("A média das idades é: " + mediaIdades);
        System.out.println("Número de pessoas maiores de idade: " + maiorDeIdade);
    }
}
