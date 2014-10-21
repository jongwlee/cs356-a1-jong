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

public class Student {
	
	private String id;
	private String answer;
	
	public Student(String id, String answer){
		this.id = id;
		this.answer = answer;
	}
	
	public String getId(){
		return id;
	}
	
	public void setId(String id){
		this.id = id;
	}
	
	public String getAnswer(){
		return answer;
	}
	
	public void setAnswer(String answer){
		this.answer = answer;
	}
}