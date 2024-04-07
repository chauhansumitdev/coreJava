package OOP;

public class Object {
    public static void main(String[] args) {
        Class obj = new Class("This has some name");

        System.out.println(obj.someName); // would have not been able to acess if it would have been private.
        System.out.println(obj.getSomeName());
    }
}

// public class ObjectTwo {
//     public static void mainFunc(String[] args) {
//         Class obj = new Class("This has some name");

//         System.out.println(obj.someName); // would have not been able to acess if it would have been private.
//         System.out.println(obj.getSomeName());
//     }
// }

// cannot make two public class work in the same file
// either make them unpublic or remove one
// if both have no public specifier and both contain the main method the compiler will ask for specific exec.


