package day19_Class_Vs_object_String;

public class StringComparison {
    public static void main(String[] args) {
        String city = "Falls church";
        System.out.println(city.equals("Falls church"));   //ture
        System.out.println(city.equals("falls church"));   //false
        System.out.println(city.equals("Falls church "));

        System.out.println(city.equalsIgnoreCase("FALLS CHURCH"));
        System.out.println(city.equalsIgnoreCase("FALLS church"));
        System.out.println(city.equalsIgnoreCase("fallschurch"));
        System.out.println(city.equalsIgnoreCase("falls   church"));
        System.out.println("equalignorcase()true");
    }
}
