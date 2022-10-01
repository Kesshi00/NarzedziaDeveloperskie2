package pl.edu.wszib.lab1;

public class MyFirstClass implements MyFirstInterface, MySecondInterface {

    private String firstField;

    String firstField2;

    public void run(){
        System.out.println("firstField = " + firstField);
        System.out.println("firstField2 = " + firstField2);

    }
}
