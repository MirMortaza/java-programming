package day18_Conditions_practice_strings_intro;

public class Switchseasonfinder {
    public static void main(String[] args) {
        int month = 8;
        String season;
        char mir ='r';
        double m = 84776;
        switch (month){
            case 12 : case 1 : case 2:
                season = "winter";
                break;
            case 3: case 4: case 5:
                season = "spring";
                break;
            case 6 : case 7 : case 8:
                season = "summer";
                break;
            case 9: case 10: case 11:
                season = "fall";
            default:
                season="invalid entry ";
                
        }
        System.out.println("season = " + season);

         }

        }



