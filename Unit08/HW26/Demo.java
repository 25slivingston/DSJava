class Item {
    // private int value;
    int NewValue;
    int value;

    public void setValue(int Newvalue) {
        value = Newvalue;
        // or leave the code be and just write this.value = value
    }

    public int getValue() {
        return value;
    }
}

public class Demo {
    public static void main(String[] args) {
        Item myItem = new Item();
        System.out.print(myItem.getValue() + " | ");
        myItem.setValue(13);
        System.out.println(myItem.getValue());
    }
}

// the output is 0 | 0
// this is because

// ON FINAL
