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

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map.Entry;
import java.util.Random;


public class SingleChoiceQuestion implements Question {
	HashMap<String,String> student_map = new HashMap<String,String>();
	HashMap<Integer,String> map = new HashMap<Integer,String>();
	ArrayList<Student> student_list = new ArrayList<Student>();
	
	int trueCounter, falseCounter;
	
	final String[] single_choice_array = {"True","False"};
	
	//Configure the Answers for multiple choice
	public void configureAnswers(){
		for(int i = 0; i < single_choice_array.length; i++){
			map.put(i,single_choice_array[i]);
		}
	}
	
	//Set Unique_ID of students and their answers
	private void setStudents(){
		for(int i = 0; i < 10; i++){
			student_list.add(new Student(generateRandomString(5), generateAnswer()));
		}
	}
	
	//Call setStudents() to put into arraylist and then place the values onto a hashmap
	public void storeStudents(){
		setStudents();
		for(int i = 0; i < student_list.size(); i++){
			student_map.put(student_list.get(i).getId(), student_list.get(i).getAnswer());
		}
	}
	
	//Generate a random answer
	private String generateAnswer(){
		Random rand = new Random();
		int i = rand.nextInt(2);
		
		String answer = map.get(i);
		
		return answer;
	}
	
	//Generate a unique string id
	private String generateRandomString(int length){
		String alphabet = new String("0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz");
		int number = alphabet.length();
		
		String result = new String();
		Random rand = new Random();
		
		for(int i = 0; i < length; i++){
			result = result + alphabet.charAt(rand.nextInt(number));
		}
		
		return result;
	}

	//Prints the entire list
	public void printList(){
		for(Entry<String, String> entry : student_map.entrySet()){
			System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());
		}
	}
	
	//Prints the submission results
	public void printResults(){
		for(Entry<String, String> entry : student_map.entrySet()){
			if(entry.getValue().equals("True")){
				trueCounter++;
			}
			else if(entry.getValue().equals("False")){
				falseCounter++;
			}
		}
		
		System.out.println("\n" + "1. True: " + trueCounter + "  2. False: " + falseCounter + "\n");
	}
	
}