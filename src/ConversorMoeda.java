public class ConversorMoeda implements ConversaoFinanceira{

    private double taxa;
    private double valor;

    public double getTaxa() {
        return taxa;
    }

    public void setTaxa(double taxa) {
        this.taxa = taxa;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public double converterDolarParaRealOld(){
        return this.valor = this.valor * this.taxa;
    }

    public void converterDolarParaReal(double valorDolar, double taxa) {
        //double cotacaoDolar = 4.80;
        double valorReal = valorDolar * taxa;//cotacaoDolar;
        System.out.println("O valor em reais é: R$" + valorReal);
    }
}
