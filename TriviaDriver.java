// Author:                       Zahrea Franklin
// Date Updated:                 Nov 30 2019
// Description:                  This program allows the user to play a trivia game by answering 
//                               questions and getting a total of their correct answers after.

//Trivia Driver (Trivia Game 3 of 3)

import java.util.*;

public class TriviaDriver
{

   public static void main(String[] args) { //main method to run the playGame method
   Scanner input = new Scanner(System.in);
   playGame(input);
   
   } //end main
  

   public static void playGame(Scanner input) { //method for game to run
  
  
   int numOfGames = 0, totalScore = 0;       //keep record of the amount of times the user plays game
                                            //and the total score 
   double avgScore;                        //average of the users scores 
  
   TriviaGame game = new TriviaGame(populateQuestions());
  
   while(true) {                          //loops game until the user chooses no
  
   
   numOfGames++;                          //increments question number
   while(game.askNextQuestion()){}
  
                                          // add to totalScore
   totalScore += game.getScore();
                                          // reset game
   game.restart();
  System.out.println();
   System.out.println("GAME OVER! Would you like to play again? \n(Yes/No):");
   String choice = input.next();
   if(choice.equalsIgnoreCase("No") || !choice.equalsIgnoreCase("Yes")) //if user chooses no end game
                                                                        //if user chooses yes continue
   {
  
   break;
   } //end if
   }//end while
   avgScore = (double) totalScore/numOfGames;                           //calculates the average score
   System.out.println("You played " + numOfGames + " game/(s) and your average score was " + avgScore
   + ". Thank you for playing, have a great day! ☺");                  // display user's stats
   }
  
   
   public static TriviaQuestion[] populateQuestions() {              //creates the questions for the game
  
  
   TriviaQuestion ob1 = new TriviaQuestion               //array of questions for user
   ("This Disney princess is considered a bookworm", "Belle", 1);
  
   TriviaQuestion ob2 = new TriviaQuestion
   ("This Disney princess had a pet Tiger called Rajah","Jasmine",2);
  
   TriviaQuestion ob3 = new TriviaQuestion
   ("This Disney princess' sidekick was a chameleon", "Rapunzel", 2);
  
   TriviaQuestion ob4 = new TriviaQuestion
   ("In the Disney movie Mulan, Mulan's undercover name was ______ ", "Ping", 3);
  
   TriviaQuestion ob5 = new TriviaQuestion
   ("This Disney princess relied on a gourd as her means of transport", "Cinderella", 1);
  
   return new TriviaQuestion[]{ob1, ob2, ob3, ob4, ob5};
   } //end populateQuestions
}//end class