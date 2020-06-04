package employeeApp;

public class Main{
  //fields - information
  //methods - do - behaviors
  public static void main(String[] args){
    HealthPlan h1 = new HealthPlan("My Health 1");
    HealthPlan h2 = new HealthPlan("My Health 2");

    Company c1 = new Company("Company A",100);
    Company c2 = new Company("Company B",200);

    Employee emp1 = new Employee("Pedro","Prieto",12.67,true,c1.getId(),h1.getId());
    Employee emp2 = new Employee("Luis","Rodriguez",15.07,true,c1.getId(),h2.getId());

    System.out.println("*** Query Data ***");
    System.out.println(emp1);
    System.out.println();
    System.out.println(c1.getDebt());
    c1.setDebt(300);
    System.out.println(c1.getDebt());

    System.out.println("**** STRINGS *****");
    String localStr;
    localStr = emp1.getFirstName() + " " + emp2.getLastName();
    String noVowels = localStr.toLowerCase().replaceAll("[a,e,i,o,u]","_");
    System.out.println(noVowels);
    System.out.println(localStr);
  }
}