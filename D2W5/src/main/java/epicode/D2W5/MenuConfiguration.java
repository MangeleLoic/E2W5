package epicode.D2W5;

import epicode.D2W5.entities.Bevanda;
import epicode.D2W5.entities.Menu;
import epicode.D2W5.entities.Pizza;
import epicode.D2W5.entities.Topping;
import epicode.D2W5.entities.Pizza;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class MenuConfiguration {

    @Bean
    public Pizza margherita() {
        return new Pizza("Margherita", 6.50, 1104, List.of("Mozzarella", "Pomodoro"));
    }


    @Bean
    public Pizza prosciuttoFunghi() {
        return new Pizza("Prosciutto e Funghi", 7.50, 1454, List.of("Mozzarella", "Pomodoro", "Prosciutto cotto", "Funghi"));
    }

    @Bean
    public Pizza quattroFormaggi() {
        return new Pizza("4 Formaggi", 8.00, 1715, List.of("Mozzarella", "Gorgonzola", "Stracchino", "Fontina"));
    }
    @Bean
    public Bevanda cocacola() {
        return new Bevanda("Coca Cola", 2.50, 215);
    }
    @Bean
    public Bevanda acqua() {
        return new Bevanda("Acqua (0.70L)", 1.50, 0);
    }
    @Bean
    public Bevanda birra() {
        return new Bevanda("Birra", 3.50, 415);
    }
    @Bean
    public Topping salame() {
        return new Topping("Salame", 1.50);
    }
    @Bean
    public Topping gorgonzola() {
        return new Topping("Gorgonzola", 1.00);
    }
    @Bean
    public Topping wurstel() {
        return new Topping("Coca Cola", 1.50);
    }
    @Bean
    public Menu menu() {
        Menu menu = new Menu();
        menu.addPizza(margherita());
        menu.addPizza(prosciuttoFunghi());
        menu.addPizza(quattroFormaggi());
        menu.addBevanda(cocacola());
        menu.addBevanda(acqua());
        menu.addBevanda(birra());
        menu.addTopping(salame());
        menu.addTopping(wurstel());
        menu.addTopping(gorgonzola());
        return menu;
    }
}
