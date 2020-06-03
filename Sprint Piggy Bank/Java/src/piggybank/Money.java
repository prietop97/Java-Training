package piggybank;

public abstract class Money{
  int ammount;
  public Money(int ammount){
    this.ammount = ammount;
  }

  public Money(){
    this.ammount = 1;
  }

  public abstract double getValue();
}