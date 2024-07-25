public class CustomFunctionalInterface {

    @FunctionalInterface
    interface Greeting{
        void sayHello( String name);
    }

    public static void main(String[] args) {
        Greeting greeting = (name -> System.out.println("Hello " +name));
        greeting.sayHello("sumit");
    }



}
