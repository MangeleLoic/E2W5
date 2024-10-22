package epicode.D2W5.entities;

public class Bevanda {
    private String nome;
    private double prezzo;
    private int calorie;

    public Bevanda( String nome, double prezzo, int calorie) {
        this.calorie = calorie;
        this.nome = nome;
        this.prezzo = prezzo;
    }

    public int getCalorie() {
        return calorie;
    }

    public void setCalorie(int calorie) {
        this.calorie = calorie;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPrezzo() {
        return prezzo;
    }

    public void setPrezzo(double prezzo) {
        this.prezzo = prezzo;
    }

    @Override
    public String toString() {
        return  nome +
                ", prezzo: " + prezzo +
                "€" +
                " calorie: " + calorie ;

    }
}
