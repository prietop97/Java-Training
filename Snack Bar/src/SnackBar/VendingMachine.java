package SnackBar;

public class VendingMachine{

  //PROPERTIES
  private static int maxId = 0;
  private int id;
  private String name;


  //CONSTRUCTOR
  public VendingMachine(String name){
    maxId++;
    id = maxId;
    this.name = name;
  }

  //GETTERS
  public int getId(){
    return id;
  }

  public String getName(){
    return name;
  }

  //SETTERS

  public void setName(String name){
    this.name = name;
  }

  @Override
  public String toString(){
    String rtnString = "id: " + id + "\n" +
                      "name: " + name + "\n";
    return rtnString;
  }
}