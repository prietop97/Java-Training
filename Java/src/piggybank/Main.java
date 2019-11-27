package piggybank;

import java.util.ArrayList;
import java.text.DecimalFormat;

public class Main{
        public static ArrayList<Money> piggyBank = new ArrayList<>();
        public static DecimalFormat fp = new DecimalFormat("$###,###.00");
        
        public static String getTotalValue(){
            double totalValue = 0.0;
            for(Money m: piggyBank){
                totalValue = totalValue + m.getValue();
            }
            return "The piggy bank holds " + fp.format(totalValue);
        }
        public static void main(String[] args){
        System.out.println("Hello World");
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

        System.out.println(getTotalValue());

        /// PRINT VALUE OF PIGGYBANK
    }
}