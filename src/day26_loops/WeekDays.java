package day26_loops;

public class WeekDays {
    public static void main(String[] args) {
        int n =1;
        for(int i =1;i<=7;i++){
            switch (i){
                case 1:
                    System.out.println(i+ "-monday");
                    break;
                case 2:
                    System.out.println(i+"-tuesday");
                    break;
                case 3:
                    System.out.println(i+"-Wednesday");
                    break;
                case 4:
                    System.out.println(i+"-thursday");
                    break;
                case 5:
                    System.out.println(i+"-friday");
                    break;
                case 6:
                    System.out.println(i+"-saturday");
                    break;
                case 7:
                    System.out.println(i+"-sunday");
                default:
                    System.out.println("java day");
                    break;

            }
        }
    }
}
