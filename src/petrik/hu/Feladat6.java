package petrik.hu;

import java.util.Scanner;

public class Feladat6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Add meg a doga értékét:");
        int ertek = sc.nextInt();
        if (ertek < 43){
            System.out.println("Elégtelen");
        }
        else if (ertek < 58){
            System.out.println("Elégséges");
        }
        else if (ertek < 73){
            System.out.println("Közepes");
        }
        else if (ertek < 88){
            System.out.println("Jó");
        }
        else{
            System.out.println("Jeles");
        }
    }
}
