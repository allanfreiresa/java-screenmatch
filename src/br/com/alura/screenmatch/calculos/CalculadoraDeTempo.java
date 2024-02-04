package br.com.alura.screenmatch.calculos;

import br.com.alura.screenmatch.modelos.Titulo;

public class CalculadoraDeTempo {
    private int tempoTotal = 0;

    public int getTempoTotal() {
        return this.tempoTotal;
    }

//    public void inclui (Filme f){
//        this.tempoTotal += f.getDuracaoEmMinutos();
//    }
//
//    public void inclui (Serie s){
//        this.tempoTotal += s.getDuracaoEmMinutos();
//    }

    //Aqui foi aplicado o polimorfismo, pois nessa classe getduracaoem minutos há dois metodos diferentes um chamado
    // pelo Filme e outro pela Serie, e o proprio Java se vira pela herança sabendo que sao classes filhas enviando alguma isntrucao
    public void inclui(Titulo titulo) {
        System.out.println("Adicionando duração e minutos de" + titulo);
        this.tempoTotal += titulo.getDuracaoEmMinutos();
    }

}
