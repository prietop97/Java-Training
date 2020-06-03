package animals;

public class Fish extends Animals{

  public Fish(String name, int year){
    super(name,year);
  }


  @Override
  public String move(){
    return "SWIM";
  }

  @Override
  public String breath(){
    return "GILLS";
  }

  @Override
  public String reproduce(){
    return "EGGS";
  }


}