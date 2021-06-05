package day15_Logicalops_switch_ternary;

public class AndoperatorParactice {
    public static void main(String[] args) {
        boolean onsale = true;
        boolean freeshiping= true;
        String itemname = "phone";
        if(onsale && freeshiping){
            System.out.println("add " + itemname+ " to your cart");
        }else {
            System.out.println("don`t buy it");
        }

        if(freeshiping && onsale && itemname.equals ("wooden spoon")){
            System.out.println("add to cart " + itemname);
        }else {
            System.out.println("continue shopping for good deal on sale");
        }


    }
}
