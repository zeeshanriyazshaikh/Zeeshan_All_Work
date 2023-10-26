//INSTANCE BLOCK EXAMPLE
public class MyClass {
    int x; // Instance variable

    {
        // This is an instance block, it initializes 'x' when an object is created
        x = 10;
    }

    public void printX() {
        System.out.println("Value of x: " + x);
    }

    public static void main(String[] args) {
        MyClass obj = new MyClass(); // Creating an object
        obj.printX(); // Output: Value of x: 10
    }
}

//STATIC BLOCK EXAMPLE
public class MyClass {
    static int y; // Static variable

    static {
        // This is a static block, it initializes 'y' when the class is loaded
        y = 20;
    }

    public static void printY() {
        System.out.println("Value of y: " + y);
    }

    public static void main(String[] args) {
        MyClass.printY(); // Output: Value of y: 20
    }
}
