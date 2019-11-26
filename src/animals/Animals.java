package animals;

public abstract class Animals{
  private static int maxId = 0;
  int id;
  String name;
  int yearDiscovered;

  public Animals(String name, int year){
    maxId = maxId + 1;
    id = maxId;
    this.name = name;
    yearDiscovered = year;
  }

  public String getName(){
    return name;
  }

  public void setName(String name){
    this.name = name;
  }

  public int getId(){
    return id;
  }

  public int getYearDiscovered(){
    return yearDiscovered;
  }

  public void setYearDisvovered(int year){
    yearDiscovered = year;
  }

  public abstract String move();
  public abstract String breath();
  public abstract String repoduce();

  @Override
  public String toString(){
    return "{id: " + id + " ,name: " + name + " ,Year Discovered: " + yearDiscovered + "}";
  }

}