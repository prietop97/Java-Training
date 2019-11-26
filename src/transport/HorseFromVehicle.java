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


}