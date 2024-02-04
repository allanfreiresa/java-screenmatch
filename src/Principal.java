import br.com.alura.screenmatch.calculos.CalculadoraDeTempo;
import br.com.alura.screenmatch.calculos.FiltroRecomendacao;
import br.com.alura.screenmatch.modelos.Episodio;
import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
//package br.com.alura.testes;
public class Principal {
    public static void main(String[] args) {


        Filme favorito = new Filme();
        favorito.setNome("The Matrix");
        favorito.setAnoDeLancamento(1999);
        favorito.setDuracaoEmMinutos(135);
        favorito.setIncluidoNoPlano(true);
        //System.out.println(favorito.getNome());

        Filme outro = new Filme();

        outro.setNome("John Wick");
        outro.setAnoDeLancamento(2014);
        outro.setDuracaoEmMinutos(101);
        outro.setIncluidoNoPlano(true);

        Serie serie = new Serie();
        serie.setNome("La Casa de Papel");
        serie.setAnoDeLancamento(2017);
        serie.setIncluidoNoPlano(true);
        serie.setAtiva(true);
        serie.setTemporadas(5);
        serie.setEpisodiosPorTemporada(10);
        serie.setMinutosPorEpisodio(45);


        /*CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(favorito);
        calculadora.inclui(outro);
        calculadora.inclui(serie);

        System.out.println("Tempo total: " +calculadora.getTempoTotal());

        FiltroRecomendacao filtro = new FiltroRecomendacao();
         filtro.filtra(favorito);

        Episodio episodio = new Episodio();

        episodio.setNumero(1);
        episodio.setSerie(serie);
        episodio.setTotalVisualizacoes(300);
        filtro.filtra(episodio);

        System.out.println(episodio.getSerie());*/


        Episodio primeiro = new Episodio();
        primeiro.setNumero(1);
        primeiro.setSerie(serie);
        primeiro.setTotalVisualizacoes(300);

        FiltroRecomendacao filtro1 = new FiltroRecomendacao();
        filtro1.filtra(favorito);
        filtro1.filtra(outro);
        filtro1.filtra(primeiro);



/*
        Animal animal = new Animal();

        animal.fazerBarulho();

        Cachorro cachorro = new Cachorro();

        cachorro.buscarOsso();

        cachorro.fazerBarulho();

        Gato gato = new Gato();

        gato.fazerBarulho();*/

        /*ContaBancaria contabancaria = new ContaBancaria();
        contabancaria.setTitular("Allan Freire");
        contabancaria.setNumeroConta(02136);
        contabancaria.setSaldo(500);

        System.out.println("Nome do Titular: " + contabancaria.getTitular());
        System.out.println("Conta do Titular: " + contabancaria.getNumeroConta());
        System.out.println("Saldo do Titular: " + contabancaria.getSaldo());

        contabancaria.setSaldo(800);
        System.out.println("Saldo do Titular: " + contabancaria.getSaldo());

         */

        /*Conta conta = new Conta();

        ContaPoupanca  poupanca = new ContaPoupanca();

        poupanca.saldo = 100;
        System.out.println(poupanca.saldo);*/


        /*IdadePessoa idade = new IdadePessoa();
        idade.setNome("Allan");
        idade.setIdade(17);
        idade.verificaIdade();*/


        /*//Produto produto = new Produto("Celular", 2000.0);

        Produto produto = new Produto();

        produto.setNome("Allan");
        produto.setPreco(2000.0);

        System.out.println("Nome do Produto: " + produto.getNome());
        System.out.println("Preço: " + produto.getPreco());

        produto.aplicarDesconto(10);
       System.out.println("Novo Preço após Desconto: " + produto.getPreco());*/


        //Aluno aluno1 = new Aluno("Lulu", 7.5, 8.0, 9.2);
        //Aluno aluno2 = new Aluno("Karina", 6.8, 7.3, 8.5);

/*
        Aluno aluno1 = new Aluno();
        Aluno aluno2 = new Aluno();

        aluno1.setNome("Lulu");
        aluno2.setNome("Karina");

        aluno1.setNota1(7.5);
        aluno1.setNota2(8.0);
        aluno1.setNota3(9.2);

        aluno2.setNota1(6.8);
        aluno2.setNota2(7.3);
        aluno2.setNota3(8.5);

        System.out.println("Aluno 1:");
        System.out.println("Nome: " + aluno1.getNome());
        System.out.println("Nota 1: " + aluno1.getNota1());
        System.out.println("Nota 2: " + aluno1.getNota2());
        System.out.println("Nota 3: " + aluno1.getNota3());
        System.out.println("Média: " + aluno1.calcularMedia());
        System.out.println();

        System.out.println("Aluno 2:");
        System.out.println("Nome: " + aluno2.getNome());
        System.out.println("Nota 1: " + aluno2.getNota1());
        System.out.println("Nota 2: " + aluno2.getNota2());
        System.out.println("Nota 3: " + aluno2.getNota3());
        System.out.println("Média: " + aluno2.calcularMedia());
*/

        /*Livro livro1 = new Livro();
        livro1.setTitulo("Lógica de Programação");
        livro1.setAutor("Paulo Silveira");

        Livro livro2 = new Livro();
        livro2.setTitulo("A lógica do jogo");
        livro2.setAutor("Marcus Becker");

        livro1.exibirDetalhes();
        livro2.exibirDetalhes();*/


    }
}
/*

Conta c1 = new Conta();
        c1.saldo = 300;
        c1.sacar(100);


Produto produto = new Produto();

produto.nome = "Allan";
produto.descontoParaPix = 50;
produto.preco = 100;
        //produto.precoFinal = 99;

        System.out.println(produto.pegaPrecoFinal(true));


        Pessoa pessoa = new Pessoa();

        pessoa

        pessoa1.nome = "Ana";
        pessoa1.idade = 20;

        System.out.println(pessoa1.nome + " tem " + pessoa1.idade + " anos");

        pessoa1.fazAniversario();

        System.out.println("A idade agora é: " +pessoa1.idade);

        Pessoa pessoa2 = new Pessoa();

        pessoa2.nome = "Carlos";
        pessoa2.idade = 25;

        System.out.println(pessoa2.nome + " tem " + pessoa2.idade + " anos");

        pessoa2.fazAniversario();

        System.out.println("A idade agora é: " +pessoa2.idade);

        Produto produto = new Produto();

        produto.nome = "Allan";
        produto.descontoParaPix = 10.5;
        produto.preco = 100.5;
        produto.precoFinal = 99;

        System.out.println(produto.pegaPrecoFinal(true));

Pessoa pessoa = new Pessoa();
        pessoa.Saudacao();


Calculadora calculadora = new Calculadora();
int resultado = calculadora.dobrarNumero(5);
        System.out.println(resultado);


Musica minhaMusica = new Musica();

minhaMusica.titulo = "Nome da Música";
minhaMusica.artista = "Nome do Artista";
minhaMusica.anoLancamento = 2023;

        minhaMusica.exibeFichaTecnica();

        minhaMusica.avalia(4.5);
        minhaMusica.avalia(3.8);
        minhaMusica.avalia(5.0);

double mediaAvaliacoes = minhaMusica.pegaMedia();
        System.out.println("Média das avaliações: " + mediaAvaliacoes);

Carro meuCarro = new Carro();
meuCarro.modelo = "Gol";
meuCarro.ano = 2021;
meuCarro.cor = "Preto";

        // Exibir ficha técnica
        meuCarro.exibeFichaTecnica();

// Calcular idade do carro
        System.out.println("Idade do carro: " + meuCarro.calculaIdade() + " anos");

Aluno meuAluno = new Aluno();
meuAluno.nome = "Akemi";
meuAluno.idade = 18;

        meuAluno.exibeInformacoes();




    }
*/