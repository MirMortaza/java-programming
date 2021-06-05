package Officehours.practuce_03_2_2021;

public class CastingPractice {
    public static void main(String[] args) {

        //byte --> short--->int--->long--->float-->double

        byte b = 10;
        short s = b;
        byte b2 = (byte)s;

        double d = 5.3;
        int i = (short)d;
        int i2 = (int)d;

        System.out.println(i);
        System.out.println((double)i);

        float f = 3.55f;
        float f2 = (float)3.56;


    }
}
