package day18_Conditions_practice_strings_intro;

public class carleasingtesk {
    public static void main(String[] args) {
        String make = "marcedes";
        String model = "E";
        double lastprice = 0.0;
        if (make.equals("marcedes") && model.equals("E")) {
            lastprice = 500;

        }else if (make.equals("marcedes")&& model.equals("A")){
            lastprice= 400;

        }
        System.out.println("make  = " + make);
        System.out.println("model = " +model);
        System.out.println("last price = " +lastprice);

        // nice code easy way

        if(make.equals("marcedes")){
            lastprice= 500.0;
        }else if(model.equals("E")){
            lastprice=400.0;
            System.out.println("make = " +make);
            System.out.println("model = " + model);
            System.out.println("last price " + lastprice);
        }


    }
}
