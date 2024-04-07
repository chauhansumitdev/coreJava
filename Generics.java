
class Box<T> {
    private T item;

    public void setItem(T item) {
        this.item = item;
    }

    public T getItem() {
        return item;
    }
}

public class Generics{
    public static void main(String[] args) {
        Box<Integer> box = new Box<>();
        box.setItem(100);
        System.out.println(box.getItem());
    }
}