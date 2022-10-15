package pl.edu.wszib.zadankolab1;

public enum RodzajSmaku {

    TRUSKAWKOWY("Slodki"),
    BANANOWY("Bananowy"),
    SZPINAKOWY("Dla odwaznych"),
    CIASTECZOWY("Cookie!"),
    JABLKOWY("Jak slodko!");

    private String cecha;

    RodzajSmaku(String cecha) {
        this.cecha = cecha;
    }

    public void setCecha(String cecha) {
        this.cecha = cecha;
    }
}


