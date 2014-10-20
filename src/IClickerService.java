
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