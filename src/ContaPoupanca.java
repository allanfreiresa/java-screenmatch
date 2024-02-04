public class ContaPoupanca extends Conta {

    private double taxaDeJuros;

    public void calcularJuros() {
        double juros = this.saldo * taxaDeJuros;
        System.out.println("Juros atual: " +juros);
    }

    //getters e setters
}