package polimorfismo;

public class PolimorfismoAbstrato {
    public static void main(String[] args) {
        Animal[] animais = {new Cachorro(), new Gato(), new Vaca()};

        for (Animal animal : animais) {
            animal.emitirSom();
        }
    }
}