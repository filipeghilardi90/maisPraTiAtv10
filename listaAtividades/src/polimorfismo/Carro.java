package polimorfismo;

public class Carro implements IMeioTransporte {
    public void acelerar() {
        System.out.println("Carro está acelerando.");
    }

    public void frear() {
        System.out.println("Carro está freando.");
    }
}

