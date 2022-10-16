package pl.edu.wszib.app.lab1task;

import pl.edu.wszib.app.lab2task.TasteType;

public class StrawberryShake extends FlavoredShake {
    private static final TasteType STRAWBERRY_TASTE_TYPE = TasteType.TRUSKAWKOWY;
    private final StrawberryType strawberryType;

    public StrawberryShake(final int kcal, final StrawberryType strawberryType) {
        super(kcal, STRAWBERRY_TASTE_TYPE);
        this.strawberryType = strawberryType;
    }

    @Override
    public void drink() {
        String message = String.format("Pije shake %s, ktora cechuje %s", taste(), strawberryType.getType() +
                " oraz slodkosc " + tasteType().getSweetnessLevel());
        System.out.println("Pije shake " + taste() + ", ktora cechuje " + strawberryType.getType()
                + " oraz slodkosc " + sweetnessLevel());
        System.out.println(message);
    }

//    @Override
//    public String taste() {
//        return "truskawkowy";
//    }

    private int sweetnessLevel() {
        return tasteType().getSweetnessLevel();
    }
}
