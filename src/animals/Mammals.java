package animals;

public class Mammals extends Animals{

  public Mammals(String name, int year){
    super(name,year);
  }

  @Override
  public String move(){
    return "WALK";
  }

  @Override
  public String breath(){
    return "LUNGS";
  }

  @Override
  public String reproduce(){
    return "BIRTHS";
  }


}