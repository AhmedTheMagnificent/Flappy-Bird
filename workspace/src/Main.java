import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number:");
        int number = scanner.nextInt();
        for(int i = 0; i < 1000; i++) {
            System.out.printf("%d x %d = %d", number, i, number * i);
        }
    }
}
