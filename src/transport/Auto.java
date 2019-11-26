package transport;

class Auto extends AbstractVehicle{
  private String model;
  private int year;

  public Auto(int fuel, String model, int year){
    super(fuel);
    this.model = model;
    this.year = year;
  }



  public void setModel(String name){
    model = name;
  }

  public int getYear(){
    return year;
  }

  public void setYear(int year){
    this.year = year;
  }


  @Override
  public String getPath(){
    return "Road";
  }

  @Override
  public String getName(){
    return model;
  }

  @Override
  public String toString(){
    return "Auto{" +
            "model= " + model + "\"" +
            ", year= " + year +
            ", fuel= " + fuel + "}";
  }

}