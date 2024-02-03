import br.com.alura.screenmatch.modelos.Filme;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
//package br.com.alura.testes;
public class Principal {
    public static void main(String[] args) {

        Filme favorito = new Filme();

        favorito.setNome("O Poderoso Chefão");
        favorito.setAnoDeLancamento(1970);
        favorito.setDuracaoEmMinutos(180);
        favorito.setIncluidoNoPlano(true);

        favorito.exibeFichaTecnica();
        favorito.avalia(9);
        favorito.avalia(8);
        favorito.avalia(7);

        System.out.println("Média de avaliações do filme: " +favorito.pegaMedia());
        System.out.println(favorito.getNome());


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