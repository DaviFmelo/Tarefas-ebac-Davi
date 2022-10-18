package Carros;

public class Pagani implements ListaCarro {
    private String modelo = "Zonda R";
    private String motor = "6.0 V12 de 739 cavalos de potência";
    private String cor = "Preto";

    @Override
    public String toString() {
        return "Pagani{" +
                "Modelo= " + modelo +
                "; Motor= " + motor +
                "; Cor= " + cor +
                '}';
    }
}
