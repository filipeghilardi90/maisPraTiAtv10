package polimorfismo;

public class Cachorro extends Animal {
    @Override
    void emitirSom() {
        System.out.println("O cachorro faz: Au Au");
    }
}
