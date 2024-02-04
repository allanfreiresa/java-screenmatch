public class CalculadoraSalaRetangular implements CalculoGeometrico {

    private double altura;
    private double largura;

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getLargura() {
        return largura;
    }

    public void setLargura(double largura) {
        this.largura = largura;
    }

    @java.lang.Override
    public void calcularArea(double altura, double largura) {
        double area = altura * largura;
        System.out.println("A área da sala retangular é: " + area);
    }

    @java.lang.Override
    public void calcularPerimetro(double altura, double largura) {
        double perimetro = 2 * (altura + largura);
        System.out.println("O Perímetro da sala retangular é: " + perimetro);
    }
}
