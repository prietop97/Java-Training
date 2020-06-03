package animals;
import java.util.ArrayList;

public class Main{

  public static ArrayList<Animals> filteredAnimals = new ArrayList<Animals>();


  public static void printAnimals(ArrayList<Animals> animals, Check tester){
    filteredAnimals.clear();
    for(Animals a: animals){
      if(tester.test(a)){
        filteredAnimals.add(a);
        // System.out.println(a.getName() + "Was Discovered In " + a.getYearDiscovered());
      }
    }
  }
  public static void main(String[] args){
    System.out.println("Hello World");

    ArrayList<Animals> animalsArr = new ArrayList<Animals>();

    // MAMMALS
    animalsArr.add(new Mammals("Panda",1969));
    animalsArr.add(new Mammals("Zebra",1778));
    animalsArr.add(new Mammals("Koala",1816));
    animalsArr.add(new Mammals("Sloth",1804));
    animalsArr.add(new Mammals("Armadillo",1758));
    animalsArr.add(new Mammals("Raccoon",1758));
    animalsArr.add(new Mammals("Bigfoot",2021));

    //BIRDS
    animalsArr.add(new Birds("Pigeon",1837));
    animalsArr.add(new Birds("Peacock",1821));
    animalsArr.add(new Birds("Toucan",1758));
    animalsArr.add(new Birds("Parrot",1824));
    animalsArr.add(new Birds("Swan",1758));

    //FISH
    animalsArr.add(new Fish("Salmon",1758));
    animalsArr.add(new Fish("Catfish",1817));
    animalsArr.add(new Fish("Perch",1758));


    System.out.println("***COLLECTION***");
    System.out.println(animalsArr);

    System.out.println("***List all the animals in descending order by year named***");
    animalsArr.sort((v1,v2) -> v1.getYearDiscovered() - v2.getYearDiscovered());
    animalsArr.forEach((a)->System.out.println(a.getName() + " " + a.getYearDiscovered()));

    System.out.println("***List all the animals alphabetically***");
    animalsArr.sort((v1,v2) -> v1.getName().compareToIgnoreCase(v2.getName()));
    animalsArr.forEach((a)->System.out.println(a.getName()));

    System.out.println("***List all the animals order by how they move***");
    animalsArr.sort((v1,v2) -> v1.move().compareToIgnoreCase(v2.move()));
    animalsArr.forEach((a)->System.out.println(a.getName() + " " + a.move()));

    System.out.println("***List only those animals the breath with lungs***");
    printAnimals(animalsArr, (a) -> a.breath().toUpperCase().contains("luNgS".toUpperCase()));
    filteredAnimals.forEach((a)->System.out.println(a.getName() + " " + a.breath()));

    System.out.println("***List only those animals that breath with lungs and were named in 1758***");
    printAnimals(animalsArr, (a) -> (a.breath().toUpperCase().contains("luNgS".toUpperCase())) && (a.getYearDiscovered() == 1758));
    filteredAnimals.forEach((a)->System.out.println(a.getName() + " breaths with " + a.breath().toLowerCase() + " and was discovered in " + a.getYearDiscovered()));

    System.out.println("***List only those animals that lay eggs and breath with lungs***");
    printAnimals(animalsArr, (a) -> (a.reproduce().toUpperCase().contains("eggs".toUpperCase())) && (a.breath().toUpperCase().contains("luNgS".toUpperCase())));
    filteredAnimals.forEach((a)->System.out.println(a.getName() + " breaths with " + a.breath().toLowerCase() + " and they lay " + a.reproduce()));

    System.out.println("***List alphabetically only those animals that were named in 1758***");
    printAnimals(animalsArr,(a) -> (a.getYearDiscovered() == 1758));
    filteredAnimals.sort((a1,a2) -> a1.getName().compareToIgnoreCase(a2.getName()));
    filteredAnimals.forEach(a -> System.out.println(a.getName() + " was discovered in " + a.getYearDiscovered() + " and are ordered alphabetically"));


    /// STRETCH
    System.out.println("***For the list of animals, list alphabetically those animals that are mammals***");
    // ArrayList<Animals> mammalsArr = new ArrayList<Animals>();
    // for (Animals a: animalsArr){
    //   if(a instanceof Mammals){
    //     mammalsArr.add(a);
    //   }
    // }
    printAnimals(animalsArr,(a) -> (a instanceof Mammals));
    filteredAnimals.sort((a1,a2) -> a1.getName().compareToIgnoreCase(a2.getName()));
    filteredAnimals.forEach(a -> System.out.println(a.getName() + " is a " + a.getClass()));
      




  

  }
}