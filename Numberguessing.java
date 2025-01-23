import java.util.*;

public class Numberguessing{
    public static void main(String args[]){
        int targetNumber = new Random().nextInt(10) + 1;
        Scanner scanner = new Scanner(System.in);
        int guess,attempts = 0;

        System.out.println("Guess the number between 1 and 10!");
        while((guess = scanner.nextInt()) != targetNumber) {
            attempts++;
            System.out.println(guess < targetNumber ? "Too low!" : "Too high!");
        } 
            System.out.println("Correct! Total attempts: " + (attempts + 1));
            scanner.close();
        
    }
}