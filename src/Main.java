import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int n1, n2, ebob = 1, ekok = 1, i = 1, j = 1;

        System.out.print("1. sayıyı giriniz : ");
        n1 = input.nextInt();

        System.out.print("2. sayıyı giriniz : ");
        n2 = input.nextInt();

        if (n1 < n2) {
            while (i <= n1) {
                if (n1 % i == 0 && n2 % i == 0) {
                    ebob = i;
                }
                i++;
            }
        } else {
            while (i <= n2) {
                if (n1 % i == 0 && n2 % i == 0) {
                    ebob = i;
                }
                i++;
            }
        }
        System.out.println("Sayıların Ebobu : " + ebob);
        System.out.print("");

        while (n1 * n2 >= j) {
            if (j % n1 == 0 && j % n2 == 0) {
                ekok = j;
                break;
            }
            j++;
        }
        System.out.print("Sayıların Ekoku : " + ekok);
    }
}