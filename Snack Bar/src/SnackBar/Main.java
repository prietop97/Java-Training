package SnackBar;
import java.util.HashMap;

class Main{
  public static void main(String[] args){
    System.out.println("Hello World");

    /// CUSTOMERS
    Customer customer1 = new Customer("Jane", 45.25);
    Customer customer2 = new Customer("Bob", 33.14);


    /// VENDING MACHINES
    VendingMachine vm1 = new VendingMachine("Food");
    VendingMachine vm2 = new VendingMachine("Drink");
    VendingMachine vm3 = new VendingMachine("Office");

    HashMap<Integer,String> allVm = new HashMap<Integer,String>();
    allVm.put(vm1.getId(),vm1.getName());
    allVm.put(vm2.getId(),vm2.getName());
    allVm.put(vm3.getId(),vm3.getName());
    System.out.println(allVm);

    /// SNACKS
    Snacks snack1 = new Snacks("Chips", 36 , 1.75 , vm1.getId());
    Snacks snack2 = new Snacks("Chocolate Bar", 36 , 1.00 , vm1.getId());
    Snacks snack3 = new Snacks("Pretzel", 30 , 2.00 , vm1.getId());
    Snacks snack4 = new Snacks("Soda", 24 , 2.50 , vm2.getId());
    Snacks snack5 = new Snacks("Water", 20 , 2.75 , vm2.getId());



    customer1.buy(snack4.totalCost(3)); //// CUSTOMER BUYS --> customer cash decreases
    snack4.buySnacks(3); //// Decreases snack ammount on machine
    System.out.println(customer1.getCash()); //// $37.25
    System.out.println(snack4.getQuantity()); //// 21

    customer1.buy(snack3.totalCost(1));
    snack3.buySnacks(1);
    System.out.println(customer1.getCash()); //// $35.75
    System.out.println(snack3.getQuantity()); //// 29

    customer2.buy(snack4.totalCost(2));
    snack4.buySnacks(2);
    System.out.println(customer2.getCash()); //// $28.14
    System.out.println(snack4.getQuantity()); //// 19

    customer1.addCash(10);  /// LUCKY
    System.out.println(customer1.getCash()); // $45.75

    customer1.buy(snack2.totalCost(1));
    snack2.buySnacks(1);
    System.out.println(customer1.getCash()); // $44.75
    System.out.println(snack2.getQuantity()); //35

    snack3.addSnacks(12);
    System.out.println(snack3.getQuantity()); //41

    customer2.buy(snack3.totalCost(3));
    snack3.buySnacks(3);
    System.out.println(customer2.getCash()); // $22.14
    System.out.println(snack3.getQuantity()); //38


    System.out.println(snack1 + "\n" + "Vending Machine Name: " + allVm.get(snack1.getVendingMachineId()));
    System.out.println(snack2 + "\n" + "Vending Machine Name: " + allVm.get(snack2.getVendingMachineId()));
    System.out.println(snack3 + "\n" + "Vending Machine Name: " + allVm.get(snack3.getVendingMachineId()));
    System.out.println(snack4 + "\n" + "Vending Machine Name: " + allVm.get(snack4.getVendingMachineId()));
    System.out.println(snack5 + "\n" + "Vending Machine Name: " + allVm.get(snack5.getVendingMachineId()));
  }
}