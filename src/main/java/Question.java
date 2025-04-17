import java.util.Scanner;


public class Question {
  public String question;
  public int totalMarks;
  public String answer;
  public String studentAnswer ="";

  public Question(String question, int totalMarks, String answer){
    this.question = question;
    this.totalMarks = totalMarks;
    this.answer = answer;
}

public void AskQuestion(Scanner scanner){
    System.out.println(question + " ("+totalMarks+" marks)");
    System.out.println("Your answer: ");
    studentAnswer = scanner.nextLine();
}
public int CheckAnswer(){
    if (studentAnswer.equals(answer)){
        System.out.println("Correct");
        return totalMarks;
    }
    System.out.println("Incorrect");
    return 0;
    
}
}