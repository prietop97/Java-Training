package animals;

public class Mammals extends Animals{

  public Mammals(String name, int year){
    super(name,year);
  }

  @Override
  public String move(){
    return "THE MAMMALS WALK";
  }

  @Override
  public String breath(){
    return "THE MAMMALS BREATH WITH LUNGS";
  }

  @Override
  public String repoduce(){
    return "THE MAMMALS REPRODUCE LIVE BIRTHS";
  }


}