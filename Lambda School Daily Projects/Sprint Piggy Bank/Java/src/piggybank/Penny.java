package piggybank;

public class Penny extends Money{
  public Penny(int ammount){
    super(ammount);
  }

  public Penny(){
    this.ammount = 1;
  }

  public double getValue(){
    return this.ammount * 0.01;
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