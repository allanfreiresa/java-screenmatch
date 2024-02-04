// Classe ConversorTemperaturaPadrao implementando ConversorTemperatura
public class ConversorTemperaturaPadrao implements ConversorTemperatura {

    private double total;

    public double getTotal() {
        return total;
    }

    @Override
    public void celsiusParaFahrenheit(double temperaturaCelsius) {
        //return (temperaturaCelsius * 9 / 5) + 32;
         total = (temperaturaCelsius * 9 / 5) + 32;
        //System.out.println("Fahrenheit usando funcao sem retorno = " + total);

    }

    @Override
    public double fahrenheitParaCelsius(double temperaturaFahrenheit) {
        return (temperaturaFahrenheit - 32) * 5 / 9;
    }


}