import java.util.Scanner;

public class PrintPattern1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int size = scanner.nextInt();

        for (int row = 1; row<= size; row++){
            for (int column = 1; column<=row; column++){
                System.out.print(column);
            }
            System.out.println();
        }


    }
}