package piggybank;

public class Dollar extends Money{
public Dollar(int ammount){
    super(ammount);
  }

  public Dollar(){
    this.ammount = 1;
  }

  @Override
  public String toString(){
      return "$" + ammount;
  }
}