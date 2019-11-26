package animals;

public class Fish extends Animals{

  public Fish(String name, int year){
    super(name,year);
  }


  public String move(){
    return "THE FISH SWIM";
  }
  public String breath(){
    return "THE FISH BREATH WITH GILLS";
  }
  public String repoduce(){
    return "THE FISH REPRODUCE EGGS";
  }


}