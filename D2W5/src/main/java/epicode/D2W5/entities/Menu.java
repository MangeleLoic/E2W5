package epicode.D2W5.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;


public class Menu {
    private List<Pizza> pizze;
    private List<Bevanda> bevande;
    private List<Topping> toppings;

    public Menu() {
        this.pizze = new ArrayList<>();
        this.bevande = new ArrayList<>();
        this.toppings = new ArrayList<>();
    }
    public void addPizza(Pizza pizza){
        this.pizze.add(pizza);
    }
    public  void addBevanda(Bevanda bevanda){
        this.bevande.add(bevanda);
    }
    public void addTopping (Topping topping){
        this.toppings.add(topping);
    }

    public List<Bevanda> getBevande() {
        return bevande;
    }

    public List<Pizza> getPizze() {
        return pizze;
    }

    public List<Topping> getToppings() {
        return toppings;
    }

    @Override
    public String toString() {
        return "Menu{" +
                "bevande=" + bevande +
                ", pizze=" + pizze +
                ", toppings=" + toppings +
                '}';
    }

    public void stampaMenu(){
        System.out.println("Pizze: ");
        for (Pizza pizza: pizze) {
            System.out.println(pizza);
        }
        System.out.println("      ");
        System.out.println("Toppings: ");
        for (Topping topping: toppings) {
            System.out.println(topping);
        }
        System.out.println("      ");
        System.out.println("Bevande: ");
        for (Bevanda bevanda: bevande) {
            System.out.println(bevanda);
        }
    }
}

