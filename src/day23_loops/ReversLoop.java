package day23_loops;

public class ReversLoop {
    public static void main(String[] args) {

        String A = "Afghanistan";

        String revers= "";
        for (int i = A.length(); i >=0 ; i--) {
            revers+= A.charAt(i);

        }
        if(A.equals(revers)){
            System.out.println("palindrome");
        }else{
            System.out.println("not palindrome");
        }
        System.out.println(A.equals(revers) ?"palindrome " : "not palindrome" );
    }
}
