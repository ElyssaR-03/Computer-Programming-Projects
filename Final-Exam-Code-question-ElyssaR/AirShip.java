public class AirShip extends Ship{
  private int liftingCapacity;
  private int maxAltitude;
  
  public AirShip(String name, String year,int liftingCapacity) {
    super(name, year);
    this.liftingCapacity = liftingCapacity;
    this.maxAltitude = 0;
  }
  
  public AirShip(String name, String year, int liftingCapacity, int maxAltitude){
    super(name, year);
    this.liftingCapacity = liftingCapacity;
    this.maxAltitude = maxAltitude;
  }
  public void setLiftingCapacity(int liftC){
    liftingCapacity = liftC;
  }
  public void setMaxAltitude(int maxA){
    maxAltitude = maxA;
  }
  public int getLiftingCapacity(int liftingCapacity){
    return liftingCapacity;
  }
  public int getMaxAltitude(){
    return maxAltitude;
  }
  public String toString(){
    String temp = super.toString();
    temp = temp + "\nLifting capacity: " + liftingCapacity + "\nMax Altitude: " + maxAltitude;
    return temp;
  } 
}