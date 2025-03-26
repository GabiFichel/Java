/**************************************************************************************
5. Implemente um código para aprovar
empréstimo bancário. O código deve pedir 3 informações: valor do empréstimo,
número de parcelas e salário do solicitante. Aprovar empréstimo caso o valor
das parcelas representem no máximo 30% do salário do solicitante.

***************************************************************************************/
import java.util.Scanner;
public class Ex05 {
    public static void main(String[] args) {
        double valoremp, parcela, salario, vlparcela, max;
        Scanner ler = new Scanner(System.in);
        
        System.out.println("Qual o valor do empréstimo?: ");
        valoremp = ler.nextDouble();
        System.out.println("Qual o número de parcelas?: ");
        parcela = ler.nextDouble();
        System.out.println("Qual é o seu atual salário?: ");
        salario = ler.nextDouble();
        
        vlparcela = valoremp / parcela;
        max = salario * 0.30;
        
        if (vlparcela <= max)
        System.out.println("Seu empréstimo foi aprovado!");
        else
        System.out.println("Seu empréstimo foi recusado!");
    }
}