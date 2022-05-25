package Others;

import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;

public class RandomNumGame {
    public static void main(String[] args) {
        Random rand = new Random();
        int num = rand.nextInt(100);
        // int num= (int) (Math.random()*100);

        Scanner scan = new Scanner(System.in);

        int rights =0;
        int guess;
        int[] wrong = new int[5];
        boolean isWin = false;
        boolean isWrong = false;

        while (rights < 5) {
            System.out.print("L�tfen tahmininizi giriniz (0-100) : ");
            guess = scan.nextInt();

            if (guess < 0 || guess > 99) {
                System.out.println("0-100 aras�nda bir de�er girilmeli");
                continue;
            }

            if (guess == num) {
                System.out.println("Tebrikler, do�ru tahmin ! Tahmin etti�iniz say� : " + num);
                isWin = true;
                break;
            } else {
                System.out.println("Hatal� tahmin !");
                if (guess > num) {
                    System.out.println(guess + " , gizli say�dan b�y�kt�r.");
                } else {
                    System.out.println(guess + " , gizli say�dan k���kt�r.");
                }

                wrong[rights++] = guess;
                System.out.println("Kalan tahmin hakk� : " + (5 - rights));
            }
        }

        if (!isWin) {
            System.out.println("Kaybettiniz ! ");
            if (!isWrong) {
                System.out.println("Tahminleriniz : " + Arrays.toString(wrong));
            }
        }
    }
}