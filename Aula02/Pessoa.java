public class Pessoa {
  private String nome;
  private int idade;
  private String cidade;
  private String telefone;

  // Geter para o noeme
  public String getNome() {
    return nome;
  }

  // Seter para o nome
  public void setNome(String nome) {
    this.nome = nome;
  }

  // Geter para a idade
  public int getIdade() {
    return idade;
  }

  // Seter para a idade
  public void setIdade(int idade) {
    this.idade = idade;
  }

  // Geter para a cidade
  public String getCidade() {
    return cidade;
  }

  // Seter para a cidade
  public void setCidade(String cidade) {
    this.cidade = cidade;
  }

  // Geter para o telefone
  public String getTelefone() {
    return telefone;
  }

  // Seter para o telefone
  public void setTelefone(String telefone) {
    this.telefone = telefone;
  }
}