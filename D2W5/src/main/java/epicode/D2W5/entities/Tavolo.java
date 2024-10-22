package epicode.D2W5.entities;

public class Tavolo {
    private int numeroTavolo;
    private int coperti;
    private boolean isOccupato;

    public Tavolo(int coperti, boolean isOccupato, int numeroTavolo) {
        this.coperti = coperti;
        this.isOccupato = false;
        this.numeroTavolo = numeroTavolo;
    }

    public int getCoperti() {
        return coperti;
    }

    public void setCoperti(int coperti) {
        this.coperti = coperti;
    }

    public boolean isOccupato() {
        return isOccupato;
    }

    public void setOccupato(boolean occupato) {
        this.isOccupato = occupato;
    }

    public int getNumeroTavolo() {
        return numeroTavolo;
    }

    public void setNumeroTavolo(int numeroTavolo) {
        this.numeroTavolo = numeroTavolo;
    }

    @Override
    public String toString() {
        return "Tavolo " +
        numeroTavolo +
                "coperti: " + coperti +
                ", Occupato? " + isOccupato
                ;
    }
}
