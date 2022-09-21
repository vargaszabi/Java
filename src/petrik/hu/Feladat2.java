package petrik.hu;

import java.util.Scanner;

public class Feladat2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Adja meg a terület széleségét és magaságát méterben:");
        double szeleseg = sc.nextDouble();
        double magasag = sc.nextDouble();
        double terulet = szeleseg * magasag * 1.1;
        double db = terulet / 0.04;
        System.out.printf("A szobába %.1f db csempe kell", db);
    }
}
