package OOP;

class Class {
    String someName; // restrict its access using private or other encapsulation

    Class(String someName){
        this.someName = someName;
    }

    String getSomeName(){
        return someName;
    }
}
