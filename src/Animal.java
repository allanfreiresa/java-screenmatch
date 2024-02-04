public class Animal {
    private String nome;
    private double peso;

    protected String cor;

    public void emitirSom() {
        System.out.println("Som do animal");
    }

    public void fazerBarulho() {
        System.out.println("fazendo barulho!");
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

}

