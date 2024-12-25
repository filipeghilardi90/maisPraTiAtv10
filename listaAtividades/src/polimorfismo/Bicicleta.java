package polimorfismo;

public class Bicicleta implements IMeioTransporte {
    public void acelerar() {
        System.out.println("Bicicleta está acelerando.");
    }

    public void frear() {
        System.out.println("Bicicleta está freando.");
    }
}
