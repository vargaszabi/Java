package petrik.hu;

import java.util.Scanner;

public class Feladat7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Adj meg egy számot 1-12 között");
        int szam = sc.nextInt();
        if (szam < 3){
            System.out.println("Tél");
        }
        else if (szam < 6){
            System.out.println("Tavasz");
        }
        else if (szam < 9){
            System.out.println("Nyár");
        }
        else if (szam < 12){
            System.out.println("Ősz");
        }
        else{
            System.out.println("Tél");
        }
    }
}
