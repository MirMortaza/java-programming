package MyownPractice;

public class HouseInfo {
    public static void main(String[] args){
        String housetype = "singalfamily";
        int numberofbedroom = 7;
        byte numberofbathroom = 3;
        short numberofkitchens = 1;
        boolean isthereabasement = true;
        boolean isthereanattic = true;
        boolean isthereapool = false;
        char isthehouseforsale = 'n';
        double costofhouse = 650000;
        String addressofthehouse = "3600 whashington dr falls church";
        int zipcode = 22041;
        boolean isaparknearby = true;
        double ratingofsurroundingschooldistrictoutof5 = 4.5;

        System.out.println("Basic information of my house");
        System.out.println("my house is " + housetype+ ".");
        System.out.println("it has " + numberofbedroom + " bedrooms.");
        System.out.println("it has " + numberofbathroom + " bathroom and also it has " + numberofkitchens +" kitchen");
        System.out.println(" and it has basement: "+ isthereabasement);
        System.out.println("unfortunately it does not has pool: "+ isthereapool);
        System.out.println("this house is " + isthehouseforsale+ "ot for sale.");
        System.out.println("The house address is " + addressofthehouse+ " VA.");
        System.out.println("zipcode: " + zipcode);
        System.out.println("There`s no park near by the house: "+isaparknearby );
        System.out.println("there are many school near by the house their rating is " + ratingofsurroundingschooldistrictoutof5+".");



    }
}
