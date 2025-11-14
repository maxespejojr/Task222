public class VariableDemo {
    // Instance variables (fields)
    int instanceInt;          // defaults to 0
    String instanceString;    // defaults to null
    boolean instanceBool;     // defaults to false

    public void showVariables() {
        // Local variables (must be initialized before use)
        int localInt;          // no default value
        String localString;    // no default value
        boolean localBool;     // no default value

        // Uncommenting the next lines will cause compile errors:
        // System.out.println(localInt);     // ERROR: variable might not have been initialized
        // System.out.println(localString);  // ERROR
        // System.out.println(localBool);    // ERROR

        // Proper initialization before use
        localInt = 42;
        localString = "Hello Local";
        localBool = true;

        System.out.println("Instance int: " + instanceInt);       // prints 0
        System.out.println("Instance String: " + instanceString); // prints null
        System.out.println("Instance boolean: " + instanceBool);  // prints false

        System.out.println("Local int: " + localInt);             // prints 42
        System.out.println("Local String: " + localString);       // prints Hello Local
        System.out.println("Local boolean: " + localBool);        // prints true
    }

    public static void main(String[] args) {
        VariableDemo demo = new VariableDemo();
        demo.showVariables();
    }
}