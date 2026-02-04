public class NumbersInSpanish {
    public static void main(String[] args) {
       // read the first argument passed to the program
       int number = Integer.parseInt(args[0]); 

        if (number == 1){
            System.out.println("Uno");
        }
        else if (number == 2){
            System.out.println("Dos");
        }
        else if (number == 3){
            System.out.println("Tres");
        }
        else if (number == 4){
            System.out.println("Cuatro");
        }
        else if (number == 5){
            System.out.println("Cinco");
        }
        else{
            System.out.println("I don't know that number");
        }



    
       // delete the line below and replace with your code
       System.out.println(number);
    }
 }