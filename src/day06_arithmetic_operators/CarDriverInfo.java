package day06_arithmetic_operators;

public class CarDriverInfo {
    public static void main(String[] args){
        String carmodel = "bmw";
        String drivername= "Mir";
        String licensenum= "c3948776";
        short speed  =  240;
        boolean autimatic = true;
        char licenseclass = 'a';
        System.out.println("carmodel:\t\t"+carmodel);
        System.out.println("drivername:\t\t" +drivername);
        System.out.println("licensenum:\t\t"+licensenum);
        System.out.println("speed:\t\t\t"+speed+  "mph");
        System.out.println("autimatic:\t\t"+autimatic);
        System.out.println("licenseclass:\t" +licenseclass);
        System.out.println(drivername + " is driver"+" he is a good driver");
        System.out.println(licenseclass  +"  "+ autimatic)
                ;

    }

}
