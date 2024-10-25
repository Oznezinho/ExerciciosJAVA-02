import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Digite o nome do cliente: ");
    String nome = scanner.nextLine();

    System.out.println("Digite a cidade do cliente: ");
    String cidade = scanner.nextLine();

    System.out.println("Digite o número de telefone do cliente: ");
    String telefone = scanner.nextLine();

    System.out.println("Digite o idade do cliente: ");
    int idade = scanner.nextInt();

    Pessoa pessoa = new Pessoa();
    pessoa.setNome(nome);
    pessoa.setIdade(idade);
    pessoa.setCidade(cidade);
    pessoa.setTelefone(telefone);

    System.out.println("Nome: " + pessoa.getNome());
    System.out.println("Idade: " + pessoa.getIdade());
    System.out.println("Cidade: " + pessoa.getCidade());
    System.out.println("Telefone: " + pessoa.getTelefone());
    scanner.close();
  }
}