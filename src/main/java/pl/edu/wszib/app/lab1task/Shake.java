package pl.edu.wszib.app.lab1task;

import pl.edu.wszib.app.lab2task.TasteType;

public abstract class Shake implements Eatable, Drinkable {
    protected final int kcal;

    protected Shake(final int kcal) {
        this.kcal = kcal;
    }

    @Override
    public void eat() {
        drink();
    }
}
