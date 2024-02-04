public class CalculadoraImposto {

    private double totalImposto = 0;

    public void calcularImposto(Tributavel item) {
        this.totalImposto += item.getValorImposto();
    }

    public double getTotalImposto() {
        return this.totalImposto;
    }

   public void calculaImposto(Tributavel tributavel) {
       totalImposto += tributavel.calculaImposto();
   }
}