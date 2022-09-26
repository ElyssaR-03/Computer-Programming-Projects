public class Ship {
  private String name; // Ship name
  private String yearBuilt; // Year it was built
  
  public Ship(String name, String year) {
    this.name = name;
    this.yearBuilt = year;
  }
  
  public void setName(String name) {
    this.name = name;
  }
  
  public void setYearBuilt(String year) {
    this.yearBuilt = year;
  }
  
  public String getName() {
    return name;
  }
  
  public String getYearBuilt() {
    return yearBuilt;
  }
  
  @Override
  public String toString() {
    return "Name: " + name + "\nYear built: " + yearBuilt;
  }
}