package animals;

public class  Birds extends Animals{

  public Birds(String name, int year){
    super(name,year);
  }


  @Override
  public String move(){
    return "FLY";
  }

  @Override
  public String breath(){
    return "LUNGS";
  }

  @Override
  public String reproduce(){
    return "EGGS";
  }


}