package petrik.hu;

import java.util.Scanner;

public class Feladat3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Adj meg egy számot:");
        double szam = sc.nextDouble();
        System.out.println("A megadott szám a * és a * egész számok között van, és ezek közül a * számhoz van közelebb.");
        System.out.println("A szám egész része: *");
        System.out.println("A szám törtrésze: *");
    }
}
