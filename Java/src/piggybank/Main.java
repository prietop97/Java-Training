package piggybank;

import java.util.ArrayList;

public class Main{
    public static void main(String[] args){
        System.out.println("Hello World");

        ArrayList<Money> piggyBank = new ArrayList<>();
        piggyBank.add(new Quarter());
        piggyBank.add(new Dime());
        piggyBank.add(new Dollar(5));
        piggyBank.add(new Nickel(3));
        piggyBank.add(new Dime(7));
        piggyBank.add(new Dollar());
        piggyBank.add(new Penny(10));
        for(Money m: piggyBank){
            System.out.println(m);
        }
    }
}