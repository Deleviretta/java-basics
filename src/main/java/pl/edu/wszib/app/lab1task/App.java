package pl.edu.wszib.app.lab1task;

public class App {
    public static void main(String[] args) {
        int strawberryShakeKcal = 100;
        StrawberryShake shake = new StrawberryShake(strawberryShakeKcal, StrawberryType.HOENYONE);

        shake.drink();
        shake.taste();

//        StrawberryType strawberry = StrawberryType.ANANASOWA;
//        switch (strawberry) {
//            case ANANASOWA:
//                break;
//            case KENT:
//                break;
//            case POLKA:
//                break;
//            case HOENYONE:
//                break;
//            case CHRISTINE:
//                break;
//        }
    }
}
