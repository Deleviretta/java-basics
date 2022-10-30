package pl.edu.wszib.app.lab1task;

import pl.edu.wszib.app.lab2task.TasteType;
import pl.edu.wszib.app.lab3task.TasteSource;

import java.util.Locale;

public abstract class FlavoredShake extends Shake implements Tasteable {
    private final TasteType tasteType;
    private final TasteSource tasteSource;

    protected FlavoredShake(final int kcal, final TasteType tasteType, final TasteSource tasteSource) {
        super(kcal);
        this.tasteType = tasteType;
        this.tasteSource = tasteSource;
    }
     protected FlavoredShake(final int kcal, final TasteType tasteType) {
        super(kcal);
        this.tasteType = tasteType;
        this.tasteSource = calculateTasteSourceFromTasteType();
     }

    private TasteSource calculateTasteSourceFromTasteType() {
        return switch (tasteType) {
            case TRUSKAWKOWY, BANANOWY, JABLOKOWY -> TasteSource.OWOCOWY;
            case SZPINAKOWY -> TasteSource.WARZYWNY;
            case CIASTECZKOWY -> TasteSource.INNY;
        };
        //        switch (tasteType) {
//            case TRUSKAWKOWY, BANANOWY, JABLOKOWY:
//                return TasteSource.OWOCOWY;
//            case SZPINAKOWY:
//                return TasteSource.WARZYWNY;
//            case CIASTECZKOWY:
//                return TasteSource.INNY;
//            default:
//                throw new IllegalStateException("Unexpected type: " + tasteType);
//        }
    }

    @Override
    public TasteType tasteType() {
        return tasteType;
    }

    @Override
    public String taste() {
        return tasteType.getDescription();
    }

    public String getTasteSource() {
        return calculateTasteSourceSwitchStatement(tasteSource);
        //        return calculateTasteSourceSwitchExpression(tasteSource);
    }

    private String calculateTasteSourceSwitchExpression(TasteSource tasteSource) {
        return switch (tasteSource) {
            case OWOCOWY, WARZYWNY, INNY -> tasteSource.name().toLowerCase(Locale.ENGLISH);
            //tasteSource.getTasteSource();
        };
    }

    private String calculateTasteSourceSwitchStatement(TasteSource tasteSource) {
        switch (tasteSource) {
            case OWOCOWY:
            case WARZYWNY:
            case INNY:
                return tasteSource.name().toLowerCase(Locale.ENGLISH);
            //return tasteSource.getTasteSource();
            default:
                throw new IllegalStateException("Unexpected state: " + tasteSource);
        }
    }
}
