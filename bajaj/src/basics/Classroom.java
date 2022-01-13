package basics;

public class Classroom {
	
	public static void main(String[] args) {
		System.out.println("students are from "+ Student.COLLEGE_NAME);
		int agr = Student.calculateAggregate(10, 20);
		Student  abdul = new Student(); //creating a box in the RAM/memory
		Student bStudent = new Student(1,"abhinav");
		Employee someEmployee = new Employee();
		System.out.println(abdul.id);
		bStudent.display();
	}

}
