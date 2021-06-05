package day29_nestedloop_arrays;

public class NestedForLoop {
    public static void main(String[] args){
        for(int minutes = 0; minutes<= 5; minutes++){
            System.out.println("minutes = "+minutes);
            for(int seconds = 1; seconds<=60; seconds++ ){
                System.out.println("seconds = " + seconds);
            }
        }
        for(int minutes = 0; minutes<=4; minutes++){
            for(int second = 0;second<=59;second++){
                for(int hour = 0;hour<=23;hour++){
                    System.out.println("time is= "+hour+":"+minutes+":" + second);
                }

            }
        }
    }
}
