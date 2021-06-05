package day19_Class_Vs_object_String;

import java.util.Locale;

public class StringCaseConversion {
    public static void main(String[] args) {
        String name = "Cybertek";
        System.out.println(name.toLowerCase());
        System.out.println(name.toUpperCase());

        System.out.println("mir mortaza".toUpperCase());
        System.out.println("JAVA IS FUN I LIKE TO CODING JAVA!".toLowerCase());

        String wordinlcase = name.toLowerCase();
        System.out.println("wordinlcase = " +wordinlcase);

        name =name.toLowerCase();
        System.out.println("name = " +name);

        String company = "Amazon";
        System.out.println(company.toUpperCase());
        System.out.println("company in uppercase - " +company.toUpperCase());
        System.out.println("java".toUpperCase());
    }
}
