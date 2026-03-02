class Item {
    private int value;

    public void setValue(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}

public class this {
    public static void main(String[] args) {
        Item myItem = new Item();
        System.out.println("Before: " + myItem.getValue());
        myItem.setValue(13);
        System.out.println("After: " + myItem.getValue());
    }
}
