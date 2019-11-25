package employeeApp;

public class Employee
{
  //// FIELDS
  private static int maxId = 0;
  private int id;
  private String firstName;
  private String lastName;
  private double salary;
  private boolean has401K;
  private int companyId;
  private int healthPlanId;

  //// Constructor - Initial State of the object

  public Employee(String firstName, String lastName, double salary, boolean has401K, int companyId, int healthPlanId){
    maxId++;
    id = maxId;
    this.firstName = firstName;
    this.lastName = lastName;
    this.salary = salary;
    this.has401K = has401K;
    this.companyId = companyId;
    this.healthPlanId = healthPlanId;
  }

  //// METHODS - getters and setters

  public int getId(){
    return id;
  }

  public void setFirstName(String firstName){
    this.firstName = firstName;
  }


  public String getFirstName(){
    return firstName;
  }

  public void setLastName(String lastName){
    this.lastName = lastName;
  }


  public String getLastName(){
    return lastName;
  }


  public void setSalary(double salary){
    this.salary = salary;
  }

  public double getSalary(){
    return salary;
  }


  public void setHas401K(boolean has401K){
    this.has401K = has401K;
  }

  public double getHas401K(){
    return has401K;
  }

  public void setEmployeeId(int companyId){
    this.companyId = companyId;
  }

  public int getCompanyId(){
    return companyId;
  }

  public void setHealthPlanId(int healthPlanId){
    this.healthPlanId = healthPlanId;
  }

  public int getHealthPlanId(){
    return healthPlanId;
  }



  //// OTHER METHODS

  public String getName(){
    return firstName + " " + lastName;
  }

  //// OBJECT --> Employee
  @Override
  public String toString(){
    String rtnStr = "id: " + id + "\n" +
                    "firstName: " + firstName + "\n" +
                    "lastName: " + lastName + "\n" +
                    "salary: " + salary + "\n" +
                    "has401K: " + has401K + "\n" +
                    "companyId: " + companyId + "\n" +
                    "healthPlanId: " + healthPlanId + "\n";
    return rtnStr;
  }
}