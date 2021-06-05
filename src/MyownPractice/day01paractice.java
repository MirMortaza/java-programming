package MyownPractice;

public class day01paractice {
    public static void main(String [] args){
        String housetype = "single family";
        int numberofbedrooms = 6;
        int numberofbathroom = 3;
        int numberofkitchens = 1;
        boolean istherebasment = true;
        boolean isthereattic = false;
        boolean ithaspool = false;
        char houseforsale = 'n';
        double costofhouse = 560000;
        String address = "3500 washington dr falls church";
        double zipcode = 22041;
        boolean isparknearby= true;
        double ratingofschool = 4.5;
        System.out.println("*********This is my house information******");
        System.out.println("our house  is " +housetype+ " house");
        System.out.println("it has " + numberofbedrooms+ " bedrooms");
        System.out.println("it has " + numberofbathroom + " bathrooms also it has " + numberofkitchens + "kitchen in first floor");
        System.out.println("it has basement " + istherebasment+ "it does not has attic " + isthereattic);
        System.out.println("this hosue is " + houseforsale+ "ot for sale.");
        System.out.println("unfortunately it does not has pool " + ithaspool);
        System.out.println("our house price is " + costofhouse + " in market.");
        System.out.println("it located in " + address+ "and the zip code is: " +zipcode);
        System.out.println("there is park near by " +isparknearby+ "it called burk lake park");
        System.out.println("rating of the school is " + ratingofschool+ " out of 5");



    }
}
