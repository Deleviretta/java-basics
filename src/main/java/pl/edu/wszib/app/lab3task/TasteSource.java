package pl.edu.wszib.app.lab3task;

public enum TasteSource {
    OWOCOWY("owocowy"), WARZYWNY("warzywny"), INNY("inny");

    private String tasteSource;

    TasteSource(String tasteSource) {
        this.tasteSource = tasteSource;
    }

    public String getTasteSource() {
        return tasteSource;
    }
}
