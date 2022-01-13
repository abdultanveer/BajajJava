package basics;

/**
 * box type is student
 * box has 4 partitions ie id,name
 * this is like a piece of paper with instructions written on it
 * @author Admin
 *
 */
public class Student {
	int id;
	String name;
	boolean isMale;
	float stipend;
	static String COLLEGE_NAME = "IIT";
	
	Student(){
		System.out.println("priyansh:-- abdul im about to construct the box");
		id =0;
		name = "ansari";
		
	}
	
	Student(int i, String nam){
		id = i;
		name = nam;
	}
	
	void display(){
		System.out.println("name is"+ name+" stipend is "+stipend);
	}
	
	static int calculateAggregate(int a, int b) {
		return a+b/2;
	}

}
