package epicode.D2W5.entities;

import java.time.LocalDateTime;
import java.util.List;

public class Ordine {
    private int numeroOrdine;
    private Stato stato;
    private int numeroCoperti;
    private LocalDateTime oraPrenotazione;
    private Menu menu;
    private double totale;

    public Ordine(Menu menu, int numeroCoperti, int numeroOrdine, LocalDateTime oraPrenotazione, Stato stato) {
        this.menu = menu;
        this.numeroCoperti = numeroCoperti;
        this.numeroOrdine = numeroOrdine;
        this.oraPrenotazione = oraPrenotazione;
        this.stato = stato;
        calcolaTotale();
    }
    private void calcolaTotale() {
        double coperto = 1.50;
        this.totale = menu.getPizze().stream().mapToDouble(Pizza::getPrezzo).sum() +
                menu.getBevande().stream().mapToDouble(Bevanda::getPrezzo).sum() +
                menu.getToppings().stream().mapToDouble(Topping::getPrezzo).sum() +
                (coperto * numeroCoperti);
    }

    public Menu getMenu() {
        return menu;
    }

    public void setMenu(Menu menu) {
        this.menu = menu;
    }

    public int getNumeroCoperti() {
        return numeroCoperti;
    }

    public void setNumeroCoperti(int numeroCoperti) {
        this.numeroCoperti = numeroCoperti;
    }

    public int getNumeroOrdine() {
        return numeroOrdine;
    }

    public void setNumeroOrdine(int numeroOrdine) {
        this.numeroOrdine = numeroOrdine;
    }

    public LocalDateTime getOraPrenotazione() {
        return oraPrenotazione;
    }

    public void setOraPrenotazione(LocalDateTime oraPrenotazione) {
        this.oraPrenotazione = oraPrenotazione;
    }

    public Stato getStato() {
        return stato;
    }

    public void setStato(Stato stato) {
        this.stato = stato;
    }

    public double getTotale() {
        return totale;
    }

    @Override
    public String toString() {
        return "Ordine" +
                numeroOrdine +
                "menu=" + menu +
                ", stato: " + stato +
                ", numeroCoperti: " + numeroCoperti +
                ", oraPrenotazione: " + oraPrenotazione +
                ", totale: " + totale
                ;
    }
}
