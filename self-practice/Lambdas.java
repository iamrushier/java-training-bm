
// @FunctionalInterface
interface A {

    void show();

    String toString(); // Method from Object class is allowed
    // void show(int a);
}

// class B implements A {
//     public void show() {
//         System.out.println("Hello");
//     }
// }
class Lambdas {

    public static void main(String[] args) {

        // Anonymous inner class
        // A a = new A() {
        //     public void show() {
        //         System.out.println("Hi");
        //     }
        // };
        // Lambda expression
        A a = () -> System.out.println("Hi");
        a.show();
    }
}
