package day36_Methods;

public class Picture {

    public static void draw(){
        System.out.println("trying to draw");
    }
    public static void draw(String color ){
        System.out.println("draw with " + color);
    }
    public  static void draw(String color,String color2){
        System.out.println("drawing with color " + color + "and with " + color2);
    }
    public static void draw(int size ){
        System.out.println("drawing witn size "+ size);
    }
    //this is not valid by just changing the parameter name
   // public static void draw(int length ){
      //  System.out.println("drawing witn size "+ );length
}
