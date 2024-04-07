interface MyInterface {
    void myMethod(String s);
}

public class Lambda {
    public static void main(String[] args) {
        MyInterface myInterface = (s) -> System.out.println("Hello, " + s);
        myInterface.myMethod("world");
    }
}
