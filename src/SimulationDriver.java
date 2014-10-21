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

public class SimulationDriver {
	
	public static void main(String[] args){
		IClickerService ics = new IClickerService();
		ics.setQuestionType("single");	
		ics.setQuestionType("multiple");
	}
}