import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int min = Integer.MAX_VALUE;

    System.out.println("Wpisz 5 liczb:");

    for (int i = 0; i < 5; i++) {
      System.out.print("Wpisz liczbe " + (i + 1) + ": ");
      int num = scanner.nextInt();

      if (num < min) {
        min = num;
      }
    }

    System.out.println("Minimalna wartosc: " + min);
    scanner.close();
  }
}