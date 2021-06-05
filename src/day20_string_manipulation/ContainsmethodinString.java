package day20_string_manipulation;

public class ContainsmethodinString {
    public static void main(String[] args) {
        String word = "java";
        System.out.println(word.contains("v"));
        System.out.println(word.contains("va"));
        System.out.println(word.contains("ja"));
        System.out.println(word.contains("a"));
        System.out.println(word.contains("jv"));
        System.out.println(word.contains("jav"));

        if(word.contains(" ")){
            System.out.println("multiple words java name");
        }else {
            System.out.println("single word java name");
        }
        String etsytitle = "wooden spoon | Etsy";
       if(etsytitle.contains(" | ")){
           System.out.println("pass - title check passed  ");
       }else {
           System.out.println("fail - title check failed ");
       }
       String firstname = "mir";
       if(firstname.contains("m") && firstname.contains("r")){
           System.out.println("both m &&  r are present");
        }else {
           System.out.println("m || r not present ");
       }
       String email = "mir.sharifullah2@gmail.com";
       if(email.contains("@") && email.endsWith(".com")){
           System.out.println("valid email");
       }else {
           System.out.println("invalid email");
       }

    }
}
