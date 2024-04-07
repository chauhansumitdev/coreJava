package Inheritance;

public class Main {
    public static void main(String[] args) {
        Parent parent = new Parent();
        parent.advice();

        ChildOne childone = new ChildOne();
        childone.advice();
        childone.reply();

        Parent childTwo = new ChildOne();
        childTwo.advice();
        // childTwo.reply();
    }
}
