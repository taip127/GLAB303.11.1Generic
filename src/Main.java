public class Main {
    public static void main(String[] args) {
        // Example 1: Demonstrating Generic Method
        System.out.println("Example: Generic Method\n");

        // Initialize the class with Integer data
        DemoClass dObj = new DemoClass();
        dObj.genericsMethod(25); // Passing int
        dObj.genericsMethod("Per Scholas"); // Passing String
        dObj.genericsMethod(2563.5); // Passing float
        dObj.genericsMethod('H'); // Passing char

        // Example 2: Demonstrating Generic Class
        System.out.println("\nExample: Generic Class\n");

        // Initialize generic class with String and Integer data
        GMultipleDatatype<String, Integer> mobj = new GMultipleDatatype<>("Per Scholas", 11025);
        System.out.println(mobj.getValueOne());
        System.out.println(mobj.getValueTwo());

        // Initialize generic class with String and String data
        GMultipleDatatype<String, String> mobj2 = new GMultipleDatatype<>("Per Scholas", "Non profit");
        System.out.println(mobj2.getValueOne());
        System.out.println(mobj2.getValueTwo());
    }
}

// Class for demonstrating Generic Method
class DemoClass {
    // Create a generics method
    public <T> void genericsMethod(T data) {
        System.out.println("Generics Method:");
        System.out.println("Data Passed: " + data);
    }
}

// Class for demonstrating Generic Class
class GMultipleDatatype<Datatypeone, DatatypeTwo> {
    private Datatypeone valueOne;
    private DatatypeTwo valueTwo;

    public GMultipleDatatype(Datatypeone v1, DatatypeTwo v2) {
        this.valueOne = v1;
        this.valueTwo = v2;
    }

    public Datatypeone getValueOne() {
        return valueOne;
    }

    public void setValueOne(Datatypeone valueOne) {
        this.valueOne = valueOne;
    }

    public DatatypeTwo getValueTwo() {
        return valueTwo;
    }

    public void setValueTwo(DatatypeTwo valueTwo) {
        this.valueTwo = valueTwo;
    }
}
