package transport;
import java.util.*;

public class Main{

  public static ArrayList<AbstractVehicle> filteredList = new ArrayList<AbstractVehicle>();

  public static void printVehicles(ArrayList<AbstractVehicle> vehicles, CheckVehicle tester){
    for(AbstractVehicle v : vehicles){
      filteredList.clear();
      if(tester.test(v)){
        System.out.println(v.getName() + " " + v.getFuelLevel());
        filteredList.add(v);
      }
    }
  }

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

    System.out.println("\n**** FROM ABSTRACT CLASS");
    HorseFromVehicle secretariat = new HorseFromVehicle("Secretariat",10);
    secretariat.addFuel(10);
    System.out.println("Secretariat "+ secretariat.getFuelLevel());

    HorseFromVehicle eclipse = new HorseFromVehicle("Eclipse");
    System.out.println("Eclipe " + eclipse.getFuelLevel());
    eclipse.move(10);


    Auto vw = new Auto(1, "EuroVan",2000);
    Auto toyota = new Auto(10, "Tundra",1998);
    Auto honda = new Auto(5, "Accord",2003);
    vw.move(5);
    vw.move();

    HorseFromVehicle trigger = new HorseFromVehicle("Trigger",10);
    HorseFromVehicle seattleSlew = new HorseFromVehicle("Seattle Slew",10);
    HorseFromVehicle americanPharoah = new HorseFromVehicle("American Pharoah",10);

    ArrayList<AbstractVehicle> abstractArray = new ArrayList<AbstractVehicle>();
    abstractArray.add(secretariat);
    abstractArray.add(trigger);
    abstractArray.add(seattleSlew);
    abstractArray.add(americanPharoah);
    abstractArray.add(eclipse);
    abstractArray.add(vw);
    abstractArray.add(toyota);
    abstractArray.add(honda);

    System.out.println(abstractArray.toString());

    printVehicles(abstractArray, v -> v.getFuelLevel() < 0);

    System.out.println("\n Horseswith positive fuel");

    printVehicles(abstractArray, v -> (v.getFuelLevel() > 0) && (v instanceof HorseFromVehicle));
    // FILTER LIST
    // getFuelLevel() < 0

    // sort

    abstractArray.sort((v1,v2)-> v1.getName().compareToIgnoreCase(v2.getName()));

    abstractArray.forEach((v) -> System.out.println(v.getName()));

  }
}