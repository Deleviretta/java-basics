package pl.edu.wszib.app.lab2task;

public enum TasteType {
    TRUSKAWKOWY(40), BANANOWY(50), SZPINAKOWY(5),
    CIASTECZKOWY(60), JABLOKOWY(35);

    private final int sweetnessLevel;

    TasteType(final int sweetnessLevel) {
        this.sweetnessLevel = sweetnessLevel;
    }

    public int getSweetnessLevel() {
        return sweetnessLevel;
    }
}
