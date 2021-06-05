package day10_shorthand_operators;

public class ShortHandopretators {
    public static void main(String[] args) {
        int cars= 10;
        System.out.println("cars in parking lot  = " + cars);
        cars= cars+2;
        System.out.println("cars in parking lot = " + cars);
        cars+=5;
        System.out.println("cars in parking lot = " + cars);
        cars-=6;
        System.out.println("cars in parking lot = " + cars);
        cars*=5;
        System.out.println("cars in parking lot = " + cars);

        int electriccars= 13;
        cars= cars+electriccars;
        System.out.println("cars in parking lot = " + cars);
        cars/=2;
        System.out.println("cars in parking lot  = " + cars);
        
        String word = "java";
        System.out.println("word = " + word);
        word = word+"programming";
        System.out.println("word = " + word);
        word=word +" is fun";
        System.out.println("word = " + word);
        
        String selenium= " but \"selenium\" is more fun";
        System.out.println("selenium = " + selenium);
        word=word+selenium;
        System.out.println("word = " + word);
        word+=1234;
        System.out.println("word = " + word);
        
        char letter = 'A';
        System.out.println("letter = " + letter);
        letter+=3;
        System.out.println("letter = " + letter);
        letter+='j';
        System.out.println("letter = " + letter);

        double parkingfee= 7.50;
        System.out.println("normal parkingfee = " + parkingfee);
        parkingfee/=2;
        System.out.println("normal parkingfee = " + parkingfee);

        parkingfee-=parkingfee;
        System.out.println("normal parkingfee = " + parkingfee);

    }
}
