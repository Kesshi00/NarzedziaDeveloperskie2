package pl.edu.wszib.lab1.myabstract;

public abstract class MyAbstractClass {

    protected String myProtectedfield;


    protected void myProtected(){
        System.out.println("myProtectedField = " + myProtectedfield);
    }

    protected abstract void myAbstract();


}
