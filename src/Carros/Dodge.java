package Carros;

public class Dodge implements ListaCarro{
    private String modelo = "Challenger SRT Hellcat";
    private String motor = "6.2-liter V-8 engine";
    private String cor = "Branco";

    @Override
    public String toString() {
        return "Dodge{" +
                "Modelo= " + modelo +
                "; Motor= " + motor +
                "; Cor= " + cor  +
                '}';
    }
}
