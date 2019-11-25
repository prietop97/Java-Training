package SnackBar;

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


    /// SNACKS
    Snacks snack1 = new Snacks("Chips", 36 , 1.75 , vm1.getId());
    Snacks snack2 = new Snacks("Chocolate Bar", 36 , 1.00 , vm1.getId());
    Snacks snack3 = new Snacks("Pretzel", 30 , 2.00 , vm1.getId());
    Snacks snack4 = new Snacks("Soda", 24 , 2.50 , vm2.getId());
    Snacks snack5 = new Snacks("Water", 20 , 2.75 , vm2.getId());

    




  }
}