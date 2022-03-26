package day34_Return_Type_Methode;

public class MethodWithOthers {
    public static void main(String[] args) {

    }

    public static String dayInWords(int day) {

        switch (day) {
            case 1:
                return "monday";

            case 2:
                return "tuesday";

            case 3:
                return "Wedneday";
            case 4:
                return "thursday";

            case 5:
                return "friday";

            default:
               return  "invalid";


        }

    }
    public static int FirstEvenNumber(int [] nums){
        for(int num : nums){
            if(num % 2==0){
                return num;
            }
        }
        return 0;
    }




    }

