public class TesteTributavel {
    public static void main(String[] args) {

        Produto produto = new Produto();
        produto.setValor(100);
        System.out.println(produto.getValorImposto());

        Servico servico = new Servico();
        servico.setAliquotaISS(5);
        servico.setValor(1200);
        System.out.println(servico.getValorImposto());

        CalculadoraImposto calculadora = new CalculadoraImposto();
        calculadora.calcularImposto(produto);
        calculadora.calcularImposto(servico);
        System.out.println(calculadora.getTotalImposto());

        produto.setPreco(88.5);
        calculadora.calculaImposto(produto);
        System.out.println(calculadora.getTotalImposto());

        servico.setPreco(100);
        calculadora.calculaImposto(servico);
        System.out.println(calculadora.getTotalImposto());




    }
}