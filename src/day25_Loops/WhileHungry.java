package day25_Loops;

public class WhileHungry {
    public static void main(String[] args) {
        boolean ishungry = true;
        int banana = 0;
        int countful = 3;
        while (ishungry) {
            banana++;
            System.out.println("eating a banana: \uD83c\uDF4C " +banana);
            if(banana==countful){
                ishungry=false;
            }

        }
        System.out.println("had enough banana, lets back to study");
    }
}
