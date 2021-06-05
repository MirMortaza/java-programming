package day16_Switch_tenary;

public class FloorNum {
    public static void main(String[] args) {
        int floornum = 7;
        if(floornum==1 ){
            System.out.println("floor 1 selected. companies: lobby verizon ");
        }else if( floornum == 2){
            System.out.println("floor 2 slected. companies: nasa; cybertek, google");
        }else if(floornum==3){
            System.out.println("floor 3 selected. companies: left, uber, and more");
        }else{
            System.out.println("invalid floor " + floornum);
        }

        System.out.println("**********switch statment version******");

        floornum=3;

        switch (floornum){
            case 1:
                System.out.println("floor 1 selected. companies: lobby verizon");
                break;
            case 2:
                System.out.println("floor 2 slected. companies: nasa; cybertek, google");
                break;    // break means exit the switch statement
            case 3:
                System.out.println("floor 3 selected. companies: left, uber, and more");
                break;
            default:
                System.out.println("invalid floor - " + floornum);
                break;
        }
    }
}
