package epicode.D2W5;

import epicode.D2W5.entities.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDateTime;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;


@SpringBootTest
class D2W5ApplicationTests {

	@Test
	void contextLoads() {
	}

	@Test
	public void testCalcolaTotale() {
		Pizza margherita = new Pizza("Margherita", 6.50, 1104, List.of("Mozzarella", "Pomodoro"));
		Menu menu = new Menu();
		menu.addPizza(margherita);

		Ordine ordine = new Ordine(menu, 2, 1, LocalDateTime.now(), Stato.IN_CORSO);

		double expectedTotal = (6.50 + (1.5 * 2));
		assertEquals(expectedTotal, ordine.getTotale());
	}

	@ParameterizedTest
	@CsvSource({
			"1, 8.00",
			"2, 9.50",
			"3, 11.00"
	})
	public void testCalcolaTotaleParametrico(int coperti, double expectedTotal) {
		Pizza margherita = new Pizza("Margherita", 6.50, 1104, List.of("Mozzarella", "Pomodoro"));
		Menu menu = new Menu();
		menu.addPizza(margherita);

		Ordine ordine = new Ordine(menu, coperti, 1, LocalDateTime.now(), Stato.IN_CORSO);
		assertEquals(expectedTotal, ordine.getTotale());
	}

	@ParameterizedTest
	@CsvSource({
			"4, true",
			"2, false",
			"6, true"
	})
	public void testTavoloOccupato(int coperti, boolean expectedStatus) {
		Tavolo tavolo = new Tavolo(coperti, expectedStatus, 1);
		tavolo.setOccupato(expectedStatus);
		assertEquals(expectedStatus, tavolo.isOccupato());
		assertEquals(coperti, tavolo.getCoperti());
	}

	private Menu menu;

	@BeforeEach
	public void setup() {
		menu = new Menu();
		Pizza margherita = new Pizza("Margherita", 6.50, 1104, List.of("Mozzarella", "Pomodoro"));
		Pizza quattroFormaggi = new Pizza("4 Formaggi", 8.00, 1715, List.of("Mozzarella", "Gorgonzola"));
		Bevanda acqua = new Bevanda("Acqua", 1.50, 0);
		Topping salame = new Topping("Salame", 1.50);

		menu.addPizza(margherita);
		menu.addPizza(quattroFormaggi);
		menu.addBevanda(acqua);
		menu.addTopping(salame);
	}

	@Test
	public void testCalcoloTotaleConPizze() {

		Menu menu = new Menu();
		Pizza margherita = new Pizza("Margherita", 6.50, 1104,List.of("Mozzarella", "Pomodoro"));
		Pizza quattroFormaggi = new Pizza("4 Formaggi", 8.00, 1715,List.of("Mozzarella", "Gorgonzola", "Stracchino", "Fontina"));
		menu.addPizza(margherita);
		menu.addPizza(quattroFormaggi);


		Ordine ordine = new Ordine(menu, 4, 1, LocalDateTime.now(), Stato.IN_CORSO);


		double totaleAtteso = (6.50 + 8.00) + (4 * 1.50);


		assertEquals(totaleAtteso, ordine.getTotale(), "Il totale calcolato non è corretto");
	}

	@Test
	public void testMenuInizializzazioneCompleta() {
		assertEquals(2, menu.getPizze().size());
		assertEquals(1, menu.getBevande().size());
		assertEquals(1, menu.getToppings().size());
	}

}
