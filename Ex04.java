/**************************************************************************************
4. A empresa XKW concedeu um bônus de 20%
do valor do salário a todos os funcionários com tempo de trabalho na empresa
igual ou superior a 5 anos e de 10% aos demais. Faça um algoritmo que receba o
salário e o tempo de serviço de um funcionário, calcule e mostre o valor do
bônus recebido por ele.

***************************************************************************************/
import java.util.Scanner;
public class Ex04 {
    public static void main(String[] args) {
        double salario, tempo, bonus1, bonus2;
        Scanner ler = new Scanner(System.in);
        
        System.out.println("A quanto tempo você está na empresa?: ");
        tempo = ler.nextDouble();
        System.out.println("Quanto você ganha?: ");
        salario = ler.nextDouble();
        bonus1 = salario * 0.20;
        bonus2 = salario * 0.10;
        
        if (tempo >= 5)
        System.out.println("Você receberá um bônus de: " + bonus1);
        else
        System.out.println("Você receberá um bônus de: " + bonus2);
    }
}