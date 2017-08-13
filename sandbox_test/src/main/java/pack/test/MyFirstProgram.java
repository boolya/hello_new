package pack.test;

public class MyFirstProgram {
  public static void main(String[] args) {
    hello ("world");

    double len = 5;
    System.out.println("Площадь квадрата со сторной " + len + " = " + area(len));
  }

  public static void hello (String somebody) {
    System.out.println("Hello, " + somebody + "!");
  }

  public static double area (double l) {
    return l * l;
  }
}