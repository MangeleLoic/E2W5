package epicode.D2W5.entities;

import java.util.List;


public class Pizza {
    private String nome;
    private double prezzo;
    private int calorie;
    private List<String> toppings;

    public Pizza( String nome, double prezzo, int calorie , List<String> toppings) {
        this.calorie = calorie;
        this.nome = nome;
        this.prezzo = prezzo;
        this.toppings = toppings;
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

    public List<String> getToppings() {
        return toppings;
    }

    public void setToppings(List<String> toppings) {
        this.toppings = toppings;
    }

    public void addTopping (String topping){
        this.toppings.add(topping);
    }

    @Override
    public String toString() {
        return "Pizza " +  nome +
                ", prezzo: " + prezzo +
                "€" +
                ", toppings: " + toppings +
                " calorie: " + calorie ;


    }
}



