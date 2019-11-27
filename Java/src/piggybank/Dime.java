package piggybank;

public class Dime extends Money{
  public Dime(int ammount){
    super(ammount);
  }

  public Dime(){
    this.ammount = 1;
  }

  @Override
  public String toString(){
    if(ammount == 1){
      return ammount + " Dime";
    } else{
      return ammount + " Dimes";
    }
  }
}