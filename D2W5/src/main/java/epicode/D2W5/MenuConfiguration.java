package epicode.D2W5;

import epicode.D2W5.entities.Bevanda;
import epicode.D2W5.entities.Menu;
import epicode.D2W5.entities.Pizza;
import epicode.D2W5.entities.Topping;
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
        return new Topping("Wurstel", 1.50);
    }
    @Bean
    public Menu menu1() {
        Menu menu1 = new Menu();
        menu1.addPizza(margherita());
        menu1.addPizza(prosciuttoFunghi());
        menu1.addPizza(quattroFormaggi());
        menu1.addBevanda(cocacola());
        menu1.addBevanda(acqua());
        menu1.addBevanda(birra());
        menu1.addTopping(salame());
        menu1.addTopping(gorgonzola());
        menu1.addTopping(wurstel());
        return menu1;
    }
    public Menu menu2() {
        Menu menu2 = new Menu();
        menu2.addPizza(prosciuttoFunghi());
        menu2.addPizza(quattroFormaggi());
        menu2.addBevanda(cocacola());
        menu2.addBevanda(acqua());
        menu2.addBevanda(birra());
        menu2.addTopping(gorgonzola());
        return menu2;
    }
}
