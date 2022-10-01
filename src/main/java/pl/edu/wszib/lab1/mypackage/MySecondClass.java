package pl.edu.wszib.lab1.mypackage;

import pl.edu.wszib.lab1.myabstract.MyAbstractClass;

public class MySecondClass extends MyAbstractClass {

    private String firstField;

    String firstField2;


    public void run(){
        System.out.println("firstField = " + firstField);
        System.out.println("firstField2 = " + firstField2);
        myProtectedfield = "Test";

    }

    @Override
    protected void myAbstract() {
        System.out.println("firstField = " + firstField);
        System.out.println("firstField2 = " + firstField2);
    }
}
