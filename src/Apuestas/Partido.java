package Apuestas;

public class Partido {


    //ATRIBUTOS

    private int dobles;
    private int triples;
    private int apuestas;

    //CONSTRUCTOR

    public Partido(int dobles, int triples, int apuestas) {
        this.dobles = dobles;
        this.triples = triples;
        this.apuestas = apuestas;
    }

    //GS

    //OM

    //TOSTRING


    @Override
    public String toString() {
        return "Partido{" +
                "dobles=" + dobles +
                ", triples=" + triples +
                ", apuestas=" + apuestas +
                '}';
    }
}
