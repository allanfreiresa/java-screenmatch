public class IdadePessoa {
    private String nome;
    private int idade;

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void verificaIdade() {

        if (idade >= 18) {
            System.out.println(nome + " é Maior de Idade");
        } else {
            System.out.println(nome + " é menor de idade");
        }
    }
}