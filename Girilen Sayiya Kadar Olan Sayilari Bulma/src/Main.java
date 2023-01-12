import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a, b, c = 0, toplam = 0, ort;
        System.out.print("Lütfen sayı giriniz: ");
        a = input.nextInt();
        for (b = 0; b <= a; b++) {
            if (b % 3 == 0 && b % 4 == 0) {
                c++;
                toplam += b;
                System.out.println(b);
            }
        }
        ort = toplam / c;
        System.out.println("Ortalama: " + ort);
    }
}