public class InstanceDemo {

    // Instance Variables with and without Constructor Initialization
   
    // Instance variables (fields)
    int number;          // defaults to 0
    String text;         // defaults to null
    boolean flag;        // defaults to false

    // Constructor to explicitly set values
    public InstanceDemo(int number, String text, boolean flag) {
        this.number = number;
        this.text = text;
        this.flag = flag;
    }
    // Method to display values
    public void display() {
        System.out.println("number = " + number);
        System.out.println("text = " + text);
        System.out.println("flag = " + flag);
        System.out.println("-------------------");
    }

    public static void main(String[] args) {
        // Object created without setting values (defaults apply)
        InstanceDemo defaultDemo = new InstanceDemo(0, null, false);
        defaultDemo.display(); // prints 0, null, false

        // Constructor Object created with explicit values
        InstanceDemo customDemo = new InstanceDemo(42, "Hello World", true);
        customDemo.display(); // prints 42, Hello World, true
    }
}

