//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public static void main (String[] args) {
    Articolo article1 = new Articolo("Pizza", 3.99);
    Articolo article2 = new Articolo("Coca cola", 0.99);

    Carrello carrello = new Carrello(new Articolo[] {article1, article2});
    System.out.println("Numero di articoli: " + carrello.getArticoli().length);
    System.out.println("Prezzo finale: " + carrello.getPrezzoFinale());

}
