package day21_string_Manipulation;

public class Amazon {
    public static void main(String[] args) {
        String result = "1-48 of over 4,000 results for java book";
        result= result.replace("1-48 of over","").replace(",","").replace("result for java book","");
        System.out.println("result = " + result);

        int count = Integer.parseInt(result);

    }
}
