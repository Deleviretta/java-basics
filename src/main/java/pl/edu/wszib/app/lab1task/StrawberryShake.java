package pl.edu.wszib.app.lab1task;

public class StrawberryShake extends Shake implements Tasteable {
    @Override
    public void drink() {
        System.out.println("I drink shake ");
    }

    @Override
    public void taste() {
        System.out.println("with strawberry flavor");
    }
}
