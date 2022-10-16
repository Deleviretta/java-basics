package pl.edu.wszib.app.lab1task;

public class StrawberryShake extends Shake implements Tasteable {
    private final StrawberryType strawberryType;
    public StrawberryShake(final int kcal, final StrawberryType strawberryType) {
        super(kcal);
        this.strawberryType = strawberryType;
    }

    @Override
    public void drink() {
        String message = String.format("Pije shake %s, ktora cechuje %s", taste(), strawberryType.getType());
        System.out.println("Pije shake " + taste() + ", ktora cechuje " + strawberryType.getType());
        System.out.println(message);
    }

    @Override
    public String taste() {
        return "truskawkowy";
    }
}
