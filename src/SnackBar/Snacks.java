package SnackBar;

class Snacks{


  // PROPERTIES
  private static int maxId = 0;
  private int id;
  private String name;
  private int quantity;
  private double cost;
  private int vendingMachineId;


  //CONSTRUCTOR
  public Snacks(String name, int quantity, double cost, int vendingMachineId){
    maxId++;
    id = maxId;
    this.name = name;
    this.quantity = quantity;
    this.cost = cost;
    this.vendingMachineId = vendingMachineId;
  }

  /////GETTERS 
  public int getId(){
    return id;
  }

  public String getName(){
    return name;
  }

  public int getQuantity(){
    return quantity;
  }

  public double getCost(){
    return cost;
  }

  public int getVendingMachineId(){
    return vendingMachineId;
  }


  ////// SETTERS

  public void setName(String name){
    this.name = name;
  }

  public void setQuantity(int quantity){
    this.quantity = quantity;
  }

  public void setCost(double cost){
    this.cost = cost;
  }

  public void setVendingMachineId(int vendingMachineId){
    this.vendingMachineId = vendingMachineId;
  }


  ////// METHODS
  public String buySnacks(int quantity){
    int quantityLeft = this.quantity - quantity;
    this.quantity = quantityLeft;
    return "You have bought " + quantity + " " + name + " and there are " + quantityLeft + " left";
  }

  public String totalCost(int quantity){
    double total = quantity * cost;
    return "$" + total;
  }

  public String addSnacks(int quantity){
    int newTotal = this.quantity + quantity;
    this.quantity = newTotal;
    return "You have added " + quantity + " " + name + " and the new quantity is " + newTotal;
  }



  @Override
  public String toString(){
    String rtnString = "id: " + id + "\n" +
                      "name: " + name + "\n" +
                      "quantity: " + quantity + "\n" +
                      "cost: " + cost + "\n" +
                      "vendingMachineId: " + vendingMachineId + "\n";
    return rtnString;
  }
}