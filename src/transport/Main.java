package transport;

public class Main{
  public static void main(String[] args) {
    System.out.println("Hello World");

    Horse seabiscuit = new Horse("Seabiscuit");
    Horse affirmed = new Horse("Affirmed");
    Horse joe = new Horse("Joe");


    seabiscuit.eat(10);
    affirmed.eat(25);

    for(int i = 0; i < 3; i++){
      seabiscuit.move();
    }

    System.out.println(seabiscuit.getFuelLevel());
  }
}