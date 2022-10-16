package pl.edu.wszib.app;

import pl.edu.wszib.app.mypackage.MyClass2;

public class Application {

    public static void main(String[] args) {
        System.out.println("Hello world");

        String myStaticField = MyClass2.MY_STATIC_FIELD;

        MyClass2 myClass = new MyClass2();
        myClass.field3 = "Field3";
        myClass.field4 = "Field4";

        myClass.run3();
        myClass.run4();

        myClass.run();
    }
}
