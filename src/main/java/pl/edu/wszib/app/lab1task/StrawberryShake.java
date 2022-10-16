package pl.edu.wszib.app.lab1task;

import pl.edu.wszib.app.lab2task.TasteType;

public class StrawberryShake extends Shake implements Tasteable {
    private final StrawberryType strawberryType;
    private final TasteType tasteType;
    public StrawberryShake(final int kcal, final StrawberryType strawberryType) {
        super(kcal);
        this.strawberryType = strawberryType;
        this.tasteType = TasteType.TRUSKAWKOWY;
    }

    @Override
    public void drink() {
        String message = String.format("Pije shake %s, ktora cechuje %s", taste(), strawberryType.getType() +
                " oraz slodkosc " + tasteType().getSweetnessLevel());
        System.out.println("Pije shake " + taste() + ", ktora cechuje " + strawberryType.getType()
                + " oraz slodkosc " + tasteType().getSweetnessLevel());
        System.out.println(message);
    }

    @Override
    public String taste() {
        return "truskawkowy";
    }

    @Override
    public TasteType tasteType() {
        return tasteType;
    }

    private int sweetnessLevel() {
        tasteType().getSweetnessLevel();
    }
}
