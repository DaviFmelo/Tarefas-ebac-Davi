package Carros;

public class BMW implements ListaCarro{
    private String modelo = "M3 GTR";
    private String motor = "BMW P60B40 4.0 L V8 engine";
    private String cor = "Cinza";

    @Override
    public String toString() {
        return "\nBMW{" +
                "Modelo= " + modelo +
                "; Motor= " + motor  +
                "; Cor= " + cor  +
                '}';
    }
}
