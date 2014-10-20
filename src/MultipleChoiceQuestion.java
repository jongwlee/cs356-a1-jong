import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;
import java.util.Map.Entry;


public class MultipleChoiceQuestion implements Question {
	HashMap<String,String> student_map = new HashMap<String,String>();
	HashMap<Integer,String> map = new HashMap<Integer,String>();
	ArrayList<Student> student_list = new ArrayList<Student>();
	
	int aCounter, bCounter, cCounter, dCounter;
	
	final String[] multiple_choice_array = {"A","B","C","D"};
	
	//Configure the Answers for multiple choice
	public void configureAnswers(){
		for(int i = 0; i < multiple_choice_array.length; i++){
			map.put(i,multiple_choice_array[i]);
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
		int i = rand.nextInt(4);
		
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
			if(entry.getValue().equals("A")){
				aCounter++;
			}
			else if(entry.getValue().equals("B")){
				bCounter++;
			}
			else if(entry.getValue().equals("C")){
				cCounter++;
			}
			else if(entry.getValue().equals("D")){
				dCounter++;
			}
		}
		
		System.out.println("1. A: " + aCounter + "  2. B: " + bCounter + "  3. C: " + cCounter + "  4. D: " + dCounter );
	}
	
}