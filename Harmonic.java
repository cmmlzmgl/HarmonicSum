import java.util.Scanner;

public class Harmonic {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int number;
        double toplam = 0.0;

        System.out.print("Lütfen bir sayı giriniz: ");
        number = input.nextInt();

        for (int i = 1; i <= number; i++)
        {
            toplam =toplam + 1.0/i;
        }

        System.out.print("Harmonik Toplam: "+toplam);
    }
}
