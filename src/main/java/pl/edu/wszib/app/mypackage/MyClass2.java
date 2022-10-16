package pl.edu.wszib.app.mypackage;

import pl.edu.wszib.app.MyClass;
import pl.edu.wszib.app.MyInterface;
import pl.edu.wszib.app.MyInterface2;

public class MyClass2 extends MyClass implements MyInterface, MyInterface2 {
//    public MyClass myClass;
    @Override
    public void run() {
        field3 = "Field3 from extended";
        run3();
//        myClass.run4();
    }

    @Override
    public void run2() {

    }
}
