package Inheritance;

class Animal {
    String color;

    public Animal(String color) {
        this.color = color;
    }

    void displayColor() {
        System.out.println("Color: " + color);
    }
}

class Dog extends Animal {
    String breed;

    public Dog(String color, String breed) {
        super(color); 
        this.breed = breed;
    }

    void displayDetails() {
        System.out.println("Breed: " + breed);
        super.displayColor(); 
    }
}

public class Super {
    public static void main(String[] args) {
        Dog dog = new Dog("Brown", "Labrador");
        dog.displayDetails();
    }
}
