class Main {
  public static void main(String[] args) {
    Ship example = new Ship("Lolly-pop", "1932");
    System.out.println(example);
    System.out.println();
    Ship example2 = new Ship("Tennessee", "1919");
    System.out.println(example2);
    AirShip as1 = new AirShip("floaty", "2002", 45000, 30000);
    System.out.println();
    System.out.println(as1);
  }
}