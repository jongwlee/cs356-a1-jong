// 
// Name: Lee, Jong 
// Project: #1
// Due: 10/22/14
// Course: CS356-a1 
// 
// Description: 
// We are to build a java based simulation tool based on the iClicker idea.
// The program must configure the question type and candidate answer. There will be
// two types: multiple choice (A,B,C,D) and single choice (True, False).
// We take student submissions and at the end print out the results of the output.
//

public class IClickerService{
	
	public void setQuestionType(String questionType){
		//Configure for multiple choice questions
		if(questionType.equals("multiple")){
			Question multiple_choice = new MultipleChoiceQuestion();
			multiple_choice.configureAnswers();
			multiple_choice.storeStudents();
			multiple_choice.printList();
			multiple_choice.printResults();
		}
		
		//Configure for single choice questions
		else if(questionType.equals("single")){
			Question single_choice = new SingleChoiceQuestion();
			single_choice.configureAnswers();
			single_choice.storeStudents();
			single_choice.printList();
			single_choice.printResults();
		}
	}
}