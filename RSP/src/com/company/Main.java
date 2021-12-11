package com.company;


import java.util.Random;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        System.out.println("Welcome, to The Game");
        Scanner start = new Scanner(System.in);
        System.out.println("Press 1 to start the game");
        System.out.println("Press 2 to learn information about the game");
        int k = start.nextInt();

        int scorep = 0;
        int scorec = 0;

        if (k==2){

            System.out.println("-The game is played against the computer.");
            System.out.println("-Each round you have to choose between Rock, Paper or Scissors.");
            System.out.println("-For Rock press 1, For Paper 2, For Scissors 3.");
            System.out.println("-Rock beats scissors, scissors beats paper, paper beats stone.");
            System.out.println("-Each win earns 1 point, and whoever reaches 5 points wins.");
            System.out.println("-The game will start soon");
            System.out.println("Choose your weapon Paper,Scissors or Rock");

        }else{
            System.out.println("Choose your weapon Rock(1),Paper(2) or Scissors(3)");
        }
        play(scorep,scorec);


    }



    public static void scoreComp(int scorep , int scorec){
        if (scorep == 5){
            System.out.println("Congratulations, You won the game");




        }
        else if (scorec == 5){
            System.out.println("Unfortunately, The computer won the game.");

        }
        else {
            System.out.println("-----------------------------------");
            System.out.println("Your Score" + "=" + scorep);
            System.out.println("Computer Score"+ "=" +  scorec);
            System.out.println("Next Round");
            System.out.println("-----------------------------------");
            play(scorep,scorec);
        }
    }
    public static void invalidValue(int scorep, int scorec){

        play(scorep,scorec);
    }

    public static void drawPlayAgain(int scorep, int scorec){
        play(scorep,scorec);
    }
    public static void play(int scorep, int scorec) {


        Random rand = new Random();
        int pcdesicion = rand.nextInt(4);
        Scanner scan = new Scanner(System.in);
        int d = scan.nextInt();

        powerComp(d, pcdesicion, scorep, scorec);
    }

    public static void powerComp(int playerdsc, int computerdsc, int scorep, int scorec){
        


        if (playerdsc == 3 && computerdsc == 2) {
            System.out.println("You won");
            scorep++;
            scoreComp(scorep, scorec);

        } else if (playerdsc == 2 && computerdsc == 1) {
            System.out.println("You won");
            scorep++;
            scoreComp(scorep, scorec);

        } else if (playerdsc == 1 && computerdsc == 3) {
            System.out.println("You won");
            scorep++;
            scoreComp(scorep, scorec);

        } else if (!(playerdsc <= 3 && playerdsc > 0)) {
            System.out.println("-----------------------------------");
            System.out.println("Entered an invalid value");
            System.out.println("-----------------------------------");
            invalidValue(scorep, scorec);

        } else if (playerdsc == computerdsc) {
            System.out.println("-----------------------------------");
            System.out.println("Draw,Try Again");
            System.out.println("-----------------------------------");
            drawPlayAgain( scorep, scorec);
        }
         else {
            System.out.println("Computer won");
            scorec++;
            scoreComp(scorep, scorec);
        }

    }

}
