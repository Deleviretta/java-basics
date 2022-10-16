package pl.edu.wszib.app.lab1task;

public abstract class Shake implements Eatable, Drinkable {

    @Override
    public void eat() {
        drink();
    }
}
