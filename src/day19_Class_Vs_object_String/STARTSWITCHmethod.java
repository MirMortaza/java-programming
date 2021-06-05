package day19_Class_Vs_object_String;

public class STARTSWITCHmethod {
    public static void main(String[] args) {
        String word = "selenium";
        System.out.println(word.startsWith("s"));  // ture
        System.out.println(word.startsWith("selen")); //false

        String name = "mortaza";
        System.out.println(name.startsWith("mo"));
        System.out.println(name.startsWith("Mor"));
        System.out.println(name.startsWith("Mortaza"));
        System.out.println(name.startsWith("morta"));

        System.out.println(name.endsWith("za"));
        System.out.println(name.endsWith("aza"));
        System.out.println(name.endsWith("mo"));
        System.out.println(name.endsWith("mortaza"));

        String firstname= "Mr mir";
        if(firstname.startsWith("Mr")){
            System.out.println("man");
        }else if(firstname.startsWith(("Mrs"))){
            System.out.println("married woman");
        }else if(firstname.startsWith("Ms")){
            System.out.println("singal woman");
        }else if(firstname.startsWith("Sr")){
            System.out.println("senior");
        }else {
            System.out.println("invalid abbreviation");
        }

        String url = "https://www.irs.com";
        if(url.startsWith("url")){
            System.out.println("russian website");
        }else if (url.endsWith(".com")){
            System.out.println("commercial website");
        }else if (url.endsWith(".gov")){
            System.out.println("government");
        }else if(url.endsWith("org")){
            System.out.println("organization");
        }else {
            System.out.println("wrong website");
        }


    }
}
