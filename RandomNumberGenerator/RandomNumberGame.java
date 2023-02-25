//PROGRAMMER: Kayla Powell

import java.util.Scanner;

public class RandomNumberGame
{
    public static void main(String[] args)
    {
        // CONSTANT DECLARATION AND INITIALIZATION
        
        final int MAX_RANGE = 20;
        final int MIN_RANGE = 1;
        final int GENERATED_NUMBER = (int)Math.floor(Math.random()*MAX_RANGE);
        
        // VARIABLE DECLARATION

        
        int userGuess;
        String playAgain;
        
        // OBJECT CREATION

        Scanner keyboardInput = new Scanner(System.in);
        
        System.out.println("Welcome to the random number game!");
        System.out.println("You have 3 guesses to try and figure out my number.");
        System.out.println("Good luck!");
        
        for (int i = 3; i>0; i--)
        {
        // SOLUTION
        if (i <= 2)
        {
            System.out.println("You have " + i + " guesses left.");
        }
        
        // Integer Keyboard Input
        
        System.out.println("What integer am I thinking of between 1-20?");
        userGuess = keyboardInput.nextInt();
        keyboardInput.nextLine();
        
        if (userGuess == GENERATED_NUMBER)
        {
            System.out.println("Yay! " + userGuess + " is correct! You win!");
            break;
        }
        else
        {
            System.out.println("That's incorrect!");
            if (userGuess > GENERATED_NUMBER && i != 1)
            {
                System.out.println("Your guess is too high.");
            }
            if(userGuess < GENERATED_NUMBER && i != 1)
            {
                System.out.println("Your guess is too low.");
            }
        }
        
        if (i == 1)
        {
            System.out.println("You lose! The number was " + GENERATED_NUMBER + "!");
            System.out.println("Would you like to play again? Yes or No");
            playAgain = keyboardInput.next();
            
            if (playAgain.equals("Yes"))
            {
                i = 4;
                System.out.println("Let's try again!");
            }
            else
            {
                System.out.println("See you next time!");
                break;
            }
        }
        // Screen Output

        }
    }
}
