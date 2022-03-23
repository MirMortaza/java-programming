package day34_Return_Type_Methode;

public class VoidVSReturn {
    public static void main(String[] args) {
        sayhello();

        sayBye();
        System.out.println(sayBye());

        String msg = sayBye();
        System.out.println(msg);
    }
   public static void sayhello(){
       System.out.println("Hello");
   }

   public static String sayBye(){
        return "Bye";
   }
}
