import java.util.Scanner;
public class ObjetoComputador {
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);

        Computador computador1 = new Computador();
        Computador computador2 = new Computador();
        Computador computador3 = new Computador();

        String processador1, placaDeVideo1, sistemaOperacional1, processador2, placaDeVideo2, sistemaOperacional2, processador3, placaDeVideo3, sistemaOperacional3;
        int qntdDeRam1, armazenamento1, qntdDeRam2, armazenamento2, qntdDeRam3, armazenamento3;

        System.out.println("Qual a marca do processador do 1° Computador? ");
        processador1 = ler.nextLine();
        System.out.println("Qual a marca da placa de video do 1° Computador? ");
        placaDeVideo1 = ler.nextLine();
        System.out.println("Qual o sistema operacional do 1° Computador? ");
        sistemaOperacional1 = ler.nextLine();
        System.out.println("Qual a quantidade de memoria ram do 1° Computador? ");
        qntdDeRam1 = ler.nextInt();
        ler.nextLine();
        System.out.println("Quanto é o armazenamento do 1° Computador? ");
        armazenamento1 = ler.nextInt();

        ler.nextLine();

        System.out.println("Qual a marca do processador do 2° Computador? ");
        processador2 = ler.nextLine();
        System.out.println("Qual a marca da placa de video do 2° Computador? ");
        placaDeVideo2 = ler.nextLine();
        System.out.println("Qual o sistema operacional do 2° Computador? ");
        sistemaOperacional2 = ler.nextLine();
        System.out.println("Qual a quantidade de memoria ram do 2° Computador? ");
        qntdDeRam2 = ler.nextInt();
        ler.nextLine();
        System.out.println("Quanto é o armazenamento do 2° Computador? ");
        armazenamento2 = ler.nextInt();

        ler.nextLine();

        System.out.println("Qual a marca do processador do 3° Computador? ");
        processador3 = ler.nextLine();
        System.out.println("Qual a marca da placa de video do 3° Computador? ");
        placaDeVideo3 = ler.nextLine();
        System.out.println("Qual o sistema operacional do 3° Computador? ");
        sistemaOperacional3 = ler.nextLine();
        System.out.println("Qual a quantidade de memoria ram do 3° Computador? ");
        qntdDeRam3 = ler.nextInt();
        ler.nextLine();
        System.out.println("Quanto é o armazenamento do 3° Computador? ");
        armazenamento3 = ler.nextInt();

        computador1.setProcessador(processador1);
        computador1.setPlacaDeVideo(placaDeVideo1);
        computador1.setSistemaOperacional(sistemaOperacional1);
        computador1.setQntdDeRam(qntdDeRam1);
        computador1.setArmazenamento(armazenamento1);

        computador2.setProcessador(processador2);
        computador2.setPlacaDeVideo(placaDeVideo2);
        computador2.setSistemaOperacional(sistemaOperacional2);
        computador2.setQntdDeRam(qntdDeRam2);
        computador2.setArmazenamento(armazenamento2);

        computador3.setProcessador(processador3);
        computador3.setPlacaDeVideo(placaDeVideo3);
        computador3.setSistemaOperacional(sistemaOperacional3);
        computador3.setQntdDeRam(qntdDeRam3);
        computador3.setArmazenamento(armazenamento3);

        System.out.println("---Computador 1---");
        System.out.println(computador1.getProcessador());
        System.out.println(computador1.getPlacaDeVideo());
        System.out.println(computador1.getSistemaOperacional());
        System.out.println(computador1.getQntdDeRam()+ "Gbs");
        System.out.println(computador1.getArmazenamento()+ "Gbs");

        System.out.println("---Computador 2---");
        System.out.println(computador2.getProcessador());
        System.out.println(computador2.getPlacaDeVideo());
        System.out.println(computador2.getSistemaOperacional());
        System.out.println(computador2.getQntdDeRam() + "Gbs");
        System.out.println(computador2.getArmazenamento()+ "Gbs");

        System.out.println("---Computador 3---");
        System.out.println(computador3.getProcessador());
        System.out.println(computador3.getPlacaDeVideo());
        System.out.println(computador3.getSistemaOperacional());
        System.out.println(computador3.getQntdDeRam()+ "Gbs");
        System.out.println(computador3.getArmazenamento()+ "Gbs");




    }
}