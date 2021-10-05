class Deck {
  static void Card(String palo, String color, String valor) {
    System.out.println("El palo es: " + palo);
    System.out.println("El color es: " + color);
    System.out.println("El valor es: " + valor);
  }

  public static void main(String args[]) {

    Card("espadas", "rojo", "7");

  }
}
