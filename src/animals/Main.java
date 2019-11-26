package animals;
import java.util.ArrayList;

public class Main{

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

    System.out.println(animalsArr);

  }
}