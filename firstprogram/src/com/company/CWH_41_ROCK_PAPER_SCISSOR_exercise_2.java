package com.company;
import java.util.Scanner;
import java.util.Random;
public class CWH_41_ROCK_PAPER_SCISSOR_exercise_2 {
    public static void main(String[] args) {
        // 0 for  rock
        // 1 for paper
        // 2 for scissor
        Scanner sc=new Scanner(System.in);
        System.out.println(" enter 0 for rock , 1 for paper and 2 for scissor  ");
        int userInput=sc.nextInt();

        Random random=new Random();
        int computerInput= random.nextInt(3);

        if(userInput==computerInput){
            System.out.println("Draw");
        }
        else if (userInput==0&&computerInput==2||userInput==1&&computerInput==0||userInput==2&&computerInput==1){
            System.out.println(" you win");
        } else{
            System.out.println(" Computer win ");
        }
        if (computerInput==0){
            System.out.println(" Computer choice : Rock ");
        } else if (computerInput==1){
            System.out.println(" Computer choice : Paper ");
        } else{
            System.out.println(" Computer choice : Scissor ");
        }


    }
}
