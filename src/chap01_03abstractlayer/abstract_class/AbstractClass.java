package chap01_03abstractlayer.abstract_class;

public abstract class AbstractClass {
    public void implmentedMethod(){
        System.out.println("AbstractClass implmentedMethod");
        this.abstractMethod();
    }

    abstract public void abstractMethod();
}
