package pl.edu.wszib.lab1;

import pl.edu.wszib.lab1.mypackage.MySecondClass;

public class Application {
    public static void main(String[] args) {

        MyFirstClass myFirstClass = new MyFirstClass();
        myFirstClass.firstField2 = "Test";
        myFirstClass.run();

        MySecondClass mySecondClass = new MySecondClass();
        mySecondClass.run();




    }
}

