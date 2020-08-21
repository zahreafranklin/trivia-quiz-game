// Author:                       Zahrea Franklin
// Date Updated:                 Nov 30 2019
// Description:                  This program allows the user to play a trivia game by answering 
//                               questions and getting a total of their correct answers after.

//Trivia Question (Trivia Game 1 of 3)
public class TriviaQuestion
{
                                                             //attributes of the class
public String question, answer;
public int value;
  

TriviaQuestion(String question, String answer, int value) { //initializing Triviaquestions using constructor
this.question = question; 
this.answer = answer;
this.value = value;
}
  

public String getQuestion() {                              //method to get a value to store as the question
return this.question;
} //end getQuestion
  
public String getAnswer() {                               //method to get a value to store as an answer
return this.answer;
} //end getAnswer
  
public int getValue() {                                  //method to get the points for each question 
return this.value;
} //end getValue


}//end class