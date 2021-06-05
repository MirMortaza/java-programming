package day16_Switch_tenary;

public class Apartmentleas {
    public static void main(String[] args) {
        System.out.println("*****welcome to adair*****");
        int numberofbedrooms = 1;
        double startingprice = 0.0;
        switch (numberofbedrooms){
            case 0:
            System.out.println("studio apartment selected");
            startingprice = 1475;
            break;
            case 1:
                System.out.println("one bedroom apartment selected");
                startingprice = 1898;
                break;
            case 2:
                System.out.println("2 bedroom selected");
                startingprice = 2898;
                break;
            default:
                System.out.println("5 bedroom apartment currently not available");




        }
        System.out.println("starting price is " +startingprice);
            ;


    }
}
