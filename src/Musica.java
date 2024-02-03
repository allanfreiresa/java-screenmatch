public class Musica {

    String titulo;
    String artista;
    int anoLancamento;
    double somaDasAvaliacoes;
    int numAvaliacoes;

    void exibeFichaTecnica() {
        System.out.println("Título da música: " + titulo);
        System.out.println("Artista: " + artista);
        System.out.println("Ano de lançamento: " + anoLancamento);
    }

    void avalia(double nota) {
        somaDasAvaliacoes += nota;
        numAvaliacoes++;
    }

    double pegaMedia() {
        return somaDasAvaliacoes / numAvaliacoes;
    }
}

