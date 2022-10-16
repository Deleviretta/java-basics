package pl.edu.wszib.app.lab2task;

public enum TasteType {
    TRUSKAWKOWY(40, "truskawkowy"), BANANOWY(50, "bananowy"),
    SZPINAKOWY(5, "szpinakowy"), CIASTECZKOWY(60, "ciasteczkowy"),
    JABLOKOWY(35, "jablkowy");

    private final int sweetnessLevel;
    private final String description;

    TasteType(final int sweetnessLevel, String description) {
        this.sweetnessLevel = sweetnessLevel;
        this.description = description;
    }

    public int getSweetnessLevel() {
        return sweetnessLevel;
    }

    public String getDescription() {
        return description;
    }
}
