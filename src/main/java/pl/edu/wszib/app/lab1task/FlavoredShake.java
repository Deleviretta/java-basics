package pl.edu.wszib.app.lab1task;

import pl.edu.wszib.app.lab2task.TasteType;
import pl.edu.wszib.app.lab3task.TasteSource;

public abstract class FlavoredShake extends Shake implements Tasteable {
    private final TasteType tasteType;
    private final TasteSource tasteSource;

    protected FlavoredShake(final int kcal, final TasteType tasteType, final TasteSource tasteSource) {
        super(kcal);
        this.tasteType = tasteType;
        this.tasteSource = tasteSource;
    }

    @Override
    public TasteType tasteType() {
        return tasteType;
    }

    @Override
    public String taste() {
        return tasteType.getDescription();
    }

    public TasteSource getTasteSource() {
        return tasteSource;
    }
}
