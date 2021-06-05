package day32_arrays_splite;

public class MallShopping {
    public static void main(String[] args){
        String[] items ={"shoes", "jacket", "Gloves", "Airport", "ipad", "iphone 12 case"};
        double[] princes={99.99,  150.0,     9.99,      250.0,    439.50, 39.99};
        int[] itemIDs={12345,     12346,    12347,      12348,    12349, 123450};

        System.out.println("-----Find the index of 'Gloves' in item array-----");
        for(int i =0;i<items.length;i++){
            if(items[i].equalsIgnoreCase("Gloves")){
                System.out.println("index of gloves = "+i);
                break;
            }
        }
        System.out.println("------set boolean to true if first 'ipad' is found");
        boolean ipadExists = false;
        System.out.println("ipadExists = " + ipadExists);

        for(int i =0;i<items.length;i++){
            System.out.println(items[i]+" - $\t"+princes[i]+" - #"+itemIDs[i]);
        }
        System.out.println();
        System.out.println("-----Look for 'jacket' in items and print all details----");
        for(int i =0;i<items.length;i++){
            if(items[i].equalsIgnoreCase("jacket")){
                System.out.println(items[i]+" -$ "+princes[i]+"#\t"+itemIDs[i]);
            }
        }
    }
}
