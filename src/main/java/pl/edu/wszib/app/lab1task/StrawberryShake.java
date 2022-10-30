package pl.edu.wszib.app.lab1task;

import pl.edu.wszib.app.lab2task.TasteType;
import pl.edu.wszib.app.lab3task.TasteSource;

public class StrawberryShake extends FlavoredShake {
    private static final TasteType STRAWBERRY_TASTE_TYPE = TasteType.TRUSKAWKOWY;
    private static final TasteSource TASTE_SOURCE = TasteSource.OWOCOWY;
    private final StrawberryType strawberryType;

    public StrawberryShake(final int kcal, final StrawberryType strawberryType) {
        super(kcal, STRAWBERRY_TASTE_TYPE, TASTE_SOURCE);
        this.strawberryType = strawberryType;
    }

    @Override
    public void drink() {
//        String tasteSource = calculateTasteSourceSwitchStatement(getTasteSource());
        String tasteSource = calculateTasteSourceSwitchExpression(getTasteSource());

        String message = String.format("Pije shake %s %s, ktora cechuje %s oraz slodkosc %s", tasteSource, taste(),
                strawberryType.getType(), tasteType().getSweetnessLevel());
//        System.out.println("Pije shake " + taste() + ", ktora cechuje " + strawberryType.getType()
//                + " oraz slodkosc " + sweetnessLevel());
        System.out.println(message);
    }

    private String calculateTasteSourceSwitchExpression(TasteSource tasteSource) {
        return switch (tasteSource) {
            case OWOCOWY, WARZYWNY, INNY -> tasteSource.getTasteSource();
        };
    }

    private String calculateTasteSourceSwitchStatement(TasteSource tasteSource) {
        switch (tasteSource) {
            case OWOCOWY:
            case WARZYWNY:
            case INNY:
                return tasteSource.getTasteSource();
            default:
                throw new IllegalStateException("Unexpected state: " + tasteSource);
        }
    }

//    @Override
//    public String taste() {
//        return "truskawkowy";
//    }

    private int sweetnessLevel() {
        return tasteType().getSweetnessLevel();
    }
}
