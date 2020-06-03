package transport;

public class HorseFromVehicle extends AbstractVehicle{
  private String name;

  public HorseFromVehicle(String name, int fuel){
    super(fuel);
    this.fuel *= 2;
    this.name = name;
  }

  public HorseFromVehicle(String name){
    this.name = name;
  }

  @Override
  public String getPath(){
    return "Grass";
  }

  @Override
  public String getName(){
    return this.name;
  }

  @Override
  public String toString(){
    return "HorseFromVehicle{" + "name= " + name + "\'" + ", fuel= " + fuel + "}";   
  }


}