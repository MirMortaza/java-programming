package day10_shorthand_operators;

public class ChangrBalancr {
    public static void main(String[] args) {
        double balance = 1230.55;
        System.out.println("balance = $" + balance);
        
        double baklava = 22.50;
        System.out.println("baklava = " + baklava);
        balance = balance - baklava;
        System.out.println("balance after baklava = " + balance);
        
        double kanafa= 44.45;
        System.out.println("kanafa = " + kanafa);
        balance= balance-kanafa;
        System.out.println("balance after kanafa = " + balance);

        balance=balance-kanafa /2;
        System.out.println("balnce after 50% off = " + balance);
        
        double palov= 7.99;
        System.out.println("palov = " + palov);
        balance= balance-palov;
        System.out.println("balance after palov  = " + balance);
        
        double ayran= 3.0;
        System.out.println("ayran = " + ayran);
        balance=balance- (ayran*4);
        System.out.println("balance after four  ayran = " + balance);

        balance= balance+baklava;
        System.out.println("balance after returning baklava is = " + balance);
                
    }
}
