package piggybank;

public class Nickel extends Money{
  public Nickel(int ammount){
    super(ammount);
  }

  public Nickel(){
    this.ammount = 1;
  }

  public double getValue(){
    return this.ammount * 0.05;
  }

  @Override
  public String toString(){
    if(ammount == 1){
      return ammount + " Nickel";
    } else{
      return ammount + " Nickels";
    }
  }
}