package epicode.D2W5;

import epicode.D2W5.entities.Menu;
import epicode.D2W5.entities.Ordine;
import epicode.D2W5.entities.Pizza;
import epicode.D2W5.entities.Stato;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Component
public class MyRunner implements CommandLineRunner {

    @Autowired
    @Qualifier("menu1")
    private Menu menu;



    @Override
    public void run(String... args) throws Exception {
      Ordine ordine1 = new Ordine(menu, 6,1, LocalDateTime.of(2024,10,17,20,30,00), Stato.SERVITO);
        Ordine ordine2 = new Ordine(menu, 2,5, LocalDateTime.now(), Stato.IN_CORSO);
        System.out.println("Ordine: " + ordine1);
        System.out.println("Ordine: " + ordine2);
    }
}
