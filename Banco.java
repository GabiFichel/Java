import java.util.Scanner;

public class Banco {
    String[] nomes = new String[5];
    double[] saldos = new double[5];
    int contadorConta = 0;

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Banco banco = new Banco();
        int opcao;

        do {
            System.out.println("------ MENU ------");
            System.out.println("1. Criar nova conta");
            System.out.println("2. Depositar");
            System.out.println("3. Sacar");
            System.out.println("4. Consultar saldo");
            System.out.println("5. Sair");
            System.out.println("Escolha uma opção:");
            opcao = ler.nextInt();

            switch (opcao) {
                case 1:
                    if (banco.contadorConta >= 5) {
                        System.out.println("Você atingiu o limite de contas.");
                        break;
                    }
                    System.out.print("Digite o nome do usuário: ");
                    String nome = ler.next();
                    int numeroConta = banco.contadorConta + 1;
                    banco.nomes[banco.contadorConta] = nome;
                    banco.saldos[banco.contadorConta] = 0.0;
                    banco.contadorConta++;
                    System.out.println("Conta criada! Número da sua conta: " + numeroConta);
                    break;
                case 2:
                    System.out.println("Informe o número da sua conta: ");
                    numeroConta = ler.nextInt();
                    int indice = banco.encontrarConta(numeroConta);

                    if (indice == -1) {
                        System.out.println("Conta não encontrada.");
                        break;
                    }
                    System.out.println("Digite o valor a ser depositado: ");
                    double valor = ler.nextDouble();
                    banco.saldos[indice] += valor;
                    System.out.println("Depósito realizado com sucesso! Novo saldo: " + banco.saldos[indice]);
                    break;
                case 3:
                    System.out.println("Informe o número da sua conta: ");
                    numeroConta = ler.nextInt();
                    indice = banco.encontrarConta(numeroConta);

                    if (indice == -1) {
                        System.out.println("Conta não encontrada.");
                        break;
                    }
                    System.out.println("Digite o valor a ser sacado: ");
                    valor = ler.nextDouble();
                    if (valor > banco.saldos[indice]) {
                        System.out.println("Valor indisponível na conta!");
                    } else {
                        banco.saldos[indice] -= valor;
                        System.out.println("Saque realizado com sucesso! O seu saldo agora é: " + banco.saldos[indice]);
                    }
                    break;
                case 4:
                    System.out.println("Informe o número da sua conta: ");
                    numeroConta = ler.nextInt();
                    indice = banco.encontrarConta(numeroConta);
                    if (indice == -1) {
                        System.out.println("Conta não encontrada.");
                    } else {
                        System.out.println("Saldo da conta " + numeroConta + ": " + banco.saldos[indice]);
                    }
                    break;
                case 5:
                    System.out.println("Até mais!...");
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
        } while (opcao != 5);
        
        ler.close();
    }

    private int encontrarConta(int numeroConta) {
        if (numeroConta <= 0 || numeroConta > contadorConta) {
            return -1;
        }
        return numeroConta - 1;
    }
}
