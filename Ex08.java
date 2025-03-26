import java.util.Scanner;

public class Ex08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a altura (em metros): ");
        double altura = scanner.nextDouble();
        
        System.out.print("Digite o sexo (M para masculino, F para feminino): ");
        char sexo = scanner.next().charAt(0);

       
        double pesoIdeal;
        if (sexo == 'M' || sexo == 'm') {
            pesoIdeal = (72.7 * altura) - 58;
             System.out.println("Seu peso ideal é: " + pesoIdeal);
        } 
        else if (sexo == 'F' || sexo == 'f') {
            pesoIdeal = (62.1 * altura) - 44.7;
            System.out.println("Seu peso ideal é: " + pesoIdeal);
        }
        else {
            System.out.println("Sexo inválido. Por favor, digite M ou F.");
            scanner.close();
            return;
        }
    }
}
