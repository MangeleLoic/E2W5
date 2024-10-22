package epicode.D2W5.entities;

public class Topping {
    private String nome;
    private double prezzo;

    public Topping(String nome, double prezzo) {
        this.nome = nome;
        this.prezzo = prezzo;
    }

    public double getPrezzo() {
        return prezzo;
    }

    public void setPrezzo(double prezzo) {
        this.prezzo = prezzo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return nome +
                ", prezzo: " + prezzo +
                "€"
                ;
    }
}

