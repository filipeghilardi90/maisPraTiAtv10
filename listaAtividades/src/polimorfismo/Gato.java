package polimorfismo;

public class Gato extends Animal {
    @Override
    void emitirSom() {
        System.out.println("O gato faz: Miau");
    }
}
