package pl.edu.wszib.app.lab1task;

import pl.edu.wszib.app.lab2task.TasteType;

public abstract class Shake implements Eatable, Drinkable {
    protected final int kcal;
    protected final TasteType tasteType;

    protected Shake(final int kcal, TasteType tasteType) {
        this.kcal = kcal;
        this.tasteType = tasteType;
    }

    @Override
    public void eat() {
        drink();
    }
}
