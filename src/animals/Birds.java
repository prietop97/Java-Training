package animals;

public class  Birds extends Animals{

  public Birds(String name, int year){
    super(name,year);
  }


  @Override
  public String move(){
    return "THE BIRDS FLY";
  }

  @Override
  public String breath(){
    return "THE BIRDS BREATH WITH LUNGS";
  }

  @Override
  public String repoduce(){
    return "THE BIRDS REPRODUCE EGGS";
  }


}