import java.util.Scanner;
public class ObjetoPessoa {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Pessoa pessoa1 = new Pessoa();
        Pessoa pessoa2 = new Pessoa();
        String nome, cidade, profissao, nome1, cidade1, profissao1;
        int idade, idade1;

        // OBJETO 1
        System.out.println("Insira o nome do Objeto 1: ");
        nome = ler.nextLine();
        System.out.println("Insira a idade do Objeto 1: ");
        idade = ler.nextInt();
        ler.nextLine();
        System.out.println("Insira o endereço do Objeto 1: ");
        cidade = ler.nextLine();
        System.out.println("Insira a profissão do Objeto 1: ");
        profissao = ler.nextLine();

        // OBJETO 2
        System.out.println("Insira o nome do Objeto 2: ");
        nome1 = ler.nextLine();
        System.out.println("Insira a idade do Objeto 2: ");
        idade1 = ler.nextInt();
        ler.nextLine();
        System.out.println("Insira o endereço do Objeto 2: ");
        cidade1 = ler.nextLine();
        System.out.println("Insira a profissão do Objeto 2: ");
        profissao1 = ler.nextLine();

        pessoa1.setNome(nome);
        pessoa1.setIdade(idade);
        pessoa1.setCidade(cidade);
        pessoa1.setProfissao(profissao);

        pessoa2.setNome(nome1);
        pessoa2.setIdade(idade1);
        pessoa2.setCidade(cidade1);
        pessoa2.setProfissao(profissao1);


        System.out.println("----- OBJETO 1 -----");
        System.out.println(pessoa1.getNome());
        System.out.println(pessoa1.getIdade());
        System.out.println(pessoa1.getCidade());
        System.out.println(pessoa1.getProfissao());

        System.out.println("----- OBJETO 2 -----");
        System.out.println(pessoa2.getNome());
        System.out.println(pessoa2.getIdade());
        System.out.println(pessoa2.getCidade());
        System.out.println(pessoa2.getProfissao());
    }
}
