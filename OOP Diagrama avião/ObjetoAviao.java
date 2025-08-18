import java.util.Scanner;
public class ObjetoAviao {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Aviao aviao1 = new Aviao();
        Aviao aviao2 = new Aviao();
        Aviao aviao3 = new Aviao();

        String tipo1, tipo2, tipo3, cor1, cor2, cor3;
        int velocidade1, velocidade2, velocidade3, assentos1, assentos2, assentos3;

        // AVIÃO 1
        System.out.println("Insira o tipo do avião 1: ");
        tipo1 = ler.nextLine();
        System.out.println("Insira a cor do avião 1: ");
        cor1 = ler.nextLine();
        System.out.println("Insira a velocidade do avião 1: ");
        velocidade1 = ler.nextInt();
        System.out.println("Insira a quantidade de assentos 1: ");
        assentos1 = ler.nextInt();

        ler.nextLine();

        // AVIÃO 2
        System.out.println("Insira o tipo do avião 2: ");
        tipo2 = ler.nextLine();
        System.out.println("Insira a cor do avião 2: ");
        cor2 = ler.nextLine();
        System.out.println("Insira a velocidade do avião 2: ");
        velocidade2 = ler.nextInt();
        System.out.println("Insira a quantidade de assentos 2: ");
        assentos2 = ler.nextInt();

        ler.nextLine();

        // AVIÃO 3
        System.out.println("Insira o tipo do avião 3: ");
        tipo3 = ler.nextLine();
        System.out.println("Insira a cor do avião 3: ");
        cor3 = ler.nextLine();
        System.out.println("Insira a velocidade do avião 3: ");
        velocidade3 = ler.nextInt();
        System.out.println("Insira a quantidade de assentos 3: ");
        assentos3 = ler.nextInt();


        aviao1.setTipo(tipo1);
        aviao1.setCor(cor1);
        aviao1.setVelocidade(velocidade1);
        aviao1.setAssentos(assentos1);

        aviao2.setTipo(tipo2);
        aviao2.setCor(cor2);
        aviao2.setVelocidade(velocidade2);
        aviao2.setAssentos(assentos2);

        aviao3.setTipo(tipo3);
        aviao3.setCor(cor3);
        aviao3.setVelocidade(velocidade3);
        aviao3.setAssentos(assentos3);


        System.out.println("----- AVIÃO 1 -----");
        System.out.println(aviao1.getTipo());
        System.out.println(aviao1.getCor());
        System.out.println(aviao1.getVelocidade());
        System.out.println(aviao1.getAssentos());

        System.out.println("----- AVIÃO 2 -----");
        System.out.println(aviao2.getTipo());
        System.out.println(aviao2.getCor());
        System.out.println(aviao2.getVelocidade());
        System.out.println(aviao2.getAssentos());

        System.out.println("----- AVIÃO 3 -----");
        System.out.println(aviao3.getTipo());
        System.out.println(aviao3.getCor());
        System.out.println(aviao3.getVelocidade());
        System.out.println(aviao3.getAssentos());
    }
}