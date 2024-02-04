public class TestesGeral {
    public static void main(String[] args) {


        /*
        Servico servico = new Servico();

        //metodo com return
        servico.setPrecoHora(350);
        servico.calcularPrecoTotal(100);
        System.out.println("Preco Total é: " + servico.calcularPrecoTotal(100));

        //metodo sem return, precisa ser criado internamente na classe um getter para pegar esse valor
        // ou dentro da função sem retorno criar um System.out.println para apresentar o valor
        System.out.println("Preco hora atual sem desconto é: " + servico.getPrecoHora());
        servico.aplicarDesconto(10);
        System.out.println("Preco hora atual com desconto é: " + servico.getPrecoHora());
*/


/*

        Produto produto = new Produto();

        //metodo com return
        produto.setPrecoUnitario(150.55);
        System.out.println("Preco unitario atual é: " + produto.getPrecoUnitario());
        System.out.println("Preco Total é: " + produto.calcularPrecoTotal(100));

        //metodo sem return, precisa ser criado internamente na classe um getter para pegar esse valor
        // ou dentro da função sem retorno criar um System.out.println para apresentar o valor
        produto.aplicarDesconto(10);
        System.out.println("Preco unitario atual com desconto é: " + produto.getPrecoUnitario());
*/




        /*ConversorTemperaturaPadrao conversor = new ConversorTemperaturaPadrao();
        conversor.celsiusParaFahrenheit(50); //sem retorno é necessario criar um getter interno
        conversor.fahrenheitParaCelsius(70);// com return o getter nao funciona pois o proprio retorno faz isso
        System.out.println(conversor.getTotal());
        System.out.println(conversor.fahrenheitParaCelsius(70));*/
        /*
        ConversorTemperatura conversor = new ConversorTemperaturaPadrao();
        conversor.celsiusParaFahrenheit(25); // função vindo da interface com matodo sem retorno
        //abaixo chamando metodo com retorno vindo da interface
        System.out.println("Celsius - usando funcao com retorno "+ conversor.fahrenheitParaCelsius(70));
*/
        /*double temperaturaCelsius = 25;
        double temperaturaFahrenheit = temperaturaCelsius;//conversor.celsiusParaFahrenheit(temperaturaCelsius);
        //System.out.println(temperaturaCelsius + " Celsius é igual a " + temperaturaFahrenheit + " Fahrenheit.");
         conversor.celsiusParaFahrenheit(temperaturaCelsius);


        temperaturaFahrenheit = 77;
        temperaturaCelsius = conversor.fahrenheitParaCelsius(temperaturaFahrenheit);
       System.out.println(temperaturaFahrenheit + " Fahrenheit é igual a " + temperaturaCelsius + " Celsius.");
*/


        /*TabuadaMultiplicacao tabuada = new TabuadaMultiplicacao();
        tabuada.mostrarTabuada(7);

        CalculadoraSalaRetangular calculadora = new CalculadoraSalaRetangular();
        calculadora.calcularArea(5,8);
        calculadora.calcularPerimetro(5,8);


        ConversorMoeda conversao = new ConversorMoeda();

        conversao.setTaxa(4.8);
        conversao.setValor(10);
        System.out.println(conversao.converterDolarParaRealOld());

        conversao.converterDolarParaReal(10,4.8); //*/

    }
}
