import java.util.Scanner;

public class PrintPattern2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size;

        while(true){
            System.out.print("enter the size ");
            size = scanner.nextInt();

            if(size < 1){
                System.out.println("too small");
            }
            else if (size > 5){
                System.out.println("too big");
            }
            else{
                break;
            }
        }

        for(int r =1; r<=2 * size; r++){
            int startValue = (r<= size) ? r : (2 * size -r + 1);

            for (int c = 1; c<=2 * size; c++){
                int leftIndex = (c<= size ) ? c: (2 * size -c + 1);
                int val = startValue + (leftIndex-1);
                System.out.print(val);
            }
            System.out.println();
        }

    }
}
