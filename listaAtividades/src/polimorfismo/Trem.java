package polimorfismo;

public class Trem implements IMeioTransporte {
    public void acelerar() {
        System.out.println("Trem está acelerando.");
    }

    public void frear() {
        System.out.println("Trem está freando.");
    }
}

