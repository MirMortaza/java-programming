package day32_arrays_splite;

public class MaxMinPrice {
    public static void main(String[] args) {
        String[] items ={"shoes", "jacket", "Gloves", "Airport", "ipad", "iphone 12 case"};
        double[] princes={99.99,  150.0,     9.99,      250.0,    439.50, 39.99};
        int[] itemIDs={12345,     12346,    12347,      12348,    12349, 123450};
        double maxprice =0;
        int maxindex=0;
        for(int i =0;i<princes.length;i++){
            if(princes[i]>maxprice){
                maxprice=princes[i];

            }
        }
        System.out.println("------finding details of most expensive items-----");


    }
}
