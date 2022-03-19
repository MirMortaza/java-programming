package day23_loops;

public class Palindrome {
    public static void main(String[] args) {
        // palindrome mean the same reading from the beginning and
        // ex : mom  Madam

        String s = "Madam";
        int b =s.length();
        String rev="";
        for (int i = b-1; i >=0 ; i--) {
            rev=rev+s.charAt(i);

        }
        System.out.println(rev);
    }
}
