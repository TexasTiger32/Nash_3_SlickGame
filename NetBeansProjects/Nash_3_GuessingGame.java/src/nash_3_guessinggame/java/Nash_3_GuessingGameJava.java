/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nash_3_guessinggame.java;
import java.util.Scanner;
import java.util.Random;
public class Nash_3_GuessingGameJava {
       
        static Random number = new Random();
        static boolean itsaboolean = true;
        static Scanner hh = new Scanner(System.in);
        static int score = 0;
        static int lose = 0;
    
     public static void main(String[] args) {
        Name();
        while(itsaboolean == true){
            game();
            if (score == 5){
                System.out.println("You win!");
                itsaboolean = false;
            }
            else if(lose == 5){
                System.out.println("You lose.");
                itsaboolean = false;
            }
            
        }
        
    }
        //playagain = true;
        static void Name(){
        System.out.println("What is your Name?");
        Scanner name = new Scanner(System.in);
        String xx = name.nextLine();
        System.out.println("Hello "+ xx + ", my Name Is ZayZay");
        }
     static void game(){
        int ii = number.nextInt(11);
         
        System.out.println("Pick a number between 1 and 10");
        int a = hh.nextInt();
        
        if (a == ii){
            System.out.println("Correct");
            itsaboolean = false;
            score++;
        }
        else if (a !=ii){
            System.out.println("Incorrect");
            lose++;
            if (a < ii){
                System.out.println("Too Low. Try Again.");
                   
            if ( a > ii){
                System.out.println("Too High. Try Again.");
    }
}
           
}
}
}
