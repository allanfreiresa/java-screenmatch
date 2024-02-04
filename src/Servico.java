public class Servico extends Item implements Tributavel, Vendavel {

    private String descricao;
    private double valor;
    private double aliquotaISS;

    private int quantidadeHoras;

    private double precoHora;

    public double getPrecoHora() {
        return precoHora;
    }

    public void setPrecoHora(double precoHora) {
        this.precoHora = precoHora;
    }

    @Override
    public double calcularPrecoTotal(int quantidade) {
        return precoHora * quantidade;
    }

    @Override
    public void aplicarDesconto(double percentualDesconto) {
        precoHora -= precoHora * (percentualDesconto / 100.0);
    }


    @Override
    public double getValorImposto() {
        return (this.valor * this.aliquotaISS) / 100;
    }

    public double calculaImposto() {
        //serviço tem 12% de imposto:
        return getPreco() * 0.12;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public double getAliquotaISS() {
        return aliquotaISS;
    }

    public void setAliquotaISS(double aliquotaISS) {
        this.aliquotaISS = aliquotaISS;
    }

    //getters e setters
}