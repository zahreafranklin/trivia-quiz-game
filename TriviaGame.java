// Author:                       Zahrea Franklin
// Date Updated:                 Nov 30 2019
// Description:                  This program allows the user to play a trivia game by answering 
//                               questions and getting a total of their correct answers after.

//Trivia Game (Trivia Game 2 of 3)


import java.util.*; //for scanner to work

public class TriviaGame
{

public TriviaQuestion questions[];
public int score, questionNum;
  

TriviaGame(TriviaQuestion questions[]) {     //method for questions

this.questions = Arrays.copyOf(questions, questions.length); //array for trvia questions

                                             // initial values
this.score = 0;
this.questionNum = 0;

} //end TriviaQuestions
  
                                          // asks the next question and returns true if question was 
                                         //asked
public boolean askNextQuestion() {
  
                                          
this.questionNum++;                       //increment questionNum as it moves to a next question
  
                                        // return false if it goes pass the number of questions
if(this.questionNum > questions.length)
return false;
                                       //read users input
Scanner input = new Scanner(System.in);
  
// get the next question, answer and points

String question = questions[questionNum-1].getQuestion();      //starts at the beginning of array
String answer = questions[questionNum-1].getAnswer();       
int value = questions[questionNum-1].getValue();
  
// prompt to the user
System.out.println("\nQuestion " + questionNum);         //labels each question with a number
System.out.print("For " + value + " point(s):     ");    // tells user the point of each question
System.out.println(question);
  
                                    
String answer1 = input.nextLine();                      //reads user answer

if(answer1.equalsIgnoreCase(answer)) {                  //compares correct answer with user input
  
System.out.println("That is correct!");                //display correct message if match
this.score += value;
}
else
System.out.println("Wrong. The correct answer is "+ "\"" +answer+"\""); //display incorrect message
  
                           
showScore();                                          //print score of user              
return true;
}
  
                                                     // method to print score
public void showScore() {
System.out.println(" Your score is " + this.score +" ");
}
  

public void restart() {                             //restart game if user chooses to
  
this.score = 0;
this.questionNum = 0;
}
  
                                                   // accessor to get score
public int getScore() {
return this.score;
}
}

