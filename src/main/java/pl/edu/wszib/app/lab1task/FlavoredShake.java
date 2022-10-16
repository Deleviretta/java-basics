package pl.edu.wszib.app.lab1task;

import pl.edu.wszib.app.lab2task.TasteType;

public abstract class FlavoredShake extends Shake implements Tasteable {
    private final TasteType tasteType;

    protected FlavoredShake(final int kcal, final TasteType tasteType) {
        super(kcal);
        this.tasteType = tasteType;
    }

    @Override
    public TasteType tasteType() {
        return tasteType;
    }

    @Override
    public String taste() {
        return tasteType.getDescription();
    }
}
