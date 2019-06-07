import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Rower[] rower = new Rower[3];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            rower[i] = new Rower();
            System.out.println("Podaj id roweru");
            rower[i].setId(scanner.nextInt());
            scanner.nextLine();
            for (int j = 0; j != i; j++) {
                while (rower[i].equals(rower[j]))
                {
                    System.out.println("Podaj nowy rower ");
                    rower[i].setId(scanner.nextInt());
                    scanner.nextLine();
                }
            }
            System.out.println("Podaj kolor roweru ");
            rower[i].setKolor(scanner.nextLine());
        }
        for (int i = 0; i < 3; i++) {
            System.out.println(rower[i].getId() + " " + rower[i].getKolor());
        }
    }
}
