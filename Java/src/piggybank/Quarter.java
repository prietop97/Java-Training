package piggybank;

public class Quarter extends Money{
  public Quarter(int ammount){
    super(ammount);
  }

  public Quarter(){
    this.ammount = 1;
  }

  @Override
  public String toString(){
    if(ammount == 1){
      return ammount + " Quarter";
    } else{
      return ammount + " Quarters";
    }
  }
}