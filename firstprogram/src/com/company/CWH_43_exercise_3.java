package com.company;
import java.util.Scanner;
import java.util.Random;
class Game{
    public int number;
    public int inputNumber;
    public int noOfGuesses=0;

    public int getNoOfGuesses() {
        return noOfGuesses;
    }

    public void setNoOfGuesses(int noOfGuesses) {
        this.noOfGuesses = noOfGuesses;
    }

    Game(){
        Random ran= new Random();
        this.number=ran.nextInt(100);
    }
     int userInput() {
         System.out.println(" Guess the Number : ");
         Scanner sc = new Scanner(System.in);
         inputNumber = sc.nextInt();
         return inputNumber;
     }
     boolean isCorrectNumber() {
        noOfGuesses++;
        if(inputNumber==number){
            System.out.format("yes you guessed it right, it was %d\n you guessed it in %d attempts",number,noOfGuesses);
            return true;
        }
        else if(inputNumber<number){
            System.out.println(" Too less...");
        } else if (inputNumber>number) {
            System.out.println(" Too High...");
        }
        return false;
     }
}
public class CWH_43_exercise_3 {
    public static void main(String[] args) {
        /*
        create a class Game , which allows a user to play " Guess the Number "
        game once . Game should have the following methods:
        1. Constructor to generate the random number
        2. take userInput() to take a user input of  numbers
        3. isCorrectNumber() to detect whether the number entered by the user is true
        4. getter and setter for noOfGuesses
        use properties such as noOfGuessers(int) , etc to get this task done!
         */
        Game g=new Game();
        boolean b=false;
        while(!b){
        g.userInput();
         b=g.isCorrectNumber();

        }



    }
}
