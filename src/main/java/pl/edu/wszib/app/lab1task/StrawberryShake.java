package pl.edu.wszib.app.lab1task;

public class StrawberryShake extends Shake implements Tasteable {
    private final StrawberryType strawberryType;
    public StrawberryShake(final int kcal, final StrawberryType strawberryType) {
        super(kcal);
        this.strawberryType = strawberryType;
    }

    @Override
    public void drink() {
        System.out.println("I drink shake ");
    }

    @Override
    public void taste() {
        System.out.println("with strawberry flavor");
    }
}
