package chap01_02inheritance.extends_;

public class Child extends Parent{

    public void anotherMethod() {
        System.out.println("Chile anotherMethod");

        this.parentPublicInt = 0;
        this.parentProtectedInt = 0;
        // private 변수는 상속이 되지 않는다.
        //this.parentPrivateInt = 0;
    }
}
