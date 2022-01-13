package basics;

public class Classroom {
	
	public static void main(String[] args) {
		Student  abdul = new Student(); //creating a box in the RAM/memory
		Student bStudent = new Student(1,"abhinav");
		Employee someEmployee = new Employee();
		System.out.println(abdul.id);
		bStudent.display();
	}

}
