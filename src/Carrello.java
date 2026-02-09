import java.util.Arrays;

public class Carrello {
    private double prezzoFinale;
    private Articolo[] articoli;

    public Carrello(Articolo[] articoli) {
        setArticoli(articoli);
    }

    public double getPrezzoFinale() {
        return prezzoFinale;
    }

    public Articolo[] getArticoli() {
        return articoli;
    }

    public void setArticoli(Articolo[] articoli) {
        this.articoli = articoli;
        this.prezzoFinale = 0;
        for (Articolo articolo : articoli) prezzoFinale += articolo.getPrezzo();
    }

    @Override
    public String toString() {
        return "Carrello{" +
                "prezzoFinale=" + prezzoFinale +
                ", articoli=" + Arrays.toString(articoli) +
                '}';
    }
}
