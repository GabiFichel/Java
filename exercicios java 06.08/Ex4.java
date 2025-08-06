import java.util.ArrayList;
import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayList<Double> notas = new ArrayList<>();
        double soma = 0;

        for (int i = 0; i < 5; i++) {
            System.out.println("Insira a nota " + (i + 1) + ": ");
            double nota = scanner.nextDouble();
            notas.add(nota);
            soma += nota;
        }

        double media = soma / notas.size();
        long acima = notas.stream().filter(n -> n > media).count();

        System.out.println("Média: " + media);
        System.out.println("Quantidade de notas acima da média: " + acima);
    }
}