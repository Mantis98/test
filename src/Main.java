import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String args[]) {

        Random random = new Random();
        int wylosowana = random.nextInt((100) + 1);
        Scanner scanner = new Scanner(System.in);

        boolean isGuessed = false;

        while (!isGuessed) {
            System.out.println("Podaj liczbe z zakresu 1-100: ");
            int guessed = scanner.nextInt();

            if (wylosowana < guessed) {
                System.out.println("Liczba jest za duza");
            }else if (wylosowana > guessed){
                System.out.println("Liczba jest za mala");
            }else
                isGuessed = true;
        }
    }
}
