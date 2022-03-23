package day33_VoidMethods;

public class MyFirstMethod {
    public static void helloWorld(){
        System.out.println("Hello world");

    }
    public static void helloWord50(){
        for (int i = 0; i < 50; i++) {
            System.out.println("hello world");

        }
    }

    public static void main(String[] args) {
        helloWorld();
        helloWord50();
    }
}
