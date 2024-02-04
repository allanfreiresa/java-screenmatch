public class Gato extends Animal {

    public String tipo;

    public void brincarComLaser() {
        System.out.println("Brincando com o laser!");
    }

    @Override
    public void emitirSom() {
        System.out.println("Miau");
    }

    public void arranharMoveis() {
        System.out.println("Gato arranhando móveis");
    }
}