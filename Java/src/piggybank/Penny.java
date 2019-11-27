package piggybank;

public class Penny extends Money{
  public Penny(int ammount){
    super(ammount);
  }

  public Penny(){
    this.ammount = 1;
  }

  @Override
  public String toString(){
    if(ammount == 1){
      return ammount + " Penny";
    } else{
      return ammount + " Pennies";
    }
  }
}