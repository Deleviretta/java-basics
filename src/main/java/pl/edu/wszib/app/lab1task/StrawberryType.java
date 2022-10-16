package pl.edu.wszib.app.lab1task;

public enum StrawberryType {
    ANANASOWA("biale owoce"), HOENYONE("wyrazista"), POLKA("najsmaczniejsza"),
    KENT("Dla fanow slodyczy"), CHRISTINE("Zaowocuje szybko i obficie");

    private final String trait;
    StrawberryType(final String trait) {
        this.trait = trait;
    }
}
