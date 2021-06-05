package day10_shorthand_operators;

public class IncrementDecrement {
    public static void main(String[] args) {
        int i = 1;
        System.out.println("i = " + i);
        ++i;
        System.out.println("i = " + i);
        i++;
        i++;
        ++i;
        ++i;
        System.out.println("i = " + i);
        
        int linescode=15;
        System.out.println("linescode = " + linescode);
        linescode++;
        linescode+=1;
        ++linescode;
        linescode=linescode+1;
        System.out.println("linescode = " + linescode);
        
        int phone=50;
        --phone;
        phone--;
        phone -=1;
        phone=phone-1;
        System.out.println("phone = " + phone);
        
        char letter = 'a';
        System.out.println("letter = " + letter);
        letter++;
        System.out.println("letter = " + letter);
        letter++;
        ++letter;
        System.out.println("letter = " + letter);
        letter--;
        System.out.println("letter = " + letter);
        letter--; letter--; letter--;
        System.out.println("letter = " + letter);
        
    }
}
