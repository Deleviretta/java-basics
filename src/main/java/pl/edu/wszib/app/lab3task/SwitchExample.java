package pl.edu.wszib.app.lab3task;

import pl.edu.wszib.app.lab1task.StrawberryType;

import java.util.Random;

public class SwitchExample {
    public static void main(String[] args) {
        final StrawberryType[] values = StrawberryType.values();
        final int strawberryIndex = new Random().nextInt(0, values.length);
        final StrawberryType strawberryType = values[strawberryIndex];

        System.out.println("Wylosowano " + strawberryType);

        int size = calculateSize(strawberryType);
    }

    //useful when we have external enum that we can't extend ourselves
    //this enum that we have written can be extended
    private static int calculateSize(StrawberryType strawberryType) {
        //switch expressions
        return switch (strawberryType) {
            case ANANASOWA -> 1;
            case HOENYONE -> {
                System.out.println(strawberryType);
                yield 2;
            }
            case POLKA -> extraMethod();
            case KENT, CHRISTINE -> 5;
        };
        //switch statement
//        switch (strawberryType) {
//            case ANANASOWA:
//                return 1;
//            case KENT:
//                return 2;
//            case POLKA:
//                return 3;
//            case HOENYONE:
//                return 4;
//            case CHRISTINE:
//                return 5;
//            default:
//                throw new IllegalStateException("Unexpected value: " + strawberryType);
//        }
//        final int size; //it wasn't always possible to use final
//        switch (strawberryType) {
//            case ANANASOWA:
//                size = 1;
//                System.out.println(strawberryType);
//                break;
//            case HOENYONE:
//                size = 2;
//                System.out.println(strawberryType);
//                break;
//            case CHRISTINE:
//                size = 3;
//                System.out.println(strawberryType);
//                break;
//            case KENT:
//                size = 4;
//                System.out.println(strawberryType);
//                break;
//            case POLKA:
//                size = 5;
//                System.out.println(strawberryType);
//                break;
//        }
//        return size;
    }

    private static int extraMethod() {
        return 3;
    }
}
