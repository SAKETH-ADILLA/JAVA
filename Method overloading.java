public class MethodOverloading {

    // Method with one integer parameter
    public void display(int a) {
        System.out.println("Method with integer parameter: " + a);
    }

    // Overloaded method with two integer parameters
    public void display(int a, int b) {
        System.out.println("Method with two integer parameters: " + a + ", " + b);
    }

    // Overloaded method with one double parameter
    public void display(double a) {
        System.out.println("Method with double parameter: " + a);
    }

    // Overloaded method with one String parameter
    public void display(String a) {
        System.out.println("Method with String parameter: " + a);
    }

    public static void main(String[] args) {
        MethodOverloading example = new MethodOverloading();
        
        // Calling the method with different parameters
        example.display(5);            // Calls method with int parameter
        example.display(10, 20);       // Calls method with two int parameters
        example.display(3.14);         // Calls method with double parameter
        example.display("Hello");      // Calls method with String parameter
    }
}
